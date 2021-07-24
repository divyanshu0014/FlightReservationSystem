package com.Upgard_Java_Course;

public class address {
    private  String Street;
    private String City;
    private String State;


    public address(String Street, String City, String State){
        this.Street = Street;
        this.City = City;
        this.State = State;
    }

    public String getStreet() {
        return Street;
    }

    public void setStreet(String street) {
        Street = street;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public String getAddressDetails(){
        return "Address: "+" "+this.Street+','+this.City+','+this.State;
    }

    public String updateAddressDetails(String Street, String city, String State){
        setStreet(Street);
        setCity(city);
        setState(State);
        return "Updated Address";
    }


}
