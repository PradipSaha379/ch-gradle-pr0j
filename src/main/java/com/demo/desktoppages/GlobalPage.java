package com.demo.desktoppages;

import org.openqa.selenium.Keys;

import com.ch.excelutils.ExcelBean;
import com.ch.excelutils.ExcelProperty;
import com.ch.utils.PropertyUtil;
import com.ch.utils.SeleniumUtils;
import com.demo.common.utils.ModuleNames;
import com.demo.common.utils.ObjectConstants;


public class GlobalPage
{

    /**
     * Checks if is top navigation displayed in Home page
     *
     * @return true, if is top navigation displayed
     */
    public  boolean isTopNavigationDisplayed()
    {
        ExcelBean element1 = ExcelProperty.getElementValue(ModuleNames.M_GLOBAL, ObjectConstants.NEW_CATEGORY);
        ExcelBean element2 = ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.HANDBAGS_CATEGORY);
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
        try
        {

            flag = SeleniumUtils.iSDisplayed(element1);
            flag = SeleniumUtils.iSDisplayed(element2) && flag;
            flag = SeleniumUtils.iSDisplayed(element3) && flag;
            flag = SeleniumUtils.iSDisplayed(element4) && flag;
            flag = SeleniumUtils.iSDisplayed(element5) && flag;
            flag = SeleniumUtils.iSDisplayed(element6) && flag;
            // flag = SeleniumUtils.iSDisplayed(element7);
            flag = SeleniumUtils.iSDisplayed(element8) && flag;
            flag = SeleniumUtils.iSDisplayed(element9) && flag;
            flag = SeleniumUtils.iSDisplayed(element10) && flag;
            flag = SeleniumUtils.iSDisplayed(element11) && flag;

        } catch (Exception e)
        {
            e.printStackTrace();
        }

        return flag;
    }

    /**
     * Click need help link in Footer section.
     */
    public  void clickNeedHelpLink()
    {

        SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.NEED_HELP_LINK));

    }

    /**
     * Click track your order link in Footer section.
     */
    public  void clickTrackYourOrderLink()
    {

        SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.TRACK_YOUR_ORDER));

    }

    /**
     * Checks if is track your order page displayed in Footer section.
     *
     * @return true, if is track your order page displayed
     */
    public  boolean isTrackYourOrderPageDisplayed()
    {
        ExcelBean element1 = ExcelProperty.getElementValue(ModuleNames.GLOBAL,
                ObjectConstants.TRACK_YOUR_ORDER_EMAIL_BOX);
        ExcelBean element2 = ExcelProperty.getElementValue(ModuleNames.GLOBAL,
                ObjectConstants.TRACK_YOUR_ORDER_PASSWORD_BOX);
        ExcelBean element3 = ExcelProperty.getElementValue(ModuleNames.GLOBAL,
                ObjectConstants.TRACK_YOUR_ORDER_SIGN_IN);
        ExcelBean element4 = ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.TRACK_YOUR_ORDER_NUMBER);
        ExcelBean element5 = ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.TRACK_YOUR_ORDER_EMAIL);
        ExcelBean element6 = ExcelProperty.getElementValue(ModuleNames.GLOBAL,
                ObjectConstants.TRACK_YOUR_ORDER_BILLING_ZIPCODE);
        ExcelBean element7 = ExcelProperty.getElementValue(ModuleNames.GLOBAL,
                ObjectConstants.TRACK_YOUR_ORDER_CHECK_STATUS);

        boolean flag = false;
        try
        {

            flag = SeleniumUtils.iSDisplayed(element1);
            flag = SeleniumUtils.iSDisplayed(element2);
            flag = SeleniumUtils.iSDisplayed(element3);
            flag = SeleniumUtils.iSDisplayed(element4);
            flag = SeleniumUtils.iSDisplayed(element5);
            flag = SeleniumUtils.iSDisplayed(element6);
            flag = SeleniumUtils.iSDisplayed(element7);

        } catch (Exception e)
        {
            e.printStackTrace();
        }

        return flag;
    }

    /**
     * Click color filter link in search results.
     */
    public  void clickColorFilterLinkInSearchResults()
    {
        SeleniumUtils.javaScriptClick(
                ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.PLP_FILTER_COLOR_BLACK), 200);

    }

    /**
     * Click size filter link in search results.
     */
    public  void clickSizeFilterLinkInSearchResults()
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.PLP_FILTER_SIZE_XS));

    }

    /**
     * Enter email address mail subscription in Footer section.
     */
    public  void enterEmailAddressMailSubsc()
    {
        SeleniumUtils.sendKeys(
                ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.MAIL_SUBSCRIPTION_EMAIL),
                Math.random() + "CHKATESPADETEST1@GMAIL.COM");

    }

    /**
     * Enter zipcode mail subsc in Footer section.
     */
    public  void enterZipcodeMailSubsc()
    {
        SeleniumUtils.sendKeys(
                ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.MAIL_SUBSCRIPTION_ZIPCODE), "98101");

    }

    /**
     * Click join button in Footer section.
     */
    public  void clickJoinButton()
    {
        SeleniumUtils
                .click(ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.MAIL_SUBSCRIPTION_JOIN_BTN));

    }

    /**
     * Checks if is thank you message displayed after clicking on join button.
     *
     * @return true, if is thank you message
     */
    public  boolean isThankYouMessage()
    {
        ExcelBean element1 = ExcelProperty.getElementValue(ModuleNames.GLOBAL,
                ObjectConstants.MAIL_SUBSCRIPTION_THANK_YOU_MSG);

        boolean flag = false;
        try
        {

            flag = SeleniumUtils.iSDisplayed(element1);

        } catch (Exception e)
        {
            e.printStackTrace();
        }

        return flag;
    }

    /**
     * Click on search link in Home page.
     */
    public  void clickOnSearchLink()
    {
        try
        { 
            SeleniumUtils.javaScriptClick(
                    (ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.SEARCH_LINK)), 200);
        } catch (Exception e)
        {
            SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.SEARCH_LINK));
        }

    }

    /**
     * Click new category link in Home Page.
     */
    public  void clickNewCategoryLink()
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.NEW_CATEGORY));

    }

    /**
     * Click handbags category link in Home Page.
     */
    public  void clickHandbagsCategoryLink()
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.HANDBAGS_CATEGORY));

    }

    /**
     * Click clothing category link in Home Page.
     */
    public  void clickClothingCategoryLink()
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.CLOTHING_CATEGORY));

    }

    /**
     * Click shoes category link in Home Page.
     */
    public  void clickShoesCategoryLink()
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.SHOES_CATEGORY));

    }

    /**
     * Click jewelry category link in Home Page.
     */
    public  void clickJewelryCategoryLink()
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.JEWELRY_CATEGORY));

    }

    /**
     * Click accessories category link in Home Page.
     */
    public  void clickAccessoriesCategoryLink()
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.ACCESSORIES_CATEGORY));

    }

    /**
     * Click wallets category link in Home Page.
     */
    public  void clickWalletsCategoryLink()
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.WALLETS_CATEGORY));

    }

    /**
     * Click personalization category link.
     */
    public  void clickPersonalizationCategoryLink()
    {
        SeleniumUtils
                .click(ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.PERSONALIZATION_CATEGORY));

    }

    /**
     * Click home category link in Home Page.
     */
    public  void clickHomeCategoryLink()
    {
        SeleniumUtils.javaScriptClick(
                (ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.HOME_CATEGORY)), 250);

    }

    /**
     * Click gifts category link in Home Page.
     */
    public  void clickGiftsCategoryLink()
    {
        SeleniumUtils.scrollToView(ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.GIFTS_CATEGORY));
        SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.GIFTS_CATEGORY));

    }

    /**
     * Click sale category link in Home Page.
     */
    public  void clickSaleCategoryLink()
    {
    	try {
        SeleniumUtils.scrollToView(ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.SALE_CATEGORY));
        SeleniumUtils.wait(2);
        SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.SALE_CATEGORY));

    	}catch(Exception e) {
    		
    		SeleniumUtils.javaScriptClick(
                    (ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.SALE_CATEGORY)), 250);
    		
    	}
    }

    /**
     * Enter chain search id in Home Page.
     */
    public  void enterChainSearchId()
    {
        SeleniumUtils.wait(5);
        SeleniumUtils.sendKeys(ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.SEARCH_INPUT_TEXTBOX),
                PropertyUtil.getObjectValue(ObjectConstants.PRODUCT_CHAIN_ID));
        SeleniumUtils.wait(2);
        SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.SEARCH_SUBMIT));
    }

    /**
     * Enter SR dress search id in Home Page.
     */
    public  void enterSRDressSearchId()
    {
        SeleniumUtils.wait(5);
        SeleniumUtils.sendKeys(ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.SEARCH_INPUT_TEXTBOX),
                PropertyUtil.getObjectValue(ObjectConstants.SR_PRODUCT_DRESS_ID));
        SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.SEARCH_SUBMIT));
    }

    /**
     * Enter store item search id in Home Page.
     */
    public  void enterStoreItemSearchId()
    {
        try
        {
            SeleniumUtils.wait(5);
            SeleniumUtils.sendKeys(
                    ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.SEARCH_INPUT_TEXTBOX),
                    PropertyUtil.getObjectValue(ObjectConstants.PRODUCT_STORE_PRODUCT_ID));
            SeleniumUtils.wait(1);
            SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.SEARCH_SUBMIT));
        } catch (Exception e)
        {
            SeleniumUtils.wait(5);
            SeleniumUtils.sendKeys(
                    ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.DEV_SEARCH_INPUT_TEXTBOX),
                    PropertyUtil.getObjectValue(ObjectConstants.PRODUCT_STORE_PRODUCT_ID));
            SeleniumUtils.wait(1);
            SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.DEV_SEARCH_SUBMIT));
        }

    }

    /**
     * Enter shoes search id in Home Page.
     */
    public  void enterShoesSearchId()
    {
        SeleniumUtils.wait(5);
        SeleniumUtils.sendKeys(ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.SEARCH_INPUT_TEXTBOX),
                PropertyUtil.getObjectValue(ObjectConstants.PRODUCT_SHOES_ID));
        SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.SEARCH_SUBMIT));
    }

    /**
     * Enter shoes 2 search id in Home Page.
     */
    public  void enterShoes2SearchId()
    {
        SeleniumUtils.wait(7);
        SeleniumUtils.sendKeys(ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.SEARCH_INPUT_TEXTBOX),
                PropertyUtil.getObjectValue(ObjectConstants.PRODUCT_SHOES_2_ID));
        SeleniumUtils.wait(2);
        SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.SEARCH_SUBMIT));
    }

    /**
     * Click footer gift purchase link in Footer Section.
     */
    public  void clickFooterGiftPurchaseLink()
    {
    	try {
        SeleniumUtils.javaScriptExecutorDown("300");
        SeleniumUtils.wait(1);
        SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.FOOTER_GIFT_PURCHASE_LINK));
    	}catch(Exception e) {
    		SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.SMOKE_TEST, ObjectConstants.FOOTER_GIFT_PURCHASE_LINK));
    	}
    }
    

    /**
     * Click on shoes in category navigation in Home Page.
     */
    public  void clickOnShoes()
    {
        try
        {
            SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.HEADER_SHOES));
        } catch (Exception e)
        {
            SeleniumUtils.onHover(ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.HEADER_SHOES));
            SeleniumUtils.wait(1);
            SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.HEADER_SHOES));
        }

    }

    /**
     * Click on shoes in PLP.
     */
    public  void clickOnShoesInPLP()
    {
        try
        {
            SeleniumUtils.javaScriptExecutorDown("130");
            SeleniumUtils.wait(1);
            SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.PLP_SHOES));
        } catch (Exception e)
        {
            SeleniumUtils.onHover(ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.PLP_SHOES));
            SeleniumUtils.wait(1);
            SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.PLP_SHOES));
        }

    }

    /**
     * Enter hanger id in Home page search text box.
     */
    public  void enterHangerId()
    {
        try
        {
            SeleniumUtils.wait(3);
            SeleniumUtils.sendKeys(
                    ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.SEARCH_INPUT_TEXTBOX),
                    PropertyUtil.getObjectValue(ObjectConstants.PRODUCT_HANGER));
            SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.SEARCH_SUBMIT));
        } catch (Exception e)
        {
            SeleniumUtils.wait(3);
            SeleniumUtils.sendKeys(
                    ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.DEV_SEARCH_INPUT_TEXTBOX),
                    PropertyUtil.getObjectValue(ObjectConstants.PRODUCT_HANGER));
            SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.DEV_SEARCH_SUBMIT));
        }

    }

    /**
     * Enter studs 1 id in Home page search text box.
     */
    public  void enterStuds1Id()
    {
        SeleniumUtils.wait(3);
        SeleniumUtils.sendKeys(ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.SEARCH_INPUT_TEXTBOX),
                PropertyUtil.getObjectValue(ObjectConstants.STUDS_1));
        SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.SEARCH_SUBMIT));
    }

    /**
     * Enter wallet id in Home page search text box.
     */
    public  void enterWalletId()
    {
        SeleniumUtils.wait(5);
        SeleniumUtils.sendKeys(ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.SEARCH_INPUT_TEXTBOX),
                PropertyUtil.getObjectValue(ObjectConstants.PRODUCT_WALLET));
        SeleniumUtils.wait(2);
        SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.SEARCH_SUBMIT));
    }

    /**
     * Click on track order footer link.
     */
    public  void clickOnTrackOrderFooterLink()
    {

        SeleniumUtils.javaScriptExecutorDown("200");
        SeleniumUtils.wait(1);
        SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.FOOTER_TRACK_ORDER_LINK));
    }

    /**
     * Enter order details in Footer Section.
     */
    public  void enterorderDetails()
    {
        SeleniumUtils.sendKeys(
                ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.TRACK_ORDER_NUMBER_TEXTBOX),
                PropertyUtil.getObjectValue(ObjectConstants.TRACK_ORDER_NUMBER_TEXTBOX));
        SeleniumUtils.sendKeys(
                ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.TRACK_ORDER_EMAIL_TEXTBOX),
                PropertyUtil.getObjectValue(ObjectConstants.TRACK_ORDER_EMAIL_TEXTBOX));
        SeleniumUtils.sendKeys(
                ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.TRACK_ORDER_BILLING_ZIPCODE_TEXTBOX),
                PropertyUtil.getObjectValue(ObjectConstants.TRACK_ORDER_BILLING_ZIPCODE_TEXTBOX));
        SeleniumUtils
                .click(ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.TRACK_ORDER_CHECKSTATUS_BTN));

    }

    /**
     * Checks if is displayed order details.
     *
     * @return true, if is displayed order details
     */
    public  boolean isDisplayedOrderDetails()
    {
        ExcelBean element1 = ExcelProperty.getElementValue(ModuleNames.GLOBAL,
                ObjectConstants.TRACK_ORDER_DATE_ORDERED);
        ExcelBean element2 = ExcelProperty.getElementValue(ModuleNames.GLOBAL,
                ObjectConstants.TRACK_ORDER_ORDER_STATUS);

        boolean flag = false;
        try
        {

            flag = SeleniumUtils.iSDisplayed(element1) && SeleniumUtils.iSDisplayed(element2);

        } catch (Exception e)
        {
            e.printStackTrace();
        }

        return flag;
    }

    /**
     * Checks if is displayed login link.
     *
     * @return true, if is displayed login link
     */
    public  boolean isDisplayedLoginLink()
    {

        ExcelBean element1 = ExcelProperty.getElementValue(ModuleNames.MYACCOUNT, ObjectConstants.SIGNIN_REGISTER_LINK);

        boolean flag = false;
        try
        {

            flag = SeleniumUtils.iSDisplayed(element1);

        } catch (Exception e)
        {
            e.printStackTrace();
        }

        return flag;
    }

    /**
     * Click store locator link in Header.
     */
    public  void clickStoreLocatorlink()
    {
        SeleniumUtils
                .click(ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.HEADER_STORE_LOCATOR_LINK));

    }
   

    /**
     * Checks if is displayed store locator page.
     *
     * @return true, if is displayed store locator page
     */
    public  boolean isDisplayedStoreLocatorPage()
    {
        ExcelBean element1 = ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.STORE_LOCATOR_PAGE);

        boolean flag = false;
        try
        {

            flag = SeleniumUtils.iSDisplayed(element1);

        } catch (Exception e)
        {
            e.printStackTrace();
        }

        return flag;
    }

    /**
     * Checks if is displayed my account hover menu.
     *
     * @return true, if is displayed my account hover menu
     */
    public  boolean isDisplayedMyAccountHoverMenu()
    {

        ExcelBean element1 = ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.HEADER_HOVER_MY_LOGOUT);
        // ExcelBean element2 =
        // ExcelProperty.getElementValue(ModuleNames.GLOBAL,
        // ObjectConstants.HEADER_HOVER_MY_REGISTRY);
        ExcelBean element3 = ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.HEADER_HOVER_MY_ACCOUNT);
        ExcelBean element4 = ExcelProperty.getElementValue(ModuleNames.GLOBAL,
                ObjectConstants.HEADER_HOVER_TRACK_MY_ORDER);

        boolean flag = false;
        try
        {

            flag = SeleniumUtils.iSDisplayed(element1)
                    // && SeleniumUtils.iSDisplayed(element2)
                    && SeleniumUtils.iSDisplayed(element3) && SeleniumUtils.iSDisplayed(element4);

        } catch (Exception e)
        {
            e.printStackTrace();
        }

        return flag;
    }

    /**
     * Select store state.
     */
    public  void selectStoreState()
    {
        SeleniumUtils
                .click(ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.STORE_LOCATOR_STATE_ACCORDIN));
        SeleniumUtils.wait(2);
        SeleniumUtils
                .click(ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.STORE_LOCATOR_SELECT_STATE));

    }

    /**
     * Checks if is stores displayed.
     *
     * @return true, if is stores displayed
     */
    public  boolean isStoresDisplayed()
    {
    	if(isStoresLocatorPopupDsiplayed()){
    		closeStoreLocatorPopup();
    	}

        boolean flag = false;
        try
        {

            flag = SeleniumUtils.iSDisplayed(
                    ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.STORE_LOCATOR_STORES_DISPLAYED))
                    && SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(ModuleNames.GLOBAL,
                            ObjectConstants.STORE_LOCATOR_STORE_ADDRS_DISPLAYED));

        } catch (Exception e)
        {
            e.printStackTrace();
        }
        return flag;
    }
    
    
    public  boolean isStoresLocatorPopupDsiplayed()
    {
        boolean flag = false;
        try
        {

            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(ModuleNames.GLOBAL,
                            ObjectConstants.STORELOCATOR_POPUP_CLOSE_LINK));

        } catch (Exception e)
        {
            e.printStackTrace();
        }
        return flag;
    }
    
    
    /**
     * Click on Close link of Store locator pop up in Store locator page
     */
    public  void closeStoreLocatorPopup()
    {
        SeleniumUtils.click(
                ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.STORELOCATOR_POPUP_CLOSE_LINK));
    }
    

    /**
     * Click on state search button.
     */
    public  void clickOnStateSearchButton()
    {
        SeleniumUtils
                .click(ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.STORE_LOCATOR_STATE_SEARCH));
    }

    /**
     * Checks if is displayed gift landing page.
     *
     * @return true, if is displayed gift landing page
     */
    public  boolean isDisplayedGiftLandingPage()
    {
        ExcelBean element1 = ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.GIFT_LANDING_PAGE);

        boolean flag = false;
        try
        {

            flag = SeleniumUtils.iSDisplayed(element1);

        } catch (Exception e)
        {
            e.printStackTrace();
        }

        return flag;

    }

    /**
     * Enter handbag id in Home page search text box.
     */
    public  void enterHandbagId()
    {
    	try {
    		SeleniumUtils.wait(5);
    		SeleniumUtils.sendKeys(ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.SEARCH_INPUT_TEXTBOX),
    				PropertyUtil.getObjectValue(ObjectConstants.PRODUCT_HANDBAG));
    		SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.SEARCH_SUBMIT));
    	} catch (Exception e)
    	{
    		SeleniumUtils.wait(5);
    		SeleniumUtils.sendKeys(
    				ExcelProperty.getElementValue(ModuleNames.SMOKE_TEST, ObjectConstants.DEV_SEARCH_INPUT_TEXTBOX),
    				PropertyUtil.getObjectValue(ObjectConstants.PRODUCT_HANDBAG));
    		SeleniumUtils.keys(Keys.ENTER);
    	}
    }

    /**
     * Enter continental wallet id in Home page search text box.
     */
    public  void enterContinentalWalletId()
    {
        SeleniumUtils.wait(5);
        SeleniumUtils.sendKeys(ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.SEARCH_INPUT_TEXTBOX),
                PropertyUtil.getObjectValue(ObjectConstants.PRODUCT_CONTINENTAL_WALLET));
        SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.SEARCH_SUBMIT));
    }

    /**
     * Checks if is chat icon in home page.
     *
     * @return true, if is chat icon in home page
     */
    public  boolean isChatIconInHomePage()
    {
        ExcelBean element1 = ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.CHAT_ICON_HOMEPAGE);

        boolean flag = false;
        try
        {

            flag = SeleniumUtils.iSDisplayed(element1);

        } catch (Exception e)
        {
            e.printStackTrace();
        }

        return flag;
    }

    /**
     * Click on chat icon in home page.
     */
    public  void clickOnChatIconInHomePage()
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.CHAT_ICON_HOMEPAGE));
    }

    /**
     * Checks if is display chat icon page.
     *
     * @return true, if is display chat icon page
     */
    public  boolean isDisplayChatIconPage()
    {
        ExcelBean element1 = ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.CHAT_ICON_PAGE);

        boolean flag = false;
        try
        {

            flag = SeleniumUtils.iSDisplayed(element1);

        } catch (Exception e)
        {
            e.printStackTrace();
        }

        return flag;
    }

    /**
     * Enter store locator zip code.
     */
    public  void enterStoreLocatorZipCode()
    {

        String Zipcode = PropertyUtil.getObjectValue(ObjectConstants.STORE_LOCATOR_ZIPCODE);
        SeleniumUtils.sendKeys(ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.STORE_LOCATOR_ZIPCODE),
                Zipcode);

    }
   

    /**
     * Click on stor locator searchbtn.
     */
    public  void clickOnStorLocatorSearchbtn()
    {
        SeleniumUtils
                .click(ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.STORE_LOCATOR_SEARCH_BUTTON));
    }
    


    /**
     * Checks if is displayed social media icons.
     *
     * @return true, if is displayed social media icons
     */
    public  boolean isDisplayedSocialMediaIcons()
    {

        ExcelBean element1 = ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.FACEBOOK);
        ExcelBean element2 = ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.PINTEREST);
        ExcelBean element3 = ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.INSTAGRAM);
        ExcelBean element4 = ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.TWITTER);
        ExcelBean element5 = ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.TUMBLR);
        ExcelBean element6 = ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.YOUTUBE);

        boolean flag = false;
        try
        {

            flag = SeleniumUtils.iSDisplayed(element1) && SeleniumUtils.iSDisplayed(element2)
                    && SeleniumUtils.iSDisplayed(element3) && SeleniumUtils.iSDisplayed(element4)
                    && SeleniumUtils.iSDisplayed(element5) && SeleniumUtils.iSDisplayed(element6);

        } catch (Exception e)
        {
            e.printStackTrace();
        }

        return flag;
    }

    /**
     * Click on instagram icon in Footer section.
     */
    public  void clickOnInstagramIcon()
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.INSTAGRAM));
    }

    /**
     * Enter bloom blush spray id in Home page search text box.
     */
    public  void enterBloomBlushSprayId()
    {
        try
        {
            SeleniumUtils.sendKeys(
                    ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.SEARCH_INPUT_TEXTBOX),
                    PropertyUtil.getObjectValue(ObjectConstants.PRODUCT_BLOOM_SPRAY));
            SeleniumUtils.wait(2);
            SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.SEARCH_SUBMIT));
            
        } catch (Exception e)
        {
            SeleniumUtils.sendKeys(
                    ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.DEV_SEARCH_INPUT_TEXTBOX),
                    PropertyUtil.getObjectValue(ObjectConstants.PRODUCT_BLOOM_SPRAY));
            SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.DEV_SEARCH_SUBMIT));
        }

    }

    /**
     * Checks if is display instagram page.
     *
     * @return true, if is display instagram page
     */
    public  boolean isDisplayInstagramPage()
    {
        ExcelBean element1 = ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.INSTA_PAGE);

        boolean flag = false;
        try
        {

            flag = SeleniumUtils.iSDisplayed(element1);

        } catch (Exception e)
        {
            e.printStackTrace();
        }

        return flag;
    }

    /**
     * Click on facebook icon in Footer section.
     */
    public  void clickOnFacebookIcon()
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.FACEBOOK));
    }

    /**
     * Checks if is display facebook page.
     *
     * @return true, if is display facebook page
     */
    public  boolean isDisplayFacebookPage()
    {
        ExcelBean element1 = ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.FACEBOOK_PAGE);

        boolean flag = false;
        try
        {

            flag = SeleniumUtils.iSDisplayed(element1);

        } catch (Exception e)
        {
            e.printStackTrace();
        }

        return flag;
    }

    /**
     * Enter chain search id 1 in Home page search text box.
     */
    public  void enterChainSearchId1()
    {
        SeleniumUtils.wait(5);
        SeleniumUtils.sendKeys(ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.SEARCH_INPUT_TEXTBOX),
                PropertyUtil.getObjectValue(ObjectConstants.PRODUCT_CHAIN_ID_1));
        SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.SEARCH_SUBMIT));

    }

    /**
     * Click close button.
     */
    public  void clickCloseButton()
    {
        try
        {
            SeleniumUtils.click(
                    ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.MAIL_SUBSCRIPTION_CLOSE_BTN));
        } catch (Exception e)
        {

            SeleniumUtils.javaScriptExecutorUp("300");

            SeleniumUtils.clickByXPath("(//*[@title='Close'])[3]");
        }

    }

    /**
     * Checks if is join button.
     *
     * @return true, if is join button
     */
    public  boolean isJoinButton()
    {
        ExcelBean element1 = ExcelProperty.getElementValue(ModuleNames.GLOBAL,
                ObjectConstants.MAIL_SUBSCRIPTION_JOIN_BTN);

        boolean flag = false;
        try
        {

            flag = SeleniumUtils.iSDisplayed(element1);

        } catch (Exception e)
        {
            e.printStackTrace();
        }

        return flag;
    }

    /**
     * Click customer care link in Footer section.
     */
    public  void clickCustomerCareLink()
    {
        SeleniumUtils.javaScriptExecutorDown("400");
        SeleniumUtils.wait(1);
        SeleniumUtils
                .click(ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.FOOTER_CUSTOMER_CARE_LINK));

    }

    /**
     * Checks if is customer care page.
     *
     * @return true, if is customer care page
     */
    public  boolean isCustomerCarePage()
    {
        ExcelBean element1 = ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.CUSTOMER_CARE_LINK_PAGE);

        boolean flag = false;
        try
        {

            flag = SeleniumUtils.iSDisplayed(element1);

        } catch (Exception e)
        {
            e.printStackTrace();
        }

        return flag;
    }

    /**
     * Click gift card link in Footer section.
     */
    public  void clickGiftCardLink()
    {
        SeleniumUtils.javaScriptExecutorDown("200");
        SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.FOOTER_GIFT_CARD_LINK));

    }

    /**
     * Checks if is display gift card options.
     *
     * @return true, if is display gift card options
     */
    public  boolean isDisplayGiftCardOptions()
    {

        ExcelBean element1 = ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.GIFT_CARD_NUMBER_BOX);
        ExcelBean element2 = ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.GIFT_CARD_PIN_BOX);

        boolean flag = false;
        try
        {

            flag = SeleniumUtils.iSDisplayed(element1) && SeleniumUtils.iSDisplayed(element2);
        } catch (Exception e)
        {
            e.printStackTrace();
        }

        return flag;
    }

    /**
     * Display gift card options.
     *
     * @return true, if successful
     */
    public  boolean displayGiftCardOptions()
    {

        ExcelBean element1 = ExcelProperty.getElementValue(ModuleNames.GLOBAL,
                ObjectConstants.PLACEHOLDER_GIFT_CARD_NUMBER_BOX);
        ExcelBean element2 = ExcelProperty.getElementValue(ModuleNames.GLOBAL,
                ObjectConstants.PLACEHOLDER_GIFT_CARD_PIN_BOX);

        boolean flag = false;
        try
        {

            flag = SeleniumUtils.iSDisplayed(element1) && SeleniumUtils.iSDisplayed(element2);

        } catch (Exception e)
        {
            e.printStackTrace();
        }

        return flag;
    }

    /**
     * Click on sholderbags in category page.
     */
    public  void clickOnSholderbagsInCategoryPage()
    {
        
        SeleniumUtils.onHover(ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.HANDBAGS_CATEGORY));
        SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.RANDOM_CLICK));

    }

    /**
     * Checks if is display need help options.
     *
     * @return true, if is display need help options
     */
    public  boolean isDisplayNeedHelpOptions()
    {

        ExcelBean element1 = ExcelProperty.getElementValue(ModuleNames.GLOBAL,
                ObjectConstants.WE_ARE_HERE_TO_HELP_POP_UP);
        ExcelBean element2 = ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.CHAT_WITH_US_LINK);
        ExcelBean element3 = ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.CALL_US_LINK);
        ExcelBean element4 = ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.TRACK_ORDER);
        ExcelBean element5 = ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.FREE_SHIPPING_RETURN);
        ExcelBean element6 = ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.VISIT_OUR_CUSTOMER_CARE);
        ExcelBean element7 = ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.EMAIL_US);

        boolean flag = false;
        try
        {

            flag = SeleniumUtils.iSDisplayed(element1) && SeleniumUtils.iSDisplayed(element2)
                    && SeleniumUtils.iSDisplayed(element3) && SeleniumUtils.iSDisplayed(element4)
                    && SeleniumUtils.iSDisplayed(element5) && SeleniumUtils.iSDisplayed(element6)
                    && SeleniumUtils.iSDisplayed(element7);
        } catch (Exception e)
        {
            e.printStackTrace();
        }

        return flag;
    }

    /**
     * Click email us link in Footer Section.
     */
    public  void clickEmailUsLink()
    {

        SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.EMAIL_US));

    }

    /**
     * Click terms of use link in Footer Section.
     */
    public  void clickTermsOfUseLink()
    {
        SeleniumUtils.javaScriptExecutorDown("200");
        SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.TERMS_OF_USE_LINK));

    }

    /**
     * Checks if is terms of use page.
     *
     * @return true, if is terms of use page
     */
    public  boolean isTermsOfUsePage()
    {
        ExcelBean element1 = ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.TERMS_OF_USE_TITLE);

        boolean flag = false;
        try
        {

            flag = SeleniumUtils.iSDisplayed(element1);

        } catch (Exception e)
        {
            e.printStackTrace();
        }

        return flag;
    }

    /**
     * Checks if is handbag category page.
     *
     * @return true, if is handbag category page
     */
    public  boolean isHandbagCategoryPage()
    {
        ExcelBean element1 = ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.HANDBAG_CATEGORY_TITLE);
        ExcelBean element2 = ExcelProperty.getElementValue(ModuleNames.GLOBAL,
                ObjectConstants.HANDBAG_CATEGORY_SUBTITLE);
        boolean flag = false;
        try
        {

            flag = SeleniumUtils.iSDisplayed(element1) && SeleniumUtils.iSDisplayed(element2);

        } catch (Exception e)
        {
            e.printStackTrace();
        }

        return flag;

    }

    /**
     * Click on mini cart close button.
     */
    public  void clickOnMiniCartCloseButton()
    {

        SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.SMOKE_TEST, ObjectConstants.MINI_CART_CLOSE));

    }

    /**
     * Click on gift tab in Header.
     */
    public  void clickOnGiftTab()
    {
    	try {
    		SeleniumUtils.onHover(ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.HEADER_GIFT_TAB));
    		SeleniumUtils.wait(2);
    		SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.HEADER_GIFT_CARD));
    	}catch(Exception e) {
    		try {
    			SeleniumUtils.onHover(ExcelProperty.getElementValue(ModuleNames.SMOKE_TEST, ObjectConstants.HEADER_GIFT_TAB));
    			SeleniumUtils.wait(2);
    			SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.SMOKE_TEST, ObjectConstants.HEADER_GIFT_CARD));
    		}catch(Exception d) {
    			SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.SHOPFLOW, ObjectConstants.HEADER_GIFT_CARD));
    		}
    	}
    }

   

    /**
     * Click on gift card.
     */
    public  void clickOnGiftCard()
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.HEADER_GIFT_CARD));
    }

    /**
     * Enter non eligible SR prod id.
     */
    public  void enterNonEligibleSRProdId()
    {
        SeleniumUtils.wait(5);
        SeleniumUtils.sendKeys(ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.SEARCH_INPUT_TEXTBOX),
                PropertyUtil.getObjectValue(ObjectConstants.NON_ELIGIBLE_SR_PROD));
        SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.SEARCH_SUBMIT));
    }

    /**
     * Select store by country.
     */
    public  void selectStoreByCountry()
    {
        SeleniumUtils.click(
                ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.STORE_LOCATOR_COUNTRY_ACCORDIN));
        SeleniumUtils.wait(2);
        SeleniumUtils
                .click(ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.STORE_LOCATOR_SELECT_COUNTRY));

    }

    /**
     * Click on country search button.
     */
    public  void clickOnCountrySearchButton()
    {
        SeleniumUtils
                .click(ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.STORE_LOCATOR_COUNTRY_SEARCH));
    }

    /**
     * Enter dot hoops search id.
     */
    public  void enterDotHoopsSearchId()
    {
        try
        {
            SeleniumUtils.wait(1);
            SeleniumUtils.sendKeys(
                    ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.SEARCH_INPUT_TEXTBOX),
                    PropertyUtil.getObjectValue(ObjectConstants.PRODUCT_DOT_HOOPS));
            SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.SEARCH_SUBMIT));
        } catch (Exception e)
        {
            SeleniumUtils.wait(1);
            SeleniumUtils.sendKeys(
                    ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.DEV_SEARCH_INPUT_TEXTBOX),
                    PropertyUtil.getObjectValue(ObjectConstants.PRODUCT_DOT_HOOPS));
            SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.DEV_SEARCH_SUBMIT));
        }

    }

    /**
     * Enter implicit search id.
     */
    public  void enterImplicitSearchId()
    {
        SeleniumUtils.wait(5);
        SeleniumUtils.sendKeys(ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.SEARCH_INPUT_TEXTBOX),
                PropertyUtil.getObjectValue(ObjectConstants.PRODUCT_IMPLICIT_ID));
        SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.SEARCH_SUBMIT));
    }

    /**
     * Enter dev implicit search id.
     */
    public  void enterDevImplicitSearchId()
    {
        SeleniumUtils.wait(5);
        SeleniumUtils.sendKeys(
                ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.DEV_SEARCH_INPUT_TEXTBOX),
                PropertyUtil.getObjectValue(ObjectConstants.PRODUCT_IMPLICIT_ID));
        SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.DEV_SEARCH_SUBMIT));
    }

    /**
     * Click on youtube icon in Footer.
     */
    public  void clickOnYoutubeIcon()
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.YOUTUBE));
    }

    /**
     * Checks if is display youtube page.
     *
     * @return true, if is display youtube page
     */
    public  boolean isDisplayYoutubePage()
    {
        ExcelBean element1 = ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.YOUTUBE_PAGE);

        boolean flag = false;
        try
        {

            flag = SeleniumUtils.iSDisplayed(element1);

        } catch (Exception e)
        {
            e.printStackTrace();
        }

        return flag;
    }

    /**
     * Click on tumblr icon in Footer Section.
     */
    public  void clickOnTumblrIcon()
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.TUMBLR));
    }

    /**
     * Checks if is display tumblr page.
     *
     * @return true, if is display tumblr page
     */
    public  boolean isDisplayTumblrPage()
    {
        ExcelBean element1 = ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.TUMBLR_PAGE);

        boolean flag = false;
        try
        {

            flag = SeleniumUtils.iSDisplayed(element1);

        } catch (Exception e)
        {
            e.printStackTrace();
        }

        return flag;
    }

    /**
     * Click on pinterest icon in Footer Section.
     */
    public  void clickOnPinterestIcon()
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.PINTEREST));
    }

    /**
     * Checks if is display pinterest page.
     *
     * @return true, if is display pinterest page
     */
    public  boolean isDisplayPinterestPage()
    {
        ExcelBean element1 = ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.PINTEREST_PAGE);

        boolean flag = false;
        try
        {

            flag = SeleniumUtils.iSDisplayed(element1);

        } catch (Exception e)
        {
            e.printStackTrace();
        }

        return flag;
    }

    /**
     * Click on twitter icon in Footer Section.
     */
    public  void clickOnTwitterIcon()
    {
        SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.TWITTER));
    }

    /**
     * Checks if is display twitter page.
     *
     * @return true, if is display twitter page
     */
    public  boolean isDisplayTwitterPage()
    {
        ExcelBean element1 = ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.TWITTER_PAGE);

        boolean flag = false;
        try
        {

            flag = SeleniumUtils.iSDisplayed(element1);

        } catch (Exception e)
        {
            e.printStackTrace();
        }

        return flag;
    }

    /**
     * Enter prod with col and no umbrela bonus.
     */
    public  void enterProdWithColAndNoUmbrelaBonus()
    {
        SeleniumUtils.wait(5);
        SeleniumUtils.sendKeys(ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.SEARCH_INPUT_TEXTBOX),
                "s9351010");
        SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.SEARCH_SUBMIT));
    }

    /**
     * Click on gift guide.
     */
    public  void clickOnGiftGuide()
    {
        try
        {
            SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.GIFT_CARDS));
        } catch (Exception e)
        {
            SeleniumUtils.onHover(ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.HEADER_GIFT_GUIDE));
            SeleniumUtils.wait(1);
            SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.GIFT_CARDS));
        }

    }

    /**
     * Enter wallet id after adding prod.
     */
    public  void enterWalletIdAfterAddingProd()
    {
        SeleniumUtils.wait(5);
        SeleniumUtils.sendKeys(ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.SEARCH_INPUT_TEXTBOX),
                "");
        SeleniumUtils.wait(2);
        SeleniumUtils.sendKeys(ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.SEARCH_INPUT_TEXTBOX),
                PropertyUtil.getObjectValue(ObjectConstants.PRODUCT_WALLET));
        SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.SEARCH_SUBMIT));
    }

   

    /**
     * Enter glitter sneakers id in search text box.
     */
    public  void enterGlitterSneakersId()
    {
        SeleniumUtils.wait(2);
        SeleniumUtils.sendKeys(ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.SEARCH_INPUT_TEXTBOX),
                PropertyUtil.getObjectValue(ObjectConstants.RADIAL_PRODUCT_GLITTER_SNEAKERS));
        SeleniumUtils.wait(2);
        SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.SEARCH_SUBMIT));
    }

    /**
     * Enter monogram boxes search id in search text box.
     */
    public  void enterMonogramBoxesSearchId()
    {
        SeleniumUtils.wait(5);
        SeleniumUtils.sendKeys(ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.SEARCH_INPUT_TEXTBOX),
                PropertyUtil.getObjectValue(ObjectConstants.PRODUCT_MONOGRAM_BOXES));
        SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.SEARCH_SUBMIT));
    }

    /**
     * Checks if is navigatd to home pg.
     *
     * @return true, if is navigatd to home pg
     */
    public  boolean isNavigatdToHomePg()
    {
        ExcelBean element1 = ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.HOME_PG_NAVIGATION_BAR);

        boolean flag = false;
        try
        {

            flag = SeleniumUtils.iSDisplayed(element1);

        } catch (Exception e)
        {
            e.printStackTrace();
        }

        return flag;
    }


    
    
    /**
     * Click on sachel bags in subcategory section of Handbags main cattegory.
     */
    public  void clickOnSatchelbags()
    {

        SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.GLOBAL,
                ObjectConstants.SATCHELS_SUBCATEGORY));

    }
    
    
    /**
     * Enter email address in login page.
     */
    public  void enterEmailAddress()
    {
        SeleniumUtils.sendKeys(
                ExcelProperty.getElementValue(ModuleNames.SMOKE_TEST, ObjectConstants.LOGIN_USERNAME_TEXTBOX),
                PropertyUtil.getObjectValue(ObjectConstants.LOGIN_SMOKE_USERNAME_TEXTBOX));

    }

    
    
    /**
     * Click on logout link in my account fly out.
     */
    public  void clickOnLogoutInMyAccountFlyOut()
    {
        SeleniumUtils
                .click(ExcelProperty.getElementValue(ModuleNames.SMOKE_TEST, ObjectConstants.MY_ACCOUNT_LOGOUT_LINK));
    }
    
    
    /**
     * Click on forgot password link in login page.
     */
    public  void clickOnForgotPassword()
    {
        SeleniumUtils.click(
                ExcelProperty.getElementValue(ModuleNames.SMOKE_TEST, ObjectConstants.LOGIN_FORGOT_PASSWORD_LINK));

    }
    
    
    /**
     * Checks if is forgot password hop up displayed upon clicking forgot password link.
     *
     * @return true, if is forgot password hop up displayed
     */
    public  boolean isForgotPasswordHopUp()
    {
        boolean flag = false;
        try
        {

            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(ModuleNames.SMOKE_TEST,
                    ObjectConstants.LOGIN_FORGOT_PASSWORD_HOP_UP_DISPLAYED));

        } catch (Exception e)
        {
            e.printStackTrace();
        }
        return flag;
    }
    
    /**
     * Hover on hand bags menu in Homepage.
     */
    public  void hoverOnhandBagsMenu()
    {
        SeleniumUtils.onHover(ExcelProperty.getElementValue(ModuleNames.GLOBAL, ObjectConstants.HANDBAGS_CATEGORY));

    }
    
    public  boolean isHandBagsSubCategories()
    {
        boolean flag = false;
        try
        {

            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(ModuleNames.SMOKE_TEST,
                    ObjectConstants.MEGAMENU_BAGS_SUB_CATEGORIES));

        } catch (Exception e)
        {
            e.printStackTrace();
        }
        return flag;
    }
    
    public  void hoverOnClothingMenu()
    {
        SeleniumUtils.onHover(ExcelProperty.getElementValue(ModuleNames.SMOKE_TEST, ObjectConstants.CLOTHING_CATEGORY));

    }
    
    public  boolean isClothingSubCategories()
    {
        boolean flag = false;
        try
        {

            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(ModuleNames.SMOKE_TEST,
                    ObjectConstants.MEGAMENU_CLOTHING_SUB_CATEGORIES));

        } catch (Exception e)
        {
            e.printStackTrace();
        }
        return flag;
    }
    

    public  boolean isShoesSubCategories()
    {
        boolean flag = false;
        try
        {

            flag = SeleniumUtils.iSDisplayed(ExcelProperty.getElementValue(ModuleNames.SMOKE_TEST,
                    ObjectConstants.MEGAMENU_SHOES_SUB_CATEGORIES));

        } catch (Exception e)
        {
            e.printStackTrace();
        }
        return flag;
    }
    
    public  void hoverOnShoesMenu()
    {
        SeleniumUtils.onHover(ExcelProperty.getElementValue(ModuleNames.SMOKE_TEST, ObjectConstants.SHOES_CATEGORY));

    }
    
    public  void clickOnMegaMenuHandbagsCategory()
    {

        SeleniumUtils.click(ExcelProperty.getElementValue(ModuleNames.SMOKE_TEST, ObjectConstants.HANDBAGS_CATEGORY));

    }
   
   

}
