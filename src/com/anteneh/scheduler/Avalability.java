package com.anteneh.scheduler;

public class Avalability{

    boolean monday = false;
    boolean tuesday = false;
    boolean wednesday = false;
    boolean thursday = false;
    boolean friday = false;
    boolean saturday = false;
    boolean sunday = false;



    Avalability ()
    {

    }

    Avalability (boolean monday, boolean tuesday, boolean wednesday, boolean thursday, boolean friday, boolean saturday, boolean sunday)
    {
        this.monday= monday;
        this.tuesday = tuesday;
        this.wednesday = wednesday;
        this.thursday = thursday;
        this.friday = friday;
        this.saturday = saturday;
        this.sunday = sunday;
    }

    public boolean isMonday() {
        return monday;
    }

    public void setMonday(boolean monday) {
        this.monday = monday;
    }

    public boolean isTuesday() {
        return tuesday;
    }

    public void setTuesday(boolean tuesday) {
        this.tuesday = tuesday;
    }

    public boolean isWednesday() {
        return wednesday;
    }

    public void setWednesday(boolean wednesday) {
        this.wednesday = wednesday;
    }

    public boolean isThursday() {
        return thursday;
    }

    public void setThursday(boolean thursday) {
        this.thursday = thursday;
    }

    public boolean isFriday() {
        return friday;
    }

    public void setFriday(boolean friday) {
        this.friday = friday;
    }

    public boolean isSaturday() {
        return saturday;
    }

    public void setSaturday(boolean saturday) {
        this.saturday = saturday;
    }

    public boolean isSunday() {
        return sunday;
    }

    public void setSunday(boolean sunday) {
        this.sunday = sunday;
    }

    public int getAvailableDays(){
        int availableDays=0;

        if (isMonday())
            availableDays++;
        if (isTuesday())
            availableDays++;
        if (isWednesday())
            availableDays++;
        if(isThursday())
            availableDays++;
        if(isFriday())
            availableDays++;
        if (isSaturday())
            availableDays++;
        if (isSunday())
            availableDays++;

        return availableDays;
    }

    public String toString ()
    {


        boolean mon = isMonday();
        boolean tues = isTuesday();
        boolean wed = isWednesday();
        boolean thur = isThursday();
        boolean fri = isFriday();
        boolean sat = isSaturday();
        boolean sun = isSunday();
        if (mon == true)
            System.out.println("Monday");
        if (tues == true)
            System.out.println("Tuesday");
        if (wed == true)
            System.out.println("Wednsday");
        if(thur == true)
            System.out.println("Thursday");
        if(fri ==true)
            System.out.println("Friday");
        if (sat == true)
            System.out.println("Saturday");
        if (sun == true)
            System.out.println("Sunday");

        /*return "Monday " + isMonday() +
                "   Tuesday" +isTuesday() +
                "   Wednesday" + isWednesday() +
                "   Thursday" + isThursday() +
                "   Friday"+ isFriday() +
                "   Saturday" + isSaturday() +
                "   Sunday" + isSunday();*/
        return " ";
    }
}
