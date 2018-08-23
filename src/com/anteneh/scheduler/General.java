package com.anteneh.scheduler;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class General {

    static List<Staff> staffList = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("                                    Welcome to smart-Scheduler system\n\n");

        submain();

    }

    // This is menu method and is called by the main method, it is a recursive method in which it calls it self until user choose to terminate
    public static void submain() {

        System.out.println("                    Choose from the menu\n");
        System.out.println("Register new employee:  1\n" +
                "Submit availability:    2\n" +
                "Check schedule:         3\n" +
                "Pick a shift:           4\n" +
                "Required staff #:       5\n" +
                "Check available shifts: 6\n" +
                "List of all employees:  7\n" +
                "exit:                   8\n\n");


        Scanner read = new Scanner(System.in);
        int menuIndex = read.nextInt();
        switch (menuIndex) {
            case 1:
                registorNewEmployee();
                break;
            case 2:
                avalibility(staffList);
                break;
            //case 3: schedule();break;
            //case 4: pickShift();break;
            case 5:
                staffNeeded();
                break;
            //case 6: availableShifts();
            case 7:
                listEmployee(staffList);

            case 8:
                exit();
            default:
                System.out.println("You choose wrong option, try again!");
        }
        submain();
    }


    //This method is used to register new employee by providing detail enformation

    public static void registorNewEmployee() {


        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter the name of the employee:       ");
        String newUserName = userInput.next();
        System.out.print("Enter hourly wage of the employee:    ");
        double wage = userInput.nextDouble();
        int id = staffList.size() + 1;

        Staff newStaff = new Staff(newUserName, wage, id);
        System.out.println();
        System.out.println("Registration Successful");
        System.out.println("New employee detail");
        System.out.println("Name: " + newStaff.getName());
        System.out.println("Hourly wage: " + newStaff.getWage());
        System.out.println("ID:    " + newStaff.getId());

        staffList.add(newStaff);


    }

    // Once an employee is registered in the system he/she can submit their availablity using this method
    public static void avalibility(List<Staff> staffList) {
        Scanner userInput = new Scanner(System.in);

        // first check if the list is empty or not
        // if empty return there are no employees
        //if not empty ask for the staff id and check if that id is equal or less than size
        //if its less than get the if from list and set availability


        int staffListSize = staffList.size();
        if (staffListSize != 0) {
            System.out.print("Enter staff id: ");
            int staffID = userInput.nextInt();
            System.out.println();
            if (staffID <= staffList.size()) {
                Staff staff = staffList.get(staffID - 1);
                boolean monday = false, tuesday = false, wednsday = false, thursday = false, friday = false, saturdy = false, sunday = false;

                System.out.print("Are you avalabile on monday?      1 for yes and 0 for no:     ");
                int availableMonday = userInput.nextInt();
                if (availableMonday == 1)
                    monday = true;

                System.out.print("Are you avalabile on tuesday?     1 for yes and 0 for no:     ");
                int availableTuesday = userInput.nextInt();
                if (availableTuesday == 1)
                    tuesday = true;

                System.out.print("Are you avalabile on wednsday?    1 for yes and 0 for no:     ");
                int availableWednsday = userInput.nextInt();
                if (availableWednsday == 1)
                    wednsday = true;

                System.out.print("Are you avalabile on thursday?    1 for yes and 0 for no:     ");
                int availableThursday = userInput.nextInt();
                if (availableThursday == 1)
                    thursday = true;

                System.out.print("Are you avalabile on friday?      1 for yes and 0 for no:     ");
                int availableFriday = userInput.nextInt();
                if (availableFriday == 1)
                    friday = true;

                System.out.print("Are you avalabile on saturday?    1 for yes and 0 for no:     ");
                int availableSaturday = userInput.nextInt();
                if (availableSaturday == 1)
                    saturdy = true;

                System.out.print("Are you avalabile on sunday?      1 for yes and 0 for no:     ");
                int availableSunday = userInput.nextInt();
                if (availableSunday == 1)
                    sunday = true;


                // we will use staffList [index] to access individual staff and set his/her avalibility
                Avalability staffAvalibility = new Avalability(monday, tuesday, wednsday, thursday, friday, saturdy, sunday);
                staff.setAvalability(staffAvalibility);
                System.out.println();
                System.out.println(staff.getName() + " is available on:");
                System.out.println(staff.toString());
            } else
                System.out.println("Employee with this ID doesn't exist\nPlease contact the HR! Or try with the correct ID");


        } else System.out.println("There is no employee in the system. \n");


    }

    public static void staffNeeded() {
        Scanner read = new Scanner(System.in);
        System.out.println("How many staffs do you need for each day?\n \tplease enter one by oen\n");
        System.out.print("Monday:           ");
        int monday = read.nextInt();
        System.out.println();

        System.out.print("Tuesday:          ");
        int tuesday = read.nextInt();
        System.out.println();

        System.out.print("Wednsday:         ");
        int wednsday = read.nextInt();
        System.out.println();

        System.out.print("Thursday:         ");
        int thursday = read.nextInt();
        System.out.println();

        System.out.print("Friday:           ");
        int friday = read.nextInt();
        System.out.println();

        System.out.print("Saturday:         ");
        int saturday = read.nextInt();
        System.out.println();

        System.out.print("Sunday:           ");
        int sunday = read.nextInt();
        System.out.println();

        Shift requiredShifts = new Shift(monday, tuesday, wednsday, thursday, friday, saturday, sunday);
        System.out.println(requiredShifts.toString());

        int sum = monday + tuesday + wednsday + thursday + friday + saturday + sunday;
        System.out.println("Total number staffs needed for this week is:    " + sum);


    }


    public static void listEmployee(List<Staff> staffList) {
        System.out.println("Name                Wage             ID         Total availabe days");
        for (int i = 0; i <= staffList.size(); i++) {
            if(i < staffList.size()) {
                int availableDays=0;
                if(staffList.get(i).getAvalability() != null)
                    availableDays=staffList.get(i).getAvalability().getAvailableDays();
                else
                    availableDays=0;
                System.out.println(staffList.get(i).getName() + "                   "
                        + staffList.get(i).getWage() + "              "
                        + staffList.get(i).getId() + "              "
                        + availableDays);

            }else submain();
        }System.out.println();

    }


    public static void exit() {
        System.exit(0);
    }


}








        /*Staff S1 = new Staff("Anteneh",30);
        Avalability s1Avalability = new Avalability(
                true,
                true,
                true,
                false,
                false,
                false,
                false);
        S1.setAvalability(s1Avalability);
        staffList.add(S1);


        Staff S2 = new Staff("Beraki",11.15);
        Avalability s2Avalability1 = new Avalability(
                true,
                true,
                true,
                true,
                true,
                false,
                true);
        S2.setAvalability(s2Avalability1);
        staffList.add(S2);

        Shift shift=new Shift(3, 4, 5, 2, 4, 1, 2);*/

//Schedule shedule= new Schedule(staffList, shift);
// shedule.genetateSheduele();


        /*System.out.println("This is from Staff object " + S1.toString());
        System.out.println("We have " + staffList.size() + " employees!");
        System.out.println(staffList.get(1).getWage());

        System.out.println("We have " + staffList.get(0).getAvalability().isFriday() + " employees!");
        System.out.println("We have " + staffList.get(1).getAvalability().isFriday() + " employees!");


         System.exit(0);


         public static void database(Staff staff)
    {
        List<Staff> staffList = new ArrayList<>();
        staffList.add(staff);

        //System.out.println(staffList.size());
    }
*/
