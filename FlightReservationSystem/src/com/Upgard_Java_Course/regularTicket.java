package com.Upgard_Java_Course;

public class regularTicket {
    public String pnrNumber;
    public String specialService;


    public String getSpecialServices(){
        return  specialService;
    }

    public void updateSpecialService(String input){
        specialService = input;

    }
}
