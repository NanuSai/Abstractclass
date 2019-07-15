package com.saiproject.androidapk9;

public class Laptop extends Computer {

    private String touchPad;
    private double cpuPower;
    private double ram;


    public Laptop(String name, String screen, String keyboard, String touchPad, double cpuPower, double ram) {
        super(name, screen, keyboard);
        this.touchPad = touchPad;
        this.cpuPower = cpuPower;
        this.ram = ram;
    }

    public String getTouchPad() {
        return touchPad;
    }

    public void setTouchPad(String touchPad) {
        this.touchPad = touchPad;
    }

    public double getCpuPower() {
        return cpuPower;
    }

    public void setCpuPower(double cpuPower) {
        this.cpuPower = cpuPower;
    }

    public double getRam() {
        return ram;
    }


    @Override
    public double evaluatePerformance() {
        return getCpuPower()*getRam();
    }

    @Override
    public String toString() {

        return String.format("%s%n %s: %s",super.toString(),"TouchPad:",getTouchPad());
    }

    public void setRam(double ram) {
        this.ram = ram;
    }
}
