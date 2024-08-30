package com.xworkz.usage.WashingMachine;


import com.xworkz.usage.Godse;

public class WashingMachineRunner {
    public static void main(String[] args) {

        WashingMachine washingMachine=new WashingMachine();
        washingMachine.rince();
        washingMachine.show();

        Megha megha=new Megha();
        megha.girl();

        Laxmi laxmi=new Laxmi();
        laxmi.strong();

        Abhisheak abhisheak=new Abhisheak();
        abhisheak.boy();

        Bhumika ref=new Bhumika();

        if(ref!=null){
            System.out.println(washingMachine.brand);
            System.out.println(washingMachine.type);
            System.out.println(washingMachine.capacity);
            washingMachine.show();
        }else{
            System.out.println("pizza in pradeep is null");
        }
        ref.strongGirl();

        Nayana nayana=new Nayana();
        nayana.person();






    }
}
