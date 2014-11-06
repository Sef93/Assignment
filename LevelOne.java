package com.company;

/**
 * Created by Séf on 2014.11.05..
 */
public class LevelOne implements Kuldetes{
   public Karakter jatekos;
   public Warrior spawnBoss(){
        Warrior bossz = new Warrior("Asd", "Rofl", 1, 1, 1, 1, 1, 1, 1);
        bossz = new Warrior("Gurthag a gonosz", "Harcos", 1, bossz.strRand(), bossz.agiRand(), 15, 2, 10, 13);
        return bossz;
   }

    public LevelOne(Karakter jatekos) {
        this.jatekos = jatekos;
    }

    @Override
    public int getUpgradedArmor(Karakter jatekos) {
        int amount;
        if (jatekos.klass.equals("Harcos")){
             amount = Math.round(jatekos.agility);
        }else{
             amount = Math.round(jatekos.agility/3);
        }
        return amount;
    }

    @Override
    public int getUpgradedDamage(Karakter jatekos) {
        int amount;
        if (jatekos.klass.equals("Harcos")){
            amount = Math.round(jatekos.strength/3);
        }else{
            amount = Math.round(jatekos.agility);
        }
        return amount;
    }

    @Override
    public int tamadas(Karakter jatekos) {
        int n = 0;
            n = (int) (Math.random() * 20) +1;
        return n;
    }

    @Override
    public int sebzes(Karakter jatekos) {
        int n = 0;
        for (int i = 0; i<=jatekos.attackD; i++)
        n = n + (int ) (Math.random()* jatekos.damageD) + 1;
        return n;
    }

    public void harc(Karakter jatekos, Karakter boss){
        int playerHP = jatekos.stamina*3;
        int bossHP = boss.stamina*10;
        int playerDamage = getUpgradedDamage(jatekos);
        int playerAC = getUpgradedArmor(jatekos);
        int i = 0;
        int damageDone = 0;
        System.out.println("Megkezdodik a harc!");
        if (jatekos.klass.equals("Harcos")) {

            while (bossHP > 0 && playerHP > 0) {
                i++;
                    if (i % 2 == 0){
                        playerDamage = playerDamage + 1;
                        playerAC = playerAC - 1;
                    }
                if (tamadas(jatekos)>boss.AC){
                        int damageDealt = (sebzes(jatekos) + playerDamage);
                        bossHP = bossHP - damageDealt;
                        System.out.println(boss.name + " elveszitett " + damageDealt + " HP-t. Maradt neki:" + bossHP);
                    if (tamadas(boss)>jatekos.AC){
                        int damageTaken = sebzes(boss);
                        playerHP = playerHP - damageTaken;
                        System.out.println(jatekos.name + " elveszitett " + damageTaken + " HP-t. Maradt neki:" + playerHP);
                    }
                }
            }
        }else{
            while (bossHP > 0 && playerHP > 0) {
                i++;
                    if (i % 5 == 0){
                        playerDamage = playerDamage + 5;
                        playerAC = playerAC + 3;
                }
                if (tamadas(jatekos)>boss.AC){
                    int asd = (sebzes(jatekos) + playerDamage);
                         bossHP = bossHP - asd;
                         System.out.println(boss.name + " elveszitett" + asd + " HP-t. Maradt neki:" + bossHP);
                    if (tamadas(boss)>jatekos.AC){
                        int asdasd = sebzes(boss);
                        playerHP = playerHP - asdasd;
                        System.out.println(jatekos.name + " elveszitett" + asdasd + " HP-t. Maradt neki:" + playerHP);
                    }
                }
            }
        }
   }


}
