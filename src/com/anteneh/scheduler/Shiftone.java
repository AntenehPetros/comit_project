package com.anteneh.scheduler;

public class Shiftone {


    private int [] availableShifts =  {0,0,0,0,0,0,0};

    Shiftone(){

    }

    Shiftone(int [] availableShifts){
        this.availableShifts = availableShifts;
    }
    public void setAvailableShifts(int [] availableShifts){
        this.availableShifts = availableShifts;
    }

    public int [] getAvailableShifts (){

        return availableShifts;
    }

    public String toString (){

        return "Number of staffs required for: \n" +
                "Monday:     " + availableShifts[0] + "\n" +
                "Tuesday:    " + availableShifts[1] + "\n" +
                "Wednsday:   " + availableShifts[2] + "\n" +
                "Thursday:   " + availableShifts[3] + "\n" +
                "Friday:     " + availableShifts[4] + "\n" +
                "Saturday:   " + availableShifts[5] + "\n" +
                "Sunday:     " + availableShifts[6] + "\n";
    }

    /*private int monday;
    private int tuesday;
    private int wednesday;
    private int thursday;
    private int friday;
    private int saturday;
    private int sunday;

    Shiftone(int monday, int tuesday, int wednesday, int thursday, int friday, int saturday, int sunday) {
        this.monday = monday;
        this.tuesday = tuesday;
        this.wednesday = wednesday;
        this.thursday = thursday;
        this.friday = friday;
        this.saturday = saturday;
        this.sunday = sunday;
    }

    public int getMonday() {
        return monday;
    }

    public void setMonday(int monday) {
        this.monday = monday;
    }

    public int getTuesday() {
        return tuesday;
    }

    public void setTuesday(int tuesday) {
        this.tuesday = tuesday;
    }

    public int getWednesday() {
        return wednesday;
    }

    public void setWednesday(int wednesday) {
        this.wednesday = wednesday;
    }

    public int getThursday() {
        return thursday;
    }

    public void setThursday(int thursday) {
        this.thursday = thursday;
    }

    public int getFriday() {
        return friday;
    }

    public void setFriday(int friday) {
        this.friday = friday;
    }

    public int getSaturday() {
        return saturday;
    }

    public void setSaturday(int saturday) {
        this.saturday = saturday;
    }

    public int getSunday() {
        return sunday;
    }

    public void setSunday(int sunday) {
        this.sunday = sunday;
    }

    public int totalStaffRequired() {
        int totalStaffRequired = getMonday() + getTuesday() + getWednesday() + getThursday() + getFriday() + getSaturday() + getSunday();
        return totalStaffRequired;

    }



    public String toString() {
        return "Number of staffs required for: \n" +
                "Monday:     " + getMonday() + "\n" +
                "Tuesday:    " + getTuesday() + "\n" +
                "Wednsday:   " + getWednesday() + "\n" +
                "Thursday:   " + getThursday() + "\n" +
                "Friday:     " + getFriday() + "\n" +
                "Saturday:   " + getSaturday() + "\n" +
                "Sunday:     " + getSunday() + "\n";
    }
*/
}
