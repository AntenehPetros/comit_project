package com.anteneh.scheduler;

public class TestMethodsClass {

    public void availableAndRequiredStaffsDisplay( Shifts shifts) {

        //the idea was to use this in the main method instead of putting all the code in the main. ********
        /*TestMethodsClass testDisplay = new TestMethodsClass();
        testDisplay.availableAndRequiredStaffsDisplay(shifts);  ********
        */

        System.out.println();
        System.out.println("==================================================");
        System.out.println("Required staffs for each days");
        System.out.println();
        System.out.println("Mon\t\tTue\t\tWed\t\tThu\t\tFri\t\tSat\t\tSun");
        System.out.println(shifts.getMonday() + "\t\t" +
                shifts.getTuesday() + "\t\t" +
                shifts.getWednesday() + "\t\t" +
                shifts.getThursday() + "\t\t" +
                shifts.getFriday() + "\t\t" +
                shifts.getSaturday() + "\t\t" +
                shifts.getSunday());
        System.out.println();
        System.out.println("Available staffs for each days");
        System.out.println();
        System.out.println("Mon\t\tTue\t\tWed\t\tThu\t\tFri\t\tSat\t\tSun");

        System.out.print(shifts.getMonday() + "\t\t");
        System.out.print(shifts.getTuesday() + "\t\t");
        System.out.print(shifts.getWednesday() + "\t\t");
        System.out.print(shifts.getThursday() + "\t\t");
        System.out.print(shifts.getFriday() + "\t\t");
        System.out.print(shifts.getSaturday() + "\t\t");
        System.out.print(shifts.getSunday() + "\t\t");


        System.out.println();
        System.out.println("==================================================");
        System.out.println();
    }
}
