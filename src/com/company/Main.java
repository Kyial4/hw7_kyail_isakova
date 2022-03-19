package com.company;

public class Main {

    public static void main(String[] args) {

        Hero[] heroes= {new Magic(),new Medic(),new Warrior()};
        for (int i = 0; i < heroes.length ; i++) {
            heroesSuperAbility(heroes[i]);
        }
    }
    public static void heroesSuperAbility(Hero hero){
        System.out.println(new Magic().applySuperAbility("Magic"));
        System.out.println(new Medic().applySuperAbility("Medic"));
        System.out.println(new Warrior().applySuperAbility("Warrior"));
        System.out.println(new Medic().increaseExperience());

    }



}
