package com.Upgard_Java_Course;

public abstract class ticket {
    private String pnrNumber;
    private String departureLocation;
    private String destinationLocation;
    private String departureDateAndTime;
    private String arrivalDateAndTime;
    private String seatNumber;
    private String status;
    private int ticketPrice;
    private String flightDetails;
    flight Flight;
    passenger Passenger;


    public String getPnrNumber() {
        return pnrNumber;
    }

    public void setPnrNumber(String pnrNumber) {
        this.pnrNumber = pnrNumber;
    }

    public String getFlightDetails() {
        return flightDetails;
    }

    public void setFlightDetails(flight Flight) {
        this.flightDetails = flightDetails;
    }

    public String getDepartureLocation() {
        return departureLocation;
    }

    public void setDepartureLocation(String departureLocation) {
        this.departureLocation = departureLocation;
    }

    public String getDestinationLocation() {
        return destinationLocation;
    }

    public void setDestinationLocation(String destinationLocation) {
        this.destinationLocation = destinationLocation;
    }

    public String getDepartureDateAndTime() {
        return departureDateAndTime;
    }

    public void setDepartureDateAndTime(String departureDateAndTime) {
        this.departureDateAndTime = departureDateAndTime;
    }

    public String getArrivalDateAndTime() {
        return arrivalDateAndTime;
    }

    public void setArrivalDateAndTime(String arrivalDateAndTime) {
        this.arrivalDateAndTime = arrivalDateAndTime;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(int ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

//    ticket(){}

//    ticket(String pnr,passenger passenger,String departureDateAndTime,String departureLocation,String destinationLocation, String status, int ticketPrice,String seatNumber){
//        this.pnrNumber = pnr;
//        this.Passenger = passenger;
//        this.ticketPrice = ticketPrice;
//        this.destinationLocation = destinationLocation;
//        this.departureDateAndTime = departureDateAndTime;
//        this.status = status;
//        this.departureLocation = departureLocation;
//        this.seatNumber = seatNumber;
    ticket(String pnr, String destinationLocation,String departureLocation,String departureDateAndTime,String status, String seatNumber){
        this.pnrNumber = pnr;
        this.departureDateAndTime = departureDateAndTime;
        this.departureLocation = departureLocation;
        this.destinationLocation = destinationLocation;
        this.seatNumber = seatNumber;
    }

}

