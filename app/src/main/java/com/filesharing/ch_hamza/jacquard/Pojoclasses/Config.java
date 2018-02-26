package com.filesharing.ch_hamza.jacquard.Pojoclasses;

/**
 * Created by CH-Hamza on 2/15/2018.
 */

public class Config {

    public static final String ip="192.168.10.6";
    public static final String BANNER1 = "http://www.forecast.com.pk/media/wysiwyg/porto/mobile/banner1.jpg";
    public static final String BANNER2 = "http://www.forecast.com.pk/media/wysiwyg/porto/mobile/banner3.jpg";
    public static final String BANNER3 = "http://www.forecast.com.pk/media/wysiwyg/porto/mobile/banner2.jpg";

    public static final String URL_ALL_PRODUCTS= "http://forecast.com.pk/getAllProductsByCategories.php";
    public static final String URL_sub_categories= "http://forecast.com.pk/getSubCategories.php";

///////////////////SHARED PREFRENCE CART////////////////////////
//    public static final String LOGIN_SUCCESS = "success";
public static final String SHARED_PREF_CART = "cart";
    public static final String SHARED_PREF_CART_NO = "cart_id";
    ////////////////////////////////////////////

    ////////////ORDER PLACE//////////////////
    public static final String URL_CREATE_ORDER="http://forecast.com.pk/create_order.php";
    public static final String FIRSTNAME= "firstname";
    public static final String LASTNAME = "lastname";
    public static final String CART_ID = "cart_id";
    public static final String EMAIL = "email";
    public static final String COMPANY = "company";
    public static final String STREET = "street";
    public static final String CITY = "city";
    public static final String REGION = "region";
    public static final String POSTALCODE = "postcode";
    public static final String COUNTRY = "country_id";
    public static final String PHONE = "telephone";
}
