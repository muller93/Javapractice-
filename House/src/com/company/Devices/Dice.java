package com.company.Devices;

import java.util.Random;

public class Dice {
    Random rand = new Random();

    public int dice(){
        int num = rand.nextInt(6) + 1;
    return num;
    }
}