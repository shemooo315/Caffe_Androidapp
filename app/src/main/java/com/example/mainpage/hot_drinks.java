package com.example.mainpage;

public class hot_drinks {

    private int hotimage;
    private String hotname;
    private String hotprice;
    private int hotbutton;

    public hot_drinks(int image,String name,String price,int btn){
        hotimage =image;
        this.hotname=name;
        this.hotprice=price;
        this.hotbutton=btn;

    }
    public int getImageresource(){
        return hotimage;
    }
    public String getProductname(){
        return hotname;
    }
    public String getProdductprice(){
        return hotprice;
    }
}
