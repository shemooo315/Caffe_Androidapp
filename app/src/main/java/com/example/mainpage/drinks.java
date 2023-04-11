package com.example.mainpage;

public class drinks {
    private int imageresource;
    private String productname;
    private String productprice;
    private int button;

    public drinks(int image,String productname,String productprice,int btn){
        imageresource=image;
        this.productname=productname;
        this.productprice=productprice;
        this.button=btn;

    }
    public int getImageresource(){
        return imageresource;
    }
    public String getProductname(){
        return productname;
    }
    public String getProdductprice(){
        return productprice;
    }
}
