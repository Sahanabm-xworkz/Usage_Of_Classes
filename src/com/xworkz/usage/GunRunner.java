package com.xworkz.usage;

import com.xworkz.usage.things.Dboss;
import com.xworkz.usage.things.Gun;
import com.xworkz.usage.things.Police;

public class GunRunner {
    public static void main(String[] args) {

        Gun gun=new Gun();
        gun.display();
        gun.fire();

        Soldier solider=new Soldier();
        solider.Army();

        Police police=new Police();
        police.dress(gun);

        Dboss dboss=new Dboss();
        dboss.hero();


        Godse ref=new Godse();
        if(ref!=null){
            System.out.println("gun name:"+gun.name);
            System.out.println(gun.countryMade);
            System.out.println(gun.type);
            gun.display();
        }else{
            System.out.println("pizza in pradeep is null");
        }
        ref.person();



    }
}
