package com.xworkz.usage;

import com.xworkz.usage.things.Gun;

public class Soldier {
     public void Army(){

         Gun gun=new Gun();
         System.out.println(gun.name);
         System.out.println(gun.countryMade);
         System.out.println(gun.type);
         gun.fire();
         gun.display();

     }
}
