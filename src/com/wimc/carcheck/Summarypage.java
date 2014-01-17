package com.wimc.carcheck;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class Summarypage extends Activity {
TextView make;
TextView engineSize;
TextView owners;
TextView vehicleUsage;
TextView firstReg;
TextView insuranceExp;
TextView registrationExp;


	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.summarypage);
		make = (TextView) findViewById(R.id.make);
		engineSize = (TextView) findViewById(R.id.engineSize);
		owners = (TextView) findViewById(R.id.owners);
		vehicleUsage = (TextView) findViewById(R.id.vehicleUsage);
		firstReg = (TextView) findViewById(R.id.firstReg);
		insuranceExp = (TextView) findViewById(R.id.insuranceExp);
		registrationExp = (TextView) findViewById(R.id.registrationExp);
		
		
	}
}
