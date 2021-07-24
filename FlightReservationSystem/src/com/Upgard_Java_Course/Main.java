package com.Upgard_Java_Course;

public class Main {

    public static void main(String[] args) {

    //Passenger Class: Initialisation and printing of attributes and methods on console.
        //Attributes:
        passenger Pass_1 = new passenger();
        Pass_1.name = "Abc";
        Pass_1.address = "ABCEHFG";
        Pass_1.email = "Abc@Xyz.com";
        Pass_1.phoneNumber = "1234567890";
        System.out.println(Pass_1.name);
        System.out.println(Pass_1.email);
        System.out.println(Pass_1.phoneNumber);
        System.out.println(Pass_1.address);


    //Flights Class: Initialisation and printing of attributes and methods on console.
        //Attributes:
            flight APi0001 = new flight();
            APi0001.flightNumber = "asdas";
            APi0001.seatsBooked = 1500;
        //Methods:

            System.out.println(APi0001.getFlightDetails());
            System.out.println(APi0001.getSeatsAvaialbe());


    //Contract Class: Initialisation and printing of attributes and methods on console.
        //Attributes:

    contact Contact_1 = new contact();
    Contact_1.name = "Abc";
    Contact_1.phone = "1234567890";
    Contact_1.street = "abc";
    Contact_1.city = "xyz";
    Contact_1.state = "Def";

    //Methods:
        System.out.println(Contact_1.getContactDetails());
	    Contact_1.updateContactDetails("2547896327", "Hij","bcd", "XYZ");
        System.out.println(Contact_1.getContactDetails());


    //regularTicket Class: Initialisation and printing of attributes and methods on console.
        //Attributes:
        regularTicket ticket = new regularTicket();
        ticket.pnrNumber = "123456789";
        ticket.specialService = "Water, Food, Snacks";
        System.out.println(ticket.pnrNumber);
        System.out.println(ticket.specialService);

        //Methods:
        System.out.println(ticket.getSpecialServices());
        ticket.updateSpecialService("Water,Food");
        System.out.println(ticket.getSpecialServices());


    //touristTicket Class: Initialisation and printing of attributes and methods on console.
         //Attributes:

        touristTicket ticket_1 = new touristTicket();
        System.out.println(ticket_1.hotelAddress);
        ticket_1.selectedPlaces();

        ticket_1.removeplaces();
        System.out.println(ticket_1.selectedLocations[0]);
    }
}
