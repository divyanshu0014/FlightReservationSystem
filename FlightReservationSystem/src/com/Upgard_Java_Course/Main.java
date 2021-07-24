package com.Upgard_Java_Course;

public class Main {

    static void pirntTicket(ticket Ticket){
        String pnr = Ticket.getPnrNumber();
        System.out.println(pnr);
    }


    private static flight flight;

    public static void main(String[] args) {

        regularTicket Ticket = new regularTicket();
        Ticket.setPnrNumber("Abc-123");
        pirntTicket(Ticket);


        touristTicket Ticket_2 = new touristTicket();
        Ticket_2.setPnrNumber("Def-456");
        pirntTicket(Ticket_2);

   }
}
