package com.anteneh.scheduler;

public class Staff {
    private String name;
    private double wage;
    private int id;
    private Avalability avalability;

    Staff() {

    }

    Staff(String name, double wage, int id) {
        this.name = name;
        this.wage = wage;
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {

        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
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

    public String toString() {
        return getAvalability().toString();
    }
}
