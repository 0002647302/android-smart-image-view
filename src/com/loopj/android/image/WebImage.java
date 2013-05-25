package com.loopj.android.image;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

public class WebImage implements SmartImage {
    private static final int CONNECT_TIMEOUT = 5000;
    private static final int READ_TIMEOUT = 10000;

    private static WebImageCache webImageCache;

    private String url;
    private String userAgent;
    private String username;
    private String password;

    public WebImage(String url, String username, String password, String userAgent) {
        this.url = url;
        this.userAgent = userAgent;
        this.username = username;
        this.password = password;
    }

    public Bitmap getBitmap(Context context) {
        // Don't leak context
        if(webImageCache == null) {
            webImageCache = new WebImageCache(context);
        }

        // Try getting bitmap from cache first
        Bitmap bitmap = null;
        if(url != null) {
            bitmap = webImageCache.get(url);
            if(bitmap == null) {
                bitmap = getBitmapFromUrl(url, username, password, userAgent);
                if(bitmap != null){
                    webImageCache.put(url, bitmap);
                }
            }
        }

        return bitmap;
    }

    private Bitmap getBitmapFromUrl(String url, String username, String password, String userAgent) {
        Bitmap bitmap = null;

        try {
            URLConnection conn = new URL(url).openConnection();
            if (userAgent != null) {
    			conn.setRequestProperty("User-Agent", userAgent);
    		}
    		if (username != null && password != null) {
    			conn.setRequestProperty("Authorization", "basic " + Base64.encodeBytes((username + ":" + password).getBytes()));
    		}
            conn.setConnectTimeout(CONNECT_TIMEOUT);
            conn.setReadTimeout(READ_TIMEOUT);
            bitmap = BitmapFactory.decodeStream((InputStream) conn.getContent());
        } catch(Exception e) {
            e.printStackTrace();
        }

        return bitmap;
    }

    public static void removeFromCache(String url) {
        if(webImageCache != null) {
            webImageCache.remove(url);
        }
    }
}
