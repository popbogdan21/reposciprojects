public class Persons {
    String firstName;
    String lastName;
    int age;


    public Persons(String p) {
        String[] personDetails = p.split("\\W+");
        this.lastName = personDetails[0];
        this.firstName = personDetails[1];
        this.age = Integer.parseInt(personDetails[2]);
    }

    @Override
    public String toString() {
        return this.lastName+" "+this.firstName+" "+this.age;
    }
}

