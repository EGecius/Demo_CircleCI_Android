package com.egecius.demo_circleci_android;

import android.app.Application;
import android.test.ApplicationTestCase;
import android.test.suitebuilder.annotation.MediumTest;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class ApplicationTest extends ApplicationTestCase<Application> {

	public ApplicationTest() {
		super(Application.class);
	}

//	@MediumTest
//	public void testFailing() {
//		assertEquals(false, true);
//	}

	@MediumTest
	public void testPassing() {
		assertEquals(true, true);
	}
}