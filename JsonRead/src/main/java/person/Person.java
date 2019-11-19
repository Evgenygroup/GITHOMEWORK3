package person;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import java.util.Arrays;


public class Person {
    private String firstName;
    private String lastName;
    private Address address;
    private Phone[] phones;

    public Person() { }

    public Person(String firstName, String lastName, Address address, Phone[] phones) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phones = phones;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setPhones(Phone[] phones) {
        this.phones = phones;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address=" + address +
                ", phones=" + Arrays.toString(phones) +
                '}';
    }
}
