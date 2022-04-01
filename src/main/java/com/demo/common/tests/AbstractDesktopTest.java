package com.demo.common.tests;

import java.io.IOException;

import com.ch.test.AbstractTest;
import com.demo.common.utils.CommonUtils;

public class AbstractDesktopTest extends AbstractTest {
	
	public void testSetup() throws IOException {
		CommonUtils.desktopView();
		CommonUtils.loadAUTUrl();
		CommonUtils.closePopup();

	}
}
