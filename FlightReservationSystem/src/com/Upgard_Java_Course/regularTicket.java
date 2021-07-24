package com.Upgard_Java_Course;

public class regularTicket {
    private String pnrNumber;

    public String getPnrNumber() {
        return pnrNumber;
    }

    public void setPnrNumber(String pnrNumber) {
        this.pnrNumber = pnrNumber;
    }

    public String getSpecialService() {
        return specialService;
    }

    public void setSpecialService(String specialService) {
        this.specialService = specialService;
    }

    private String specialService;
    flight Flight;


    regularTicket(String pnr, String specialService, flight Flight){
        this.pnrNumber = pnr;
        this.specialService = specialService;
        this.Flight = Flight;
    }

    public String getSpecialServices(){
        return  specialService;
    }

    public void updateSpecialService(String input){
        specialService = input;

    }
}
