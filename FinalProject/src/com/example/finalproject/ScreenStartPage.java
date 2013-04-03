package com.example.finalproject;

import com.example.finalproject.R;
import com.example.finalproject.R.id;
import com.example.finalproject.R.layout;
import com.example.finalproject.passenger.JoinRide;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

public class ScreenStartPage extends Activity implements OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.screen_start_page);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.bJoinRide:
			Intent intent = new Intent(this, JoinRide.class );
			startActivity(intent);
			break;
		case R.id.bInviteToRide:

			break;
		case R.id.bExistingRideStatus:

			break;

		}

	}

}
