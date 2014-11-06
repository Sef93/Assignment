package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;



public class Main {
    public static void main(String[] args) {
        Karakter jancsi = new Warrior("Arcos", "Harcos", 1, 0, 0, 0, 1, 4, 10);
        Karakter janos = jancsi.create();
        System.out.println(janos.toString());
        if (janos.klass.equals("Harcos")){
            janos.chooseWarriorEquipment(janos);
            System.out.println(janos.toStringEquipment(janos));
        }else{
            janos.chooseArcherEquipment();
        }
        int palya = 0;
        palya = janos.chooseLevel();
        switch(palya){
            case 1:{  System.out.println("Elso palya:");
                      LevelOne szint = new LevelOne(janos);
                      Warrior bossz = szint.spawnBoss();
                      szint.harc(janos, bossz);
            }
        }
    }
}
