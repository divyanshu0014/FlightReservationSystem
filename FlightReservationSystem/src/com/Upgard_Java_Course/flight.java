package com.Upgard_Java_Course;

public class flight {
    private String flightNumber;
    private String Airline;
    private int capacity = 4000;
    private int seatsBooked;

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getAirline() {
        return Airline;
    }

    public void setAirline(String airline) {
        Airline = airline;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getSeatsBooked() {
        return seatsBooked;
    }

    public void setSeatsBooked(int seatsBooked) {
        this.seatsBooked = seatsBooked;
    }

    public flight(){

    }


    public flight(String flightNumber, String airline){
        this.flightNumber = flightNumber;
        this.Airline = airline;

    }



    public String getFlightDetails(){
        String details = "Flight details: "+ this.flightNumber + "," +this.Airline;
        return details;
    }



    public String getSeatsAvaialbe(){
        int available = this.capacity - this.seatsBooked;
        return "Seats Available : "+  available;
    }


}
