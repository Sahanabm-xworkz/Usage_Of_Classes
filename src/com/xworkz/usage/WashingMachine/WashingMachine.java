package com.xworkz.usage.WashingMachine;

public class WashingMachine {
   public String brand="lg";
   public String type="fountload";
   public String capacity="high";

   public WashingMachine(){
       System.out.println("WashingMachine cons is created");
   }

   public void rince(){
       System.out.println("rince is created");
   }
   public void show(){
       System.out.println("WashingMachine brand:"+brand);
       System.out.println("WashingMachine type:"+type);
       System.out.println("WashingMachine capacity:"+capacity);

   }

}
