public class Person {
    private String firstName;
    private String lastName;
    private int age;

    /** Constructor receives three  parameters:
     * @param firstName- First name of the person
     * @param lastName- Last name of the person
     * @param age- Person age
     */
    public Person(String lastName,String firstName, int age) {

        this.lastName = lastName;
        this.firstName = firstName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Adjusted to match the output requirements
    @Override
    public String toString() {
        return this.lastName+" "+this.firstName+" "+this.age;
    }
}

