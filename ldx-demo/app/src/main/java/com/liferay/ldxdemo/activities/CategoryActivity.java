package com.liferay.ldxdemo.activities;

import android.content.Intent;
import android.os.Bundle;

import com.liferay.ldxdemo.R;
import com.liferay.ldxdemo.beacon.BeaconReceiver;

/**
 * @author dipenp
 */
public class CategoryActivity extends NavDrawerActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		/**
		 * Adding our layout to parent class frame layout.
		 */
		getLayoutInflater().inflate(R.layout.activity_category, frameLayout);

		/**
		 * Setting title and itemChecked
		 */
		mDrawerList.setItemChecked(position, true);
		setTitle(R.string.title_section1);
//		setTitle(listArray[position]);
	}

	@Override
	protected void onPostCreate(Bundle savedInstanceState) {
		super.onPostCreate(savedInstanceState);
		// Sync the toggle state after onRestoreInstanceState has occurred.
		startActivity(new Intent(this, BeaconReceiver.class));
	}
}
