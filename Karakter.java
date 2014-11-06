package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by Séf on 2014.11.05..
 */
public abstract class Karakter  implements Equipment{
    public String name = " ";
    public String klass = " ";
    public int level = 1;
    protected int strength = 1;
    protected int stamina = 1;
    protected int agility = 1;
    protected int attackD = 1;
    protected int damageD = 4;
    protected int AC = 10;

    public Karakter(String name, String klass, int level, int strength, int agility, int stamina, int attackD, int damageD, int AC) {
        this.name = name;
        this.klass = klass;
        this.level = level;
        this.strength = strRand();
        this.agility = agiRand();
        this.stamina = staRand();
        this.attackD = attackD;
        this.damageD = damageD;
        this.AC = AC;
    }
    public Karakter(){

    }

    public int damageD(){
        int damageDone = 1;
        return damageDone;
    }
    public int damageTaken(){
        int taken = 1;
        return taken;
    }
    public void action(){

    }
    public int strRand(){
        int n=0;
        return n;
    }
    public int agiRand(){
        int n=0;
        return n;
    }
    public int staRand(){
        int n=0;
        return n;
    }

    public int chooseLevel(){
        int level = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            level = Integer.parseInt(br.readLine());
        }catch(Exception ie){
            System.out.println("1, 2, vagy 3, kerlek");
        }
        return level;
    }


    public Karakter create() {
        String valasz;
        String nev;
        int ero = 0;
        int ugyesseg = 0;
        int allokep = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ha harcost szeretnel, irj Harcos-t. Ha ijaszt, Ijasz-t.");
        try {
            valasz = br.readLine();
            if (valasz.equals("Harcos") ) {
                System.out.println("Kerlek, add meg a karaktered nevet");
                try {
                    valasz = br.readLine();
                    nev = valasz;
                    Karakter harcos = new Warrior(nev, "Harcos", 1, 0, 0, 0, 1, 4, 10);
                    ero = harcos.strRand();
                    ugyesseg = harcos.agiRand();
                    allokep = harcos.staRand();
                    harcos.setStrength(ero);
                    harcos.setAgility(ugyesseg);
                    harcos.setStamina(allokep);
                    return harcos;
                } catch (Exception ie) {
                    System.out.println("Kerlek, csak betuket hasznalj");
                }
            } else  {
                System.out.println("Kerlek, add meg a karaktered nevet");
                try {
                    valasz = br.readLine();
                    nev = valasz;
                    Karakter ijasz = new Archer(nev, "Ijasz", 1, 0, 0, 0, 1, 4, 10);
                    ero = ijasz.strRand();
                    ugyesseg = ijasz.agiRand();
                    allokep = ijasz.staRand();
                    ijasz.setStrength(ero);
                    ijasz.setAgility(ugyesseg);
                    ijasz.setStamina(allokep);
                    return ijasz;
                } catch (Exception ie) {
                    System.out.println("Kerlek, csak betuket hasznalj");
                }
            }
        } catch (Exception ie) {
            System.out.println("Kerlek, csak betuket hasznalj");
        }
        return null;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAC(int AC) {
        this.AC = AC;
    }

    public void setDamageD(int damageD) {
        this.damageD = damageD;
    }

    public void setAttackD(int attackD) {
        this.attackD = attackD;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setKlass(String klass) {
        this.klass = klass;
    }

    public void increaseDamage(int tamadoKocka, int sebzoKocka) {
        System.out.println("Karakter Increase Damage");
    }

    public void inceaseAC(int armor) {

    }

    public void chooseWarriorEquipment(Karakter karakter) {

    }
    public void chooseArcherEquipment(){
    }
    @Override
    public String toStringEquipment(Karakter kari){
        return "asd";
    }
}
