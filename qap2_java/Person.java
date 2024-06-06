package qap2_java;

public class Person {
    private String lastName;
    private String firstName;
    private Address home;

    public Person(String lName,String fName,Address home){
        this.lastName =lName;
        this.firstName =fName;
        this.home =home;
    }

    public String toString(){
        return("Person: last name "+lastName+" first name "+firstName+" address "+home);
    }
}
