package com.example.egidijusgecius.playerimpl;

import android.app.Activity;
import android.os.Bundle;

/** library Activity */
public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}

	void failingMethod() {
		String nullString = null;
		nullString.isEmpty();
	}
}
