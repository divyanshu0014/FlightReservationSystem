package com.Upgard_Java_Course;

public class Main {

    private static flight flight;

    public static void main(String[] args) {

        flight A01 = new flight();
        //Uncomment the line below to check if private attribues are accessible.
//        A01.flightNumber = "546468";
        A01.setFlightNumber("546468");
        System.out.println(A01.getFlightNumber());
    }
}
