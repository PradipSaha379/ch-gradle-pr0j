package com.demo.desktoppages;

import java.time.Duration;

import com.ch.excelutils.ExcelBean;
import com.ch.excelutils.ExcelProperty;
import com.ch.reports.FrameworkException;
import com.ch.utils.SeleniumUtils;
import com.demo.common.utils.ModuleNames;
import com.demo.common.utils.ObjectConstants;

public class GlobalPage {

	/**
	 * Checks if is top navigation displayed in Home page
	 *
	 * @return true, if is top navigation displayed
	 * @throws FrameworkException
	 */
	public boolean isTopNavigationDisplayed() throws FrameworkException {
		ExcelBean element1 = ExcelProperty.getElementValue(ModuleNames.M_GLOBAL, ObjectConstants.NEW_CATEGORY);
		SeleniumUtils.waitUntilVisibilityOfElement(element1, 3);
		ExcelBean element2 = ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.HANDBAGS_CATEGORY);
		SeleniumUtils.waitUntilElementToBeSelectedWithFluentWait(element2, Duration.ofSeconds(3), Duration.ofSeconds(1));
		ExcelBean element3 = ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.CLOTHING_CATEGORY);
		ExcelBean element4 = ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.SHOES_CATEGORY);
		ExcelBean element5 = ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.JEWELRY_CATEGORY);
		ExcelBean element6 = ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.ACCESSORIES_CATEGORY);
		ExcelBean element8 = ExcelProperty.getElementValue(ModuleNames.GLOBAL,
				ObjectConstants.PERSONALIZATION_CATEGORY);
		ExcelBean element9 = ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.HOME_CATEGORY);
		ExcelBean element10 = ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.GIFTS_CATEGORY);
		ExcelBean element11 = ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.SALE_CATEGORY);

		boolean flag = false;

		flag = SeleniumUtils.iSDisplayed(element1, 3);
		flag = SeleniumUtils.iSDisplayed(element2, 4) && flag;
		flag = SeleniumUtils.iSDisplayed(element3, 4) && flag;
		flag = SeleniumUtils.iSDisplayed(element4, 3) && flag;
		flag = SeleniumUtils.iSDisplayed(element5, 4) && flag;
		flag = SeleniumUtils.iSDisplayed(element6, 2) && flag;
		flag = SeleniumUtils.iSDisplayed(element8, 2) && flag;
		flag = SeleniumUtils.iSDisplayed(element9, 1) && flag;
		flag = SeleniumUtils.iSDisplayed(element10, 2) && flag;
		flag = SeleniumUtils.iSDisplayed(element11, 2) && flag;
		return flag;
	}

}
