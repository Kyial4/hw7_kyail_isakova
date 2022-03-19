package com.company;

public class Medic extends Hero {
    private int healPoints;

    public String applySuperAbility(String superAbility) {
        return "Medic применил способность"+" " + superAbility;
    }
    public String increaseExperience(){
        return "Медик вылечил героя на 10%";
    }
}
