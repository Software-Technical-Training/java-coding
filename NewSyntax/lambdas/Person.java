package NewSyntax.lambdas;

import java.util.Arrays;
import java.util.Comparator;

public class Person {
    private String firstName;
    private String lastName;
    
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String toString(){
        return firstName + " " + lastName;
    }

    public final static Comparator<Person> compareFirstName = (lhs,rhs) -> lhs.firstName.compareTo(rhs.firstName);
    public final static Comparator<Person> compareLastName = (lhs,rhs) -> lhs.lastName.compareTo(rhs.lastName);

    public static void main(String[] args) {
        Person[] people = new Person[] {
            new Person("Amit","Sharma"),
            new Person("Layla","Rodriguez"),
            new Person("David","Couring"),
            new Person("Zhao","Chao")
        };

        for (Person person : people) {
            System.out.println(person);
        }

        Arrays.sort(people,Person.compareFirstName);

        System.out.println("#############Sorted by FirstName");
        for (Person person : people) {
            System.out.println(person);
        }

        Arrays.sort(people,Person.compareLastName);

        System.out.println("$$$$$$$$$$$$$Sorted by LastName");
        for (Person person : people) {
            System.out.println(person);
        }

    }
    
    
    
}
