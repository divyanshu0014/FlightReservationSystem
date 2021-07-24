package com.Upgard_Java_Course;

public class flight {
    public String flightNumber;
    public int capacity = 4000;
    public int seatsBooked;



    public flight(){

    }

    public String getFlightDetails(){
        String details = "Flight details: "+ flightNumber + "," +  capacity + " ,"+ seatsBooked;
        return details;
    }



    public String getSeatsAvaialbe(){
        int available = capacity - seatsBooked;
        return "Seats Available : "+  available;
    }


}
