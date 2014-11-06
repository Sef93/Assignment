package com.company;


public interface Equipment {
    public void increaseDamage(int tamadoKocka, int sebzoKocka);
    public void inceaseAC(int armor);
    public void chooseWarriorEquipment(Karakter karakter);
    public void chooseArcherEquipment();
    public String toStringEquipment(Karakter kari);
}
