package qap2_java;

public class Address {
    private String street;
    private String city;
    private String provence;
    private String zip;

    public Address(String street, String city,String provence,String zip){
        this.street =street;
        this.city =city;
        this.provence =provence;
        this.zip =zip;
    }

    public String toString(){
        return("Address: street "+street+" city "+city+" provence "+provence+" zip "+zip);
    }
}
