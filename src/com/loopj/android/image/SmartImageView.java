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
    public void setImageUrl(String url) {
        setImage(new WebImage(url, null, null, null));
    }

    public void setImageUrl(String url, SmartImageTask.OnCompleteListener completeListener) {
        setImage(new WebImage(url, null, null, null), completeListener);
    }

    public void setImageUrl(String url, final Integer fallbackResource) {
        setImage(new WebImage(url, null, null, null), fallbackResource);
    }

    public void setImageUrl(String url, final Integer fallbackResource, SmartImageTask.OnCompleteListener completeListener) {
        setImage(new WebImage(url, null, null, null), fallbackResource, completeListener);
    }

    public void setImageUrl(String url, final Integer fallbackResource, final Integer loadingResource) {
        setImage(new WebImage(url, null, null, null), fallbackResource, loadingResource);
    }

    public void setImageUrl(String url, final Integer fallbackResource, final Integer loadingResource, SmartImageTask.OnCompleteListener completeListener) {
        setImage(new WebImage(url, null, null, null), fallbackResource, null, loadingResource, completeListener);
    }
    
    public void setImageUrl(String url, final Drawable loadingDrawable) {
    	setImage(new WebImage(url, null, null, null), loadingDrawable);
    }
    
    public void setImageUrl(String url, final Drawable loadingDrawable, SmartImageTask.OnCompleteListener completeListener) {
    	setImage(new WebImage(url, null, null, null), loadingDrawable, completeListener);
    }

    // Helpers to set image by URL with all credentials
    public void setImageUrl(String url, String username, String password, String userAgent) {
        setImage(new WebImage(url, username, password, userAgent));
    }

    public void setImageUrl(String url, String username, String password, String userAgent, SmartImageTask.OnCompleteListener completeListener) {
        setImage(new WebImage(url, username, password, userAgent), completeListener);
    }

    public void setImageUrl(String url, String username, String password, String userAgent, final Integer fallbackResource) {
        setImage(new WebImage(url, username, password, userAgent), fallbackResource);
    }

    public void setImageUrl(String url, String username, String password, String userAgent, final Integer fallbackResource, SmartImageTask.OnCompleteListener completeListener) {
        setImage(new WebImage(url, username, password, userAgent), fallbackResource, completeListener);
    }

    public void setImageUrl(String url, String username, String password, String userAgent, final Integer fallbackResource, final Integer loadingResource) {
        setImage(new WebImage(url, username, password, userAgent), fallbackResource, loadingResource);
    }

    public void setImageUrl(String url, String username, String password, String userAgent, final Integer fallbackResource, final Integer loadingResource, SmartImageTask.OnCompleteListener completeListener) {
        setImage(new WebImage(url, username, password, userAgent), fallbackResource, null, loadingResource, completeListener);
    }
    
    public void setImageUrl(String url, String username, String password, String userAgent, final Drawable loadingDrawable) {
    	setImage(new WebImage(url, username, password, userAgent), loadingDrawable);
    }
    
    public void setImageUrl(String url, String username, String password, String userAgent, final Drawable loadingDrawable, SmartImageTask.OnCompleteListener completeListener) {
    	setImage(new WebImage(url, username, password, userAgent), loadingDrawable, completeListener);
    }
    
    // Helpers to set image by URL with only login credentials
    public void setImageUrl(String url, String username, String password) {
        setImage(new WebImage(url, username, password, null));
    }

    public void setImageUrl(String url, String username, String password, SmartImageTask.OnCompleteListener completeListener) {
        setImage(new WebImage(url, username, password, null), completeListener);
    }

    public void setImageUrl(String url, String username, String password, final Integer fallbackResource) {
        setImage(new WebImage(url, username, password, null), fallbackResource);
    }

    public void setImageUrl(String url, String username, String password, final Integer fallbackResource, SmartImageTask.OnCompleteListener completeListener) {
        setImage(new WebImage(url, username, password, null), fallbackResource, completeListener);
    }

    public void setImageUrl(String url, String username, String password, final Integer fallbackResource, final Integer loadingResource) {
        setImage(new WebImage(url, username, password, null), fallbackResource, loadingResource);
    }

    public void setImageUrl(String url, String username, String password, final Integer fallbackResource, final Integer loadingResource, SmartImageTask.OnCompleteListener completeListener) {
        setImage(new WebImage(url, username, password, null), fallbackResource, null, loadingResource, completeListener);
    }
    
    public void setImageUrl(String url, String username, String password, final Drawable loadingDrawable) {
    	setImage(new WebImage(url, username, password, null), loadingDrawable);
    }
    
    public void setImageUrl(String url, String username, String password, final Drawable loadingDrawable, SmartImageTask.OnCompleteListener completeListener) {
    	setImage(new WebImage(url, username, password, null), loadingDrawable, completeListener);
    }
    
    
    // Helpers to set image by URL with only the userAgent parameter
    public void setImageUrl(String url, String userAgent) {
        setImage(new WebImage(url, null, null, userAgent));
    }

    public void setImageUrl(String url, String userAgent, SmartImageTask.OnCompleteListener completeListener) {
        setImage(new WebImage(url, null, null, userAgent), completeListener);
    }

    public void setImageUrl(String url, String userAgent, final Integer fallbackResource) {
        setImage(new WebImage(url, null, null, userAgent), fallbackResource);
    }

    public void setImageUrl(String url, String userAgent, final Integer fallbackResource, SmartImageTask.OnCompleteListener completeListener) {
        setImage(new WebImage(url, null, null, userAgent), fallbackResource, completeListener);
    }

    public void setImageUrl(String url, String userAgent, final Integer fallbackResource, final Integer loadingResource) {
        setImage(new WebImage(url, null, null, userAgent), fallbackResource, loadingResource);
    }

    public void setImageUrl(String url, String userAgent, final Integer fallbackResource, final Integer loadingResource, SmartImageTask.OnCompleteListener completeListener) {
        setImage(new WebImage(url, null, null, userAgent), fallbackResource, null, loadingResource, completeListener);
    }
    
    public void setImageUrl(String url, String userAgent, final Drawable loadingDrawable) {
    	setImage(new WebImage(url, null, null, userAgent), loadingDrawable);
    }
    
    public void setImageUrl(String url, String userAgent, final Drawable loadingDrawable, SmartImageTask.OnCompleteListener completeListener) {
    	setImage(new WebImage(url, null, null, userAgent), loadingDrawable, completeListener);
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
    
    public void setImage(final SmartImage image, final Drawable loadingDrawable) {
        setImage(image, null, loadingDrawable, null, null);
    }
    
    public void setImage(final SmartImage image, final Drawable loadingDrawable, SmartImageTask.OnCompleteListener completeListener) {
        setImage(image, null, loadingDrawable, null, completeListener);
    }

    public void setImage(final SmartImage image, final Integer fallbackResource, final Drawable loadingDrawable, final Integer loadingResource, final SmartImageTask.OnCompleteListener completeListener) {
        // Set a loading resource
        if(loadingResource != null){
            setImageResource(loadingResource);
        }
        
        if(loadingDrawable != null){
        	setImageDrawable(loadingDrawable);
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
                    if(fallbackResource != null) {
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