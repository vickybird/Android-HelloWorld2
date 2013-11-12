package com.vickybird.helloworld;

import android.content.Intent;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.graphics.Color;
import android.widget.EditText;
import android.widget.LinearLayout;
import java.lang.Integer;
import java.lang.NumberFormatException;

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

    public void onPreviewClick(View view)
    {
    	String redText = ((EditText) findViewById(R.id.red_value)).getText().toString();
    	String greenText = ((EditText) findViewById(R.id.green_value)).getText().toString();
    	String blueText = ((EditText) findViewById(R.id.blue_value)).getText().toString();

    	int redValue = parseInt(redText);
    	int greenValue = parseInt(greenText);
    	int blueValue = parseInt(blueText);

    	LinearLayout mainView = (LinearLayout) findViewById(R.id.background_changer_main);
    	mainView.setBackgroundColor(Color.rgb(redValue, greenValue, blueValue));
    }

    private int parseInt(String number)
    {
    	try
    	{
    		return Integer.parseInt(number);
    	}
    	catch (NumberFormatException e)
    	{
    		// TODO: some kind of handling here
    		return 0;
    	}
    }

    public void onSaveClick(View view)
    {
    	
    }
}