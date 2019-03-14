package com.anteneh.scheduler;

import java.util.List;

public class Schedule {

    List<Staff> staffList;
    private Shifts shifts;

    public Schedule() {
    }

    Schedule(List<Staff> staffList, Shifts shifts){
        this.staffList = staffList;
        this.shifts = shifts;
    }



    public List<Staff> getStaffList() {
        return staffList;
    }

    public void setStaffList(List<Staff> staffList) {
        this.staffList = staffList;
    }

    public Shifts getShifts() {
        return shifts;
    }

    public void setShifts(Shifts shifts) {
        this.shifts = shifts;
    }


    public static void availableStaffsAndRequiredStaffs(List<Staff> staffList, Shifts shifts){

        //To check how many staffs there ae in the system
        System.out.println("Total number of Staffs in the system    : " + staffList.size());

        //****************************************************************************//
        System.out.println();
        System.out.println("\t\t\tRequired staffs for each days");
        System.out.println("====================================================");
        System.out.println("Mon\t\tTue\t\tWed\t\tThu\t\tFri\t\tSat\t\tSun");
        System.out.println("====================================================");
        System.out.println(shifts.getMonday() + "\t\t" +
                shifts.getTuesday() + "\t\t" +
                shifts.getWednesday() + "\t\t" +
                shifts.getThursday() + "\t\t" +
                shifts.getFriday() + "\t\t" +
                shifts.getSaturday() + "\t\t" +
                shifts.getSunday());
        System.out.println("----------------------------------------------------");
        System.out.println();
        System.out.println();
        System.out.println("\t\t\tAvailable staffs for each days");
        System.out.println("====================================================");
        System.out.println("Mon\t\tTue\t\tWed\t\tThu\t\tFri\t\tSat\t\tSun");
        System.out.println("====================================================");


        //***********************************************************************//

        int[] availableStaffs = {0, 0, 0, 0, 0, 0, 0};
        

        for (int i = 0; i < staffList.size(); i++) {
            if (staffList.get(i).getAvalability() !=null) {
                if (staffList.get(i).getAvalability().isMonday()) {
                    availableStaffs[0]++;
                }

            }
        }
        //availableStaffs[0] = availableOnMonday;
        for (int i = 0; i < staffList.size(); i++) {
            if (staffList.get(i).getAvalability() !=null) {
                if (staffList.get(i).getAvalability().isTuesday()) {
                    //availableOnTuesday++;
                    availableStaffs[1]++;
                }

            }
        }
        //availableStaffs[1] = availableOnTuesday;
        for (int i = 0; i < staffList.size(); i++) {
            if (staffList.get(i).getAvalability() !=null) {
                if (staffList.get(i).getAvalability().isWednesday()) {
                    //availableOnWednesday++;
                    availableStaffs[2]++;
                }

            }
        }
        //availableStaffs[2] = availableOnWednesday;
        for (int i = 0; i < staffList.size(); i++) {
            if (staffList.get(i).getAvalability()!=null) {
                if (staffList.get(i).getAvalability().isThursday()) {
                    //availableOnThursday++;
                    availableStaffs[3]++;
                }

            }
        }
        //availableStaffs[3] = availableOnThursday;
        for (int i = 0; i < staffList.size(); i++) {
            if (staffList.get(i).getAvalability()!=null) {
                if (staffList.get(i).getAvalability().isFriday()) {
                    //availableOnFriday++;
                    availableStaffs[4]++;
                }

            }
        }
        //availableStaffs[4] = availableOnFriday;
        for (int i = 0; i < staffList.size(); i++) {
            if (staffList.get(i).getAvalability() !=null) {
                if (staffList.get(i).getAvalability().isSaturday()) {
                    //availableOnSaturday++;
                    availableStaffs[5]++;
                }

            }
        }
        //availableStaffs[5] = availableOnSaturday;
        for (int i = 0; i < staffList.size(); i++) {
            if (staffList.get(i).getAvalability() !=null) {
                if (staffList.get(i).getAvalability().isSunday()) {
                    //availableOnSunday++;
                    availableStaffs[6]++;
                }

            }
        }
        //availableStaffs[6] = availableOnSunday;


        System.out.print(availableStaffs[0] + "\t\t");
        System.out.print(availableStaffs[1] + "\t\t");
        System.out.print(availableStaffs[2] + "\t\t");
        System.out.print(availableStaffs[3] + "\t\t");
        System.out.print(availableStaffs[4] + "\t\t");
        System.out.print(availableStaffs[5] + "\t\t");
        System.out.println(availableStaffs[6] + "\t\t");
        System.out.println("----------------------------------------------------");


        System.out.println();
        System.out.println();


    }
}
