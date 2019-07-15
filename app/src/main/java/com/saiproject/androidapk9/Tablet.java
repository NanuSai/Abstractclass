package com.saiproject.androidapk9;

public class Tablet extends SmartPhone {

    private int screenSize;

    public Tablet(String name, String screen, String keyboard, String operatingSystem, double cpuPower, double ram, int screenSize) {
        super(name, screen, keyboard, operatingSystem, cpuPower, ram);

        if(screenSize <= 0)
            throw new IllegalArgumentException("Screen Size should be greater than 0");

        this.screenSize = screenSize;
    }


    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    @Override
    public String toString() {
        return String.format("%s%n%s : %d",super.toString(),"Screen size:",getScreenSize());
    }
}
