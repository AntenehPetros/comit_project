package com.anteneh.scheduler;

public class Staff {
    private String name;
    private double wage;
    private Avalability avalability;

    Staff(){

    }
    Staff(String name, double wage){
        this.name=name;
        this.wage=wage;
    }

    public String getName() {
        //float f= 2.35f; <--- Just to show you that floats are stupid
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public Avalability getAvalability() {
        return avalability;
    }

    public void setAvalability(Avalability avalability) {
        this.avalability = avalability;
    }

    public String  toString ()
    {
        return "Staff " + name + " is avalable on " + getAvalability().toString();
    }
}
