package com.company;

public class Magic extends Hero implements HavingSuperAbility{
    public String applySuperAbility(String superAbility) {
        return "Magic применил способность "+ superAbility;
    }

}
