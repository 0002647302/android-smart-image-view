package com.loopj.android.image;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;

public class SmartImageView extends ImageView {
    private static final int LOADING_THREADS = 4;
    private static ExecutorService threadPool = Executors.newFixedThreadPool(LOADING_THREADS);

    private SmartImageTask currentTask;


    public SmartImageView(Context context) {
        super(context);
    }

    public SmartImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public SmartImageView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    // Helpers to set image by URL without credentials
    public void setImageUrl(String url, Integer scale) {
        setImage(new WebImage(url, scale, null, null, null));
    }

    public void setImageUrl(String url, Integer scale, SmartImageTask.OnCompleteListener completeListener) {
        setImage(new WebImage(url, scale, null, null, null), completeListener);
    }

    public void setImageUrl(String url, Integer scale, final Integer fallbackResource) {
        setImage(new WebImage(url, scale, null, null, null), fallbackResource);
    }

    public void setImageUrl(String url, Integer scale, final Integer fallbackResource, SmartImageTask.OnCompleteListener completeListener) {
        setImage(new WebImage(url, scale, null, null, null), fallbackResource, completeListener);
    }

    public void setImageUrl(String url, Integer scale, final Integer fallbackResource, final Integer loadingResource) {
        setImage(new WebImage(url, scale, null, null, null), fallbackResource, loadingResource);
    }

    public void setImageUrl(String url, Integer scale, final Integer fallbackResource, final Integer loadingResource, SmartImageTask.OnCompleteListener completeListener) {
        setImage(new WebImage(url, scale, null, null, null), fallbackResource, null, loadingResource, completeListener);
    }
    
    public void setImageUrl(String url, Integer scale, final Drawable fallbackDrawable) {
    	setImage(new WebImage(url, scale, null, null, null), fallbackDrawable);
    }
    
    public void setImageUrl(String url, Integer scale, final Drawable fallbackDrawable, SmartImageTask.OnCompleteListener completeListener) {
    	setImage(new WebImage(url, scale, null, null, null), fallbackDrawable, completeListener);
    }

    // Helpers to set image by URL with all credentials
    public void setImageUrl(String url, Integer scale, String username, String password, String userAgent) {
        setImage(new WebImage(url, scale, username, password, userAgent));
    }

    public void setImageUrl(String url, Integer scale, String username, String password, String userAgent, SmartImageTask.OnCompleteListener completeListener) {
        setImage(new WebImage(url, scale, username, password, userAgent), completeListener);
    }

    public void setImageUrl(String url, Integer scale, String username, String password, String userAgent, final Integer fallbackResource) {
        setImage(new WebImage(url, scale, username, password, userAgent), fallbackResource);
    }

    public void setImageUrl(String url, Integer scale, String username, String password, String userAgent, final Integer fallbackResource, SmartImageTask.OnCompleteListener completeListener) {
        setImage(new WebImage(url, scale, username, password, userAgent), fallbackResource, completeListener);
    }

    public void setImageUrl(String url, Integer scale, String username, String password, String userAgent, final Integer fallbackResource, final Integer loadingResource) {
        setImage(new WebImage(url, scale, username, password, userAgent), fallbackResource, loadingResource);
    }

    public void setImageUrl(String url, Integer scale, String username, String password, String userAgent, final Integer fallbackResource, final Integer loadingResource, SmartImageTask.OnCompleteListener completeListener) {
        setImage(new WebImage(url, scale, username, password, userAgent), fallbackResource, null, loadingResource, completeListener);
    }
    
    public void setImageUrl(String url, Integer scale, String username, String password, String userAgent, final Drawable fallbackDrawable) {
    	setImage(new WebImage(url, scale, username, password, userAgent), fallbackDrawable);
    }
    
    public void setImageUrl(String url, Integer scale, String username, String password, String userAgent, final Drawable fallbackDrawable, SmartImageTask.OnCompleteListener completeListener) {
    	setImage(new WebImage(url, scale, username, password, userAgent), fallbackDrawable, completeListener);
    }
    
    // Helpers to set image by URL with only login credentials
    public void setImageUrl(String url, Integer scale, String username, String password) {
        setImage(new WebImage(url, scale, username, password, null));
    }

    public void setImageUrl(String url, Integer scale, String username, String password, SmartImageTask.OnCompleteListener completeListener) {
        setImage(new WebImage(url, scale, username, password, null), completeListener);
    }

    public void setImageUrl(String url, Integer scale, String username, String password, final Integer fallbackResource) {
        setImage(new WebImage(url, scale, username, password, null), fallbackResource);
    }

    public void setImageUrl(String url, Integer scale, String username, String password, final Integer fallbackResource, SmartImageTask.OnCompleteListener completeListener) {
        setImage(new WebImage(url, scale, username, password, null), fallbackResource, completeListener);
    }

    public void setImageUrl(String url, Integer scale, String username, String password, final Integer fallbackResource, final Integer loadingResource) {
        setImage(new WebImage(url, scale, username, password, null), fallbackResource, loadingResource);
    }

    public void setImageUrl(String url, Integer scale, String username, String password, final Integer fallbackResource, final Integer loadingResource, SmartImageTask.OnCompleteListener completeListener) {
        setImage(new WebImage(url, scale, username, password, null), fallbackResource, null, loadingResource, completeListener);
    }
    
    public void setImageUrl(String url, Integer scale, String username, String password, final Drawable fallbackDrawable) {
    	setImage(new WebImage(url, scale, username, password, null), fallbackDrawable);
    }
    
    public void setImageUrl(String url, Integer scale, String username, String password, final Drawable fallbackDrawable, SmartImageTask.OnCompleteListener completeListener) {
    	setImage(new WebImage(url, scale, username, password, null), fallbackDrawable, completeListener);
    }
    
    // Helpers to set image by URL with only the userAgent parameter
    public void setImageUrl(String url, Integer scale, String userAgent) {
        setImage(new WebImage(url, scale, null, null, userAgent));
    }

    public void setImageUrl(String url, Integer scale, String userAgent, SmartImageTask.OnCompleteListener completeListener) {
        setImage(new WebImage(url, scale, null, null, userAgent), completeListener);
    }

    public void setImageUrl(String url, Integer scale, String userAgent, final Integer fallbackResource) {
        setImage(new WebImage(url, scale, null, null, userAgent), fallbackResource);
    }

    public void setImageUrl(String url, Integer scale, String userAgent, final Integer fallbackResource, SmartImageTask.OnCompleteListener completeListener) {
        setImage(new WebImage(url, scale, null, null, userAgent), fallbackResource, completeListener);
    }

    public void setImageUrl(String url, Integer scale, String userAgent, final Integer fallbackResource, final Integer loadingResource) {
        setImage(new WebImage(url, scale, null, null, userAgent), fallbackResource, loadingResource);
    }

    public void setImageUrl(String url, Integer scale, String userAgent, final Integer fallbackResource, final Integer loadingResource, SmartImageTask.OnCompleteListener completeListener) {
        setImage(new WebImage(url, scale, null, null, userAgent), fallbackResource, null, loadingResource, completeListener);
    }
    
    public void setImageUrl(String url, Integer scale, String userAgent, final Drawable fallbackDrawable) {
    	setImage(new WebImage(url, scale, null, null, userAgent), fallbackDrawable);
    }
    
    public void setImageUrl(String url, Integer scale, String userAgent, final Drawable fallbackDrawable, SmartImageTask.OnCompleteListener completeListener) {
    	setImage(new WebImage(url, scale, null, null, userAgent), fallbackDrawable, completeListener);
    }


    // Helpers to set image by contact address book id
    public void setImageContact(long contactId) {
        setImage(new ContactImage(contactId));
    }

    public void setImageContact(long contactId, final Integer fallbackResource) {
        setImage(new ContactImage(contactId), fallbackResource);
    }

    public void setImageContact(long contactId, final Integer fallbackResource, final Integer loadingResource) {
        setImage(new ContactImage(contactId), fallbackResource, fallbackResource);
    }


    // Set image using SmartImage object
    public void setImage(final SmartImage image) {
        setImage(image, null, null, null, null);
    }

    public void setImage(final SmartImage image, final SmartImageTask.OnCompleteListener completeListener) {
        setImage(image, null, null, null, completeListener);
    }

    public void setImage(final SmartImage image, final Integer fallbackResource) {
        setImage(image, fallbackResource, null, fallbackResource, null);
    }

    public void setImage(final SmartImage image, final Integer fallbackResource, SmartImageTask.OnCompleteListener completeListener) {
        setImage(image, fallbackResource, null, fallbackResource, completeListener);
    }

    public void setImage(final SmartImage image, final Integer fallbackResource, final Integer loadingResource) {
        setImage(image, fallbackResource, null, loadingResource, null);
    }
    
    public void setImage(final SmartImage image, final Drawable fallbackDrawable) {
        setImage(image, null, fallbackDrawable, null, null);
    }
    
    public void setImage(final SmartImage image, final Drawable fallbackDrawable, SmartImageTask.OnCompleteListener completeListener) {
        setImage(image, null, fallbackDrawable, null, completeListener);
    }

    public void setImage(final SmartImage image, final Integer fallbackResource, final Drawable fallbackDrawable, final Integer loadingResource, final SmartImageTask.OnCompleteListener completeListener) {
        // Set a loading resource
    	if(fallbackDrawable != null){
        	setImageDrawable(fallbackDrawable);
        } else if(loadingResource != null){
            setImageResource(loadingResource);
        }

        // Cancel any existing tasks for this image view
        if(currentTask != null) {
            currentTask.cancel();
            currentTask = null;
        }

        // Set up the new task
        currentTask = new SmartImageTask(getContext(), image);
        currentTask.setOnCompleteHandler(new SmartImageTask.OnCompleteHandler() {
            @Override
            public void onComplete(Bitmap bitmap) {
                if(bitmap != null) {
                    setImageBitmap(bitmap);
                } else {
                    // Set fallback resource
                	if(fallbackDrawable != null){
                    	setImageDrawable(fallbackDrawable);
                    } else if(fallbackResource != null) {
                        setImageResource(fallbackResource);
                    }
                }

                if(completeListener != null){
                    completeListener.onComplete();
                }
            }
        });

        // Run the task in a threadpool
        threadPool.execute(currentTask);
    }

    public static void cancelAllTasks() {
        threadPool.shutdownNow();
        threadPool = Executors.newFixedThreadPool(LOADING_THREADS);
    }
}