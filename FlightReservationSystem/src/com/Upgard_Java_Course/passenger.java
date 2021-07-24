package com.Upgard_Java_Course;


public class passenger {


    private static int idCounter;

    private static class address {
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
    private static class contact  {
        private String name;
        private String phone;

        public contact(String name, String phone){
            this.name = name;
            this.phone = phone;
        }

        public String getContactDetails(){
            return "Name: "+ this.name+"\n"+"Contact: "+ this.phone+"\n";
        }
        public String updateContactDetails(String Phone,String name){
            this.name = name;
            this.phone = Phone;

            return "Updated Contact Details";
        }


    }


    private int id;
    private String name;
    address Address;
    contact Contact;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    static {
        idCounter = 0;
    }


    public  passenger(){

    }

    public passenger( String name, String phoneNumber, String addressState,String addressStreet, String addressCity,String contactName,String contactNumber){
        this.id  = ++idCounter;
        this.name = name;
        this.Address = new address(addressStreet,addressCity,addressState);
        this.Contact = new contact(contactName,contactNumber);
    }

    String getAddressDetails(){
        return Address.Street+"\n"+ Address.City+"\n"+ Address.State;
    }
    String getContactDetails(){
        return Contact.name+"\n"+ Contact.phone;
    }

    public int getPassengerCount() {
        return idCounter;
    }
}
