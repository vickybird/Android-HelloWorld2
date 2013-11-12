package com.vickybird.helloworld;

import android.content.Intent;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

    public void onImageGetterButtonClick(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }

    public void onBgChangerButtonClick(View view) {
        Intent intent = new Intent(this, BackgroundChangerActivity.class);
        startActivity(intent);
    }
}
