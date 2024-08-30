package com.xworkz.usage.things;

public class Gun {
   public String name="varioer";
    public String countryMade="india";
    public String type="steel";

    public Gun(){
        System.out.println("Gun const is created");
    }
     public void fire(){
         System.out.println("fire method is created");
     }
     public void display(){
         System.out.println("Gun name:"+name);
         System.out.println("Gun countryMade:"+countryMade);
         System.out.println("Gun type:"+type);
     }

}
