package com.epam.mjc.stage0;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }
    public void getDescription(){
        System.out.println("This animal is mostly "+color+". It has "+numberOfPaws+" paws and ");
        if(hasFur){
            System.out.print("a fur.");
        }else
        {
            System.out.print("no fur.");
        }
    }
}
