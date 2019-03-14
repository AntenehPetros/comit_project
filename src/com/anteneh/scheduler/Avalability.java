package com.anteneh.scheduler;

import java.util.List;

public class Avalability {

    boolean monday = false;
    boolean tuesday = false;
    boolean wednesday = false;
    boolean thursday = false;
    boolean friday = false;
    boolean saturday = false;
    boolean sunday = false;


    Avalability() {

    }

    Avalability(boolean monday, boolean tuesday, boolean wednesday, boolean thursday, boolean friday, boolean saturday, boolean sunday) {
        this.monday = monday;
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

    public int getAvailableDays() {
        int availableDays = 0;

        if (isMonday())
            availableDays++;
        if (isTuesday())
            availableDays++;
        if (isWednesday())
            availableDays++;
        if (isThursday())
            availableDays++;
        if (isFriday())
            availableDays++;
        if (isSaturday())
            availableDays++;
        if (isSunday())
            availableDays++;

        return availableDays;
    }

    public String toString() {

        boolean mon = isMonday();
        boolean tues = isTuesday();
        boolean wed = isWednesday();
        boolean thur = isThursday();
        boolean fri = isFriday();
        boolean sat = isSaturday();
        boolean sun = isSunday();
        if (mon == true)
            System.out.print("\nMonday");
        if (tues == true)
            System.out.print("\nTuesday");
        if (wed == true)
            System.out.print("\nWednsday");
        if (thur == true)
            System.out.print("\nThursday");
        if (fri == true)
            System.out.print("\nFriday");
        if (sat == true)
            System.out.print("\nSaturday");
        if (sun == true)
            System.out.print("\nSunday");

        if (!isSunday() && !isTuesday() && !isWednesday() && !isThursday() && !isFriday() && !isSaturday() && !isSunday())
            System.out.println("    0 days");


        return "";
    }



    /*This one in the main class
    Avalability avalability = new Avalability();
    int []testArray;
    testArray =avalability.numberOfAvailableStaffForEachDay(staffList);
        for (int i=0; i<testArray.length; i++)
    {
        System.out.println(testArray[i]);
    }


    This is an alternative method to use to dispaly available staff and staff need each day

    public int[] numberOfAvailableStaffForEachDay(List<Staff> staffList) {
        int[] availableStaffs = {0, 0, 0, 0, 0, 0, 0};
        int availableOnMonday = 0;
        int availableOnTuesday = 0;
        int availableOnWednesday = 0;
        int availableOnThursday = 0;
        int availableOnFriday = 0;
        int availableOnSaturday = 0;
        int availableOnSunday = 0;


        for (int i = 0; i < staffList.size(); i++) {
            if (staffList.get(0).getAvalability().isMonday()) {
                availableOnMonday++;
            }

        }
        availableStaffs[0] = availableOnMonday;
        for (int i = 0; i < staffList.size(); i++) {
            if (staffList.get(0).getAvalability().isTuesday()) {
                availableOnTuesday++;
            }

        }
        availableStaffs[1] = availableOnTuesday;
        for (int i = 0; i < staffList.size(); i++) {
            if (staffList.get(0).getAvalability().isWednesday()) {
                availableOnWednesday++;
            }

        }
        availableStaffs[2] = availableOnWednesday;
        for (int i = 0; i < staffList.size(); i++) {
            if (staffList.get(0).getAvalability().isThursday()) {
                availableOnThursday++;
            }

        }
        availableStaffs[3] = availableOnThursday;
        for (int i = 0; i < staffList.size(); i++) {
            if (staffList.get(0).getAvalability().isFriday()) {
                availableOnFriday++;
            }

        }
        availableStaffs[4] = availableOnFriday;
        for (int i = 0; i < staffList.size(); i++) {
            if (staffList.get(0).getAvalability().isSaturday()) {
                availableOnSaturday++;
            }

        }
        availableStaffs[5] = availableOnSaturday;
        for (int i = 0; i < staffList.size(); i++) {
            if (staffList.get(0).getAvalability().isSunday()) {
                availableOnSunday++;
            }

        }
        availableStaffs[6] = availableOnSunday;

        return availableStaffs;

    }*/
}
