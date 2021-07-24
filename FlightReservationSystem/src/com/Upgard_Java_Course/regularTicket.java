package com.Upgard_Java_Course;

public class regularTicket extends ticket {
    private String specialService;
    flight Flight;
    public String getSpecialService() {
        return specialService;
    }

    public void setSpecialService(String specialService) {
        this.specialService = specialService;
    }

    regularTicket(String pnr,String departurelocation, String departuredateAndTime, String destinationLocation, String status,String seatNumber, String specialService, flight Flight){
        super(pnr,destinationLocation,departurelocation,departuredateAndTime,status,seatNumber);
        this.specialService = specialService;
        this.Flight = Flight;
    }


}
