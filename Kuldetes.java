package com.company;

/**
 * Created by Séf on 2014.11.06..
 */
public interface Kuldetes {
    Karakter spawnBoss();
    void harc(Karakter jatekos, Karakter boss);
    int getUpgradedDamage(Karakter jatekos);
    int getUpgradedArmor(Karakter jatekos);
    int tamadas(Karakter jatekos);
    int sebzes(Karakter jatekos);
}
