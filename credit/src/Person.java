public class Person {

    private String lastName;
    private String firstName;
    private Address home;

    // Constructor
    public Person(String lastName, String firstName, Address home) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.home = home;
    }
    public Person(Person otherPerson) {
        this.lastName = otherPerson.lastName;
        this.firstName = otherPerson.firstName;
        this.home = otherPerson.home;
    }

    // Getters and Setters
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Address getHome() {
        return home;
    }

    public void setHome(Address home) {
        this.home = home;
    }

    // toString method
    @Override
    public String toString() {
        return firstName + " " + lastName + ", " + home;
    }

}
