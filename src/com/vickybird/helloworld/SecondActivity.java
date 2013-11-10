package com.vickybird.helloworld;

// Generic Android imports
import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

// Imports for loading an image
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.widget.ImageView;
import java.io.InputStream;
import java.lang.Exception;
import java.net.URL;

public class SecondActivity extends Activity
{

    private static final String IMAGE_URL = "http://i2.kym-cdn.com/photos/images/original/000/234/739/fa5.jpg";

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        ImageView imageView = (ImageView) findViewById(R.id.image);

        new DownloadImageTask(imageView).execute(IMAGE_URL);
    }

    /** 
    * Task to download an image from the internet and display in the given ImageView
    */
    private class DownloadImageTask extends AsyncTask<String, Void, Bitmap> {
        ImageView bmImage;

        public DownloadImageTask(ImageView bmImage) {
            this.bmImage = bmImage;
        }

        protected Bitmap doInBackground(String... urls) {
            String urldisplay = urls[0];
            Bitmap mIcon11 = null;
            try {
                InputStream in = new URL(urldisplay).openStream();
                mIcon11 = BitmapFactory.decodeStream(in);
            } catch (Exception e) {
                //Log.e("Error", e.getMessage());
                e.printStackTrace();
            }
            return mIcon11;
        }

        protected void onPostExecute(Bitmap result) {
            bmImage.setImageBitmap(result);
        }
    }
}