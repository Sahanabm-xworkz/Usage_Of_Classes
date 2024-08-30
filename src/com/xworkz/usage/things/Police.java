package com.xworkz.usage.things;

public class Police {

    public void dress(Gun gun){
        System.out.println("dress menthod is crated");
        if(gun!=null){
            System.out.println("gun is not null");
            System.out.println(gun.name);
            System.out.println(gun.countryMade);
            System.out.println(gun.type);
            gun.display();
        }else{
            System.out.println("gun is null");
        }

    }
}
