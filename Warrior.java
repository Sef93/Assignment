package com.company;
import java.io.*;

/**
 * Created by Séf on 2014.11.05..
 */
public class Warrior extends Karakter{
    public Warrior(String name, String klass, int level, int strength, int agility, int stamina, int attackD, int damageD, int AC) {
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
        int n = (int )(Math.random() * 20 + 10);
        return n;
    }

    @Override
    public int chooseLevel() {
        return super.chooseLevel();
    }

    @Override
    public int staRand() {
        int n = (int )(Math.random() * 15 + 8);
        return n;
    }

    @Override
    public int agiRand() {
        int n = (int )(Math.random() * 1 + 5);
        return n;
    }

    @Override
    public String toString(){
        String ki = (this.name + " a nagy " + this.klass + ", kinek ereje " + this.strength + ", ugyessege " + this.agility + ", allkepessege pedig " + this.stamina + " keszen all a kalandra!");
        return ki;
    }
    @Override
        public void increaseDamage(int tamadoKocka, int sebzoKocka){
        System.out.println("ANYAD FASZAT");
        this.attackD = tamadoKocka;
        this.damageD = sebzoKocka;
    }
    @Override
    public void chooseWarriorEquipment(Karakter karakter){
        int choice = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Milyen fegyvert szeretnel?");
        System.out.println("1/ Kasza (2d8 sebzes), 2/ Kard + Pajzs (1d6 sebzes, +4 AC), vagy 3/ Fejsze (3d4 sebzés)");
        try{
            choice = Integer.parseInt(br.readLine());
            switch (choice) {
                case 1: karakter.increaseDamage(2, 8); break;
                case 2: karakter.increaseDamage(1, 6); inceaseAC(4); break;
                case 3: karakter.increaseDamage(1, 8); break;
            }
        } catch (Exception ie){
            System.out.println("Nem szamot adtal meg:(");
        }
    }

    @Override
    public void inceaseAC(int armor) {
        this.AC = AC + armor;
    }
    @Override
    public String toStringEquipment(Karakter kari){
        String ki = " ";
            ki = ("Armorod " + this.AC + " es sebzeshez " + this.attackD + "d" + this.damageD + "-t dobsz.");
        return ki;
    }
}
