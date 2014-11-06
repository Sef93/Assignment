package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by Séf on 2014.11.05..
 */
public class Archer extends Karakter {
    public Archer(String name, String klass, int level, int strength, int agility, int stamina, int attackD, int damageD, int AC) {
        super(name, klass, level, strength, agility, stamina, attackD, damageD, AC);
    }
    @Override
    public int damageD() {
        return super.damageD();
    }

    @Override
    public int damageTaken() {
        return super.damageTaken();
    }

    @Override
    public void action() {
        super.action();
    }

    @Override
    public int strRand() {
        int n = (int )(Math.random() * 5 + 1);
        return n;
    }

    @Override
    public int staRand() {
        int n = (int )(Math.random() * 10 + 5);
        return n;
    }

    @Override
    public int agiRand() {
        int n = (int )(Math.random() * 20 + 15);
        return n;
    }
    @Override
    public String toString(){
        String ki = (this.name + " a nagy " + this.klass + ", kinek ereje " + this.strength + ", ugyessege " + this.agility + ", allkepessege pedig " + this.stamina + " keszen all a kalandra!");
        return ki;
    }
    @Override
    public void chooseArcherEquipment(){
        int choice = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Milyen fegyvert szeretnel?");
        System.out.println("1/ Shuriken (4d4) 2/ Dobófejsze (1d12) , vagy 3/ Hosszúíj (1d14 sebzés");
        try{
            choice = br.read();
            switch (choice) {
                case 1: increaseDamage(4, 4); break;
                case 2: increaseDamage(1, 12); break;
                case 3: increaseDamage(1, 8); break;
            }
        } catch (Exception ie){
            System.out.println("Nem szamot adtal meg:(");
        }
    }
}
