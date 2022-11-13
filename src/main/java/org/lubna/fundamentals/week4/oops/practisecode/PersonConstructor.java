package org.lubna.fundamentals.week4.oops.practisecode;

public class PersonConstructor {
    public static void main(String[] args) {
        PersonInformation lubna = new PersonInformation("Lubna" , "Farheen", "Salauddinkhan");
        System.out.println(lubna.toString());

        PersonInformation tom = new PersonInformation("Tom");
        System.out.println(tom.toString());
    }
}

class PersonInformation {
    private String firstName;
    private String middleName;
    private String lastName;

    public PersonInformation(String firstName) {
        if (firstName == null) {
            throw new IllegalArgumentException("First name cannot be null ");
        }
        this.firstName = firstName;
    }

    public PersonInformation(String firstName , String lastName) {
        this(firstName);
        if (lastName == null) {
            throw new IllegalArgumentException("Last name cannot be null ");
        }
        this.lastName = lastName;
    }

    public PersonInformation(String firstName , String middleName , String lastName) {
        this(firstName , lastName);
        this.middleName = middleName;
    }

    @Override
    public String toString() {
        return "PersonInformation{" +
                "firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}




