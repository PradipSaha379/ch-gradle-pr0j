package com.demo.common.tests;

import java.io.IOException;

import com.ch.test.AbstractTest;
import com.demo.common.utils.CommonUtils;

public class AbstractMobileTest extends AbstractTest {
	

	public void testSetup() throws IOException {
		CommonUtils.mobileView();
		CommonUtils.loadAUTUrl();
	}

}
