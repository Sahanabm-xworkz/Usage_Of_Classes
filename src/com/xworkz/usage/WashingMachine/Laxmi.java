package com.xworkz.usage.WashingMachine;
//parameter

public class Laxmi {
    public void strong(WashingMachine washingMachine){
        System.out.println("laxmi is created");
        if(washingMachine!=null){
            System.out.println("washingmachine is not null");
        }else{
            System.out.println("washingmachine is  null");
            System.out.println(washingMachine.brand);
            System.out.println(washingMachine.type);
            System.out.println(washingMachine.capacity);
            washingMachine.show();
        }
    }
}
