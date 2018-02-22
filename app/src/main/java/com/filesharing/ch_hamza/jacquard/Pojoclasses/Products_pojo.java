package com.filesharing.ch_hamza.jacquard.Pojoclasses;

/**
 * Created by CH-Hamza on 2/21/2018.
 */

public class Products_pojo {
private String product_id;
private String product_name;
private String product_uri;

public Products_pojo (String product_id, String product_name, String product_uri)
{
    this.product_id = product_id;
    this.product_name = product_name;
    this.product_uri = product_uri;

}



public void setProduct_id ()
{
    this.product_id= product_id;
}

public String getProduct_id ()
{
    return product_id;
}

public  void setProduct_name ()
{
    this.product_name = product_name;

}

public String getProduct_name()
{
    return product_name;

}
public void setProduct_uri()
{
    this.product_uri =product_uri;
}
public String getProduct_uri()
{
    return product_uri;
}

}
