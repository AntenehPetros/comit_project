package com.anteneh.scheduler;

import javax.xml.bind.SchemaOutputResolver;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class General {
    static List<Staff> staffList = new ArrayList<>(); //This list will hold values of Staff data type.
    static Shifts shifts = new Shifts();


    public static void main(String[] args) {

        System.out.println("\n\n");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t************************************");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t Welcome to smart-scheduling system");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t************************************");

        try {
            submain();
        } catch (InputMismatchException e) {
            System.out.println("You need to enter a valid value");
            submain();
        }

    }


    public static void submain() throws InputMismatchException {

        System.out.println("\n");
        System.out.println("\t\t--------------------");
        System.out.println("\t\tChoose from the menu");
        System.out.println("\t\t--------------------\n\n");
        System.out.println("Register new employee:             1\n" +
                "Submit your availability:          2\n" +
                "Required staff for each day:       3\n" +
                "See available Staff & Shift:       4\n" +
                "Generate schedule:                 5\n" +
                "Check vacant shifts:               6\n" +
                "Pick a shift:                      7\n" +
                "List of all employees:             8\n" +
                "exit:                              10\n\n");


        Scanner read = new Scanner(System.in);
        int menuIndex;

        menuIndex = read.nextInt();
        switch (menuIndex) {
            case 1:
                registerNewEmployee();
                break;
            case 2:
                availability(staffList);
                break;
            case 3:
                staffNeeded();
                break;

            case 4:
                availableStaffAndShift(staffList, shifts);
                break;

            case 5:
                scheduling(staffList, shifts);
                break;
            case 6:
                submain();
                //availableShifts();
                break;
            case 7:
                submain();
                //pickShift();break;

                break;
            case 8:
                listEmployee(staffList);
                break;

            case 10:
                exit();
            default:
                System.out.println("Please choose a valid option from 1-8");
                submain();

        }

        submain();
    }


    public static void registerNewEmployee() {


        Scanner read = new Scanner(System.in);
        System.out.print("Enter the name of the employee:       ");
        String newUserName = read.next();
        System.out.print("Enter hourly wage of the employee:    ");
        double wage = read.nextDouble();
        int id = staffList.size() + 1;

        Staff newStaff = new Staff(newUserName, wage, id);
        System.out.println();
        System.out.println("Registration Successful!");
        System.out.println("------------------------");
        System.out.println("Name:           " + newStaff.getName());
        System.out.println("Hourly wage:    " + newStaff.getWage());
        System.out.println("ID:             " + newStaff.getId());
        System.out.println("------------------------");

        staffList.add(newStaff);


    }


    // Once an employee is registered in the system he/she can submit their availablity using this method
    public static void availability(List<Staff> staffList) {
        Scanner read = new Scanner(System.in);


        if (staffList.size() != 0) {
            System.out.print("Enter staff id: ");
            int staffID = read.nextInt();
            System.out.println();
            if (staffID <= staffList.size()) {
                Staff staff = staffList.get(staffID - 1);

                boolean monday = false, tuesday = false, Wednesday = false, thursday = false, friday = false, saturdy = false, sunday = false;

                System.out.print("Are you avalabile on monday?      1 for yes and 0 for no:     ");
                int availableMonday = read.nextInt();
                if (availableMonday == 1) {
                    monday = true;

                }

                System.out.print("Are you avalabile on tuesday?     1 for yes and 0 for no:     ");
                int availableTuesday = read.nextInt();
                if (availableTuesday == 1) {
                    tuesday = true;

                }

                System.out.print("Are you avalabile on wednesday?    1 for yes and 0 for no:    ");
                int availableWednesday = read.nextInt();
                if (availableWednesday == 1) {
                    Wednesday = true;

                }

                System.out.print("Are you avalabile on thursday?    1 for yes and 0 for no:     ");
                int availableThursday = read.nextInt();
                if (availableThursday == 1) {
                    thursday = true;

                }

                System.out.print("Are you avalabile on friday?      1 for yes and 0 for no:     ");
                int availableFriday = read.nextInt();
                if (availableFriday == 1) {
                    friday = true;

                }

                System.out.print("Are you avalabile on saturday?    1 for yes and 0 for no:     ");
                int availableSaturday = read.nextInt();
                if (availableSaturday == 1) {
                    saturdy = true;

                }

                System.out.print("Are you avalabile on sunday?      1 for yes and 0 for no:     ");
                int availableSunday = read.nextInt();
                if (availableSunday == 1) {
                    sunday = true;

                }


                // we will use staffList [index] to access individual staff and set his/her Availability
                Avalability staffAvailability = new Avalability(monday, tuesday, Wednesday, thursday, friday, saturdy, sunday);
                staff.setAvalability(staffAvailability);
                System.out.println();
                System.out.println(staff.getName() + " is available on:");
                System.out.print("-----------------");
                System.out.println(staff.toString());
            } else
                System.out.println("Employee with this ID doesn't exist\nPlease contact the HR! Or try with the correct ID");


        } else System.out.println("There is no employee in the system. \n");


    }


    public static void staffNeeded() {
        //Shifts shifts = new Shifts(); declared on top of the class instead
        Scanner read = new Scanner(System.in);
        System.out.println("How many staffs do you need for each day?\n \tplease enter one by oen\n");
        System.out.print("Monday:           ");
        int monday = read.nextInt();
        shifts.setMonday(monday);

        System.out.print("Tuesday:          ");
        int tuesday = read.nextInt();
        shifts.setTuesday(tuesday);

        System.out.print("Wednesday:        ");
        int wednesday = read.nextInt();
        shifts.setWednesday(wednesday);

        System.out.print("Thursday:         ");
        int thursday = read.nextInt();
        shifts.setThursday(thursday);

        System.out.print("Friday:           ");
        int friday = read.nextInt();
        shifts.setFriday(friday);

        System.out.print("Saturday:         ");
        int saturday = read.nextInt();
        shifts.setSaturday(saturday);

        System.out.print("Sunday:           ");
        int sunday = read.nextInt();
        shifts.setSunday(sunday);
        System.out.println();


        System.out.println("Number of staffs required for: \n" +
                "--------------------------------" + "\n" +
                "Monday:     " + shifts.getMonday() + "\n" +
                "Tuesday:    " + shifts.getTuesday() + "\n" +
                "Wednsday:   " + shifts.getWednesday() + "\n" +
                "Thursday:   " + shifts.getThursday() + "\n" +
                "Friday:     " + shifts.getFriday() + "\n" +
                "Saturday:   " + shifts.getSaturday() + "\n" +
                "Sunday:     " + shifts.getSunday() + "\n");

    }

    public static void availableStaffAndShift(List<Staff> staffList, Shifts shifts) {

        Schedule schedule = new Schedule();
        schedule.availableStaffsAndRequiredStaffs(staffList, shifts);


    }

    public static void scheduling(List<Staff> staffList, Shifts shifts) {
        //int staffWithLeastAvailableDays;  // we will use this to assign a shift for a staff with the least availability

        int modayIndex = shifts.getMonday();
        System.out.print("Staff working on monday:       ");

        for (int i = 0; i <= modayIndex; i++) {
            if (shifts.getMonday() > 0 && i < staffList.size()) {
                if (staffList.get(i).getAvalability().isMonday()) {
                    System.out.print(staffList.get(i).getName() + "         \t\t");
                    shifts.setMonday(shifts.getMonday() - 1);

                }
            }

        }
        System.out.println();

        int tuesdayIndex = shifts.getTuesday();
        System.out.print("Staff working on tuesday:      ");

        for (int i = 0; i <= tuesdayIndex; i++) {
            if (shifts.getTuesday() > 0 && i < staffList.size()) {
                if (staffList.get(i).getAvalability().isTuesday()) {
                    System.out.print(staffList.get(i).getName() + "         \t\t");
                    shifts.setTuesday(shifts.getTuesday() - 1);

                }
            }

        }
        System.out.println();

        int wednesdayIndex = shifts.getWednesday();
        System.out.print("Staff working on wednesday:    ");

        for (int i = 0; i <= wednesdayIndex; i++) {
            if (shifts.getWednesday() > 0 && i < staffList.size()) {
                if (staffList.get(i).getAvalability().isWednesday()) {
                    System.out.print(staffList.get(i).getName() + "         \t\t");
                    shifts.setWednesday(shifts.getWednesday() - 1);

                }
            }

        }
        System.out.println();

        int thursdayIndex = shifts.getThursday();
        System.out.print("Staff working on thursday:     ");

        for (int i = 0; i <= thursdayIndex; i++) {
            if (shifts.getThursday() > 0 && i < staffList.size()) {
                if (staffList.get(i).getAvalability().isThursday()) {
                    System.out.print(staffList.get(i).getName() + "         \t\t");
                    shifts.setThursday(shifts.getThursday() - 1);

                }
            }

        }
        System.out.println();

        int fridayIndex = shifts.getFriday();
        System.out.print("Staff working on friday:       ");

        for (int i = 0; i <= fridayIndex; i++) {
            if (shifts.getFriday() > 0 && i < staffList.size()) {
                if (staffList.get(i).getAvalability().isFriday()) {
                    System.out.print(staffList.get(i).getName() + "         \t\t");
                    shifts.setFriday(shifts.getFriday() - 1);

                }
            }

        }
        System.out.println();

        int saturdayIndex = shifts.getSaturday();
        System.out.print("Staff working on saturday:     ");

        for (int i = 0; i <= saturdayIndex; i++) {
            if (shifts.getSaturday() > 0 && i < staffList.size()) {
                if (staffList.get(i).getAvalability().isSaturday()) {
                    System.out.print(staffList.get(i).getName() + "         \t\t");
                    shifts.setSaturday(shifts.getSaturday() - 1);

                }
            }

        }
        System.out.println();

        int sundayIndex = shifts.getSunday();
        System.out.print("Staff working on sunday:       ");

        for (int i = 0; i <= sundayIndex; i++) {
            if (shifts.getSunday() > 0 && i < staffList.size()) {
                if (staffList.get(i).getAvalability().isSunday()) {
                    System.out.print(staffList.get(i).getName() + "         \t\t");
                    shifts.setSunday(shifts.getSunday() - 1);

                }
            }

        }
        System.out.println();


    }


    public static void listEmployee(List<Staff> staffList) {
        System.out.println("=====================================================================");
        System.out.println("Name                    Wage                ID          Total availabe days");
        System.out.println("=====================================================================");
        for (int i = 0; i <= staffList.size(); i++) {
            if (i < staffList.size()) {
                int availableDays = 0;
                if (staffList.get(i).getAvalability() != null) {
                    availableDays = staffList.get(i).getAvalability().getAvailableDays();
                } else {
                    availableDays = 0;
                }
                System.out.println(staffList.get(i).getName() + "                   "
                        + staffList.get(i).getWage() + "              "
                        + staffList.get(i).getId() + "              "
                        + availableDays);
                System.out.println("---------------------------------------------------------------------");
            }


        }

        System.out.println();
        submain();
    }


    public static void exit() {
        System.exit(0);
    }
}


