package com.anteneh.scheduler;

import java.util.List;

public class Schedule {

    List<Staff> staffList;
    private Shift shift;

    public Schedule() {
    }

    Schedule(List<Staff> staffList, Shift shift){
        this.staffList = staffList;
        this.shift = shift;
    }



    public List<Staff> getStaffList() {
        return staffList;
    }

    public void setStaffList(List<Staff> staffList) {
        this.staffList = staffList;
    }

    public Shift getShift() {
        return shift;
    }

    public void setShift(Shift shift) {
        this.shift = shift;
    }
}
