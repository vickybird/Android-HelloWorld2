package com.vickybird.helloworld;

import android.content.Intent;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class BackgroundChangerActivity extends Activity
{
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.background_changer);
    }

    public void onCancelClick(View view)
    {
    	finish();
    }
}