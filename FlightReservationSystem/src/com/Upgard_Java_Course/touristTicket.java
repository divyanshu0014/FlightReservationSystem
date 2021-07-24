package com.Upgard_Java_Course;
import java.util.Scanner;

public class touristTicket extends ticket {
    String[] selectedLocations = new String[5];
    private String hotelAddress = "Hotel abc,Abc city,Abc";
    Scanner sc = new Scanner(System.in);
    String name;
    flight Flight;
    String[] newarr = new String[6];



    public String getHotelAddress() {
        return hotelAddress;
    }

    public void setHotelAddress(String hotelAddress) {
        this.hotelAddress = hotelAddress;
    }



        touristTicket(String pnr,String departurelocation, String departuredateAndTime, String destinationLocation, String status,String seatNumber , String hotelAddress, flight Flight){
        super(pnr,destinationLocation,departurelocation,departuredateAndTime,status,seatNumber);
        this.hotelAddress = hotelAddress;
        this.Flight = Flight;
    }

    public void selectedPlaces() {
        for (int i = 0; i <= selectedLocations.length-1; i++) {
            System.out.println("Name a place to Add: ");
            String name = sc.nextLine();
            selectedLocations[i] = name;
        }
    }

    public String[] removeplaces() {
        System.out.println("Do you wish to remove all selected places: ");
        name = sc.nextLine();
        if(name.equalsIgnoreCase("yes")) {
            for (int i = 0; i <= selectedLocations.length - 1; i++) {
                selectedLocations[i] = newarr[i];
            }
        }return  selectedLocations;
    }
}




