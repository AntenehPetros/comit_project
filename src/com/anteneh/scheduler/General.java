package com.anteneh.scheduler;

import java.util.ArrayList;
import java.util.List;

public class General {
    public static void main (String [] args){

        List<Staff> staffList=new ArrayList<>();

        Staff staff = new Staff("Anteneh",30);
        Avalability avalability = new Avalability(
                true,
                true,
                true,
                false,
                false,
                false,
                false);
        staff.setAvalability(avalability);
        staffList.add(staff);

        Staff staff1 = new Staff("Beraki",11.15);
        Avalability avalability1 = new Avalability(
                true,
                true,
                true,
                true,
                true,
                false,
                true);
        staff1.setAvalability(avalability1);
        staffList.add(staff1);



        System.out.println("This is from Staff object "+staff.toString());
        System.out.println("We have "+ staffList.size() + " employees!");
        System.out.println(staffList.get(1).getWage());



    }



}
