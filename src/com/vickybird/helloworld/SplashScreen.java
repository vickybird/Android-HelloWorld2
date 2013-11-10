package com.vickybird.helloworld;

import android.content.Intent;
import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreen extends Activity
{

	private static int TIMEOUT = 2500;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

		new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // This method will be executed once the timer is over
                // Start your app main activity
                Intent intent = new Intent(SplashScreen.this, MainActivity.class);
                startActivity(intent);
 
                // close this activity
                finish();
            }
        }, TIMEOUT);
    }


}