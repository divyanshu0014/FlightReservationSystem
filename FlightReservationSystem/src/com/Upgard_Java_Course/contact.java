package com.Upgard_Java_Course;

public class contact  {
    public String name;
    public String phone;
    public String street;
    public String city;
    public String state;




    public String getContactDetails(){
        return "Name: "+ this.name+"\n"+"Contact: "+ this.phone+"\n"+this.street+','+this.city+','+this.state;
    }
    public String updateContactDetails(String Phone,String Street, String city, String State){
        this.phone = Phone;
        this.street = Street;
        this.city = city;
        this.state = State;
        return "Updated Contact Details";
    }


}

