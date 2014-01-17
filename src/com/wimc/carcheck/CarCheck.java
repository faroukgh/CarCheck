package com.wimc.carcheck;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CarCheck extends Activity {
//declaring controls
EditText carnum;
Button search;
Button clear;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		//setting layout content
		setContentView(R.layout.carpage);
		//adding controls to activity
		carnum = (EditText) findViewById(R.id.car_number);
		search = (Button) findViewById(R.id.search);
		clear = (Button) findViewById(R.id.clearscreen);
		
		
		
		
		
		
		
		
		
		//method for clicking the buttons
	search.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			EditText carnum = (EditText) findViewById(R.id.car_number);
			//when edit text box is empty
			if (carnum.getText().length() == 0)
		     {
				Toast.makeText(CarCheck.this, "Enter a car number", Toast.LENGTH_SHORT).show();
		     }
//			if((carnum.getText().equals(".*[A-Za-z0-9-\\+].*")==true) || 
//					(carnum.getText().equals(".*[a-zA-Z0-9a-zA-Z].*")==true))
//			{
//				Toast.makeText(CarCheck.this, "NOTICE: Valid car number", Toast.LENGTH_SHORT).show();	
//			}
			else
			{
				Intent in = new Intent(CarCheck.this, Summarypage.class);
				//in.putExtras(database);
				startActivity(in);
			}
	
    
    }
	});
clear.setOnClickListener(new OnClickListener() {
	
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		carnum.setText("");
	}
});
		
}
	}
	