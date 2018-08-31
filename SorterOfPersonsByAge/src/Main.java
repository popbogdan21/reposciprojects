
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int noOfPersons = 0;
        String tempString = "";
        Scanner scan = new Scanner(System.in);
        // reading number of persons
        System.out.println("Cate persoane doriti sa introduceti?");
        noOfPersons = Integer.parseInt(scan.nextLine());
        Person[] personArray = new Person[noOfPersons];

        // reading  operations for persons- will not work unless the input is provided as requested
        // i did not extend the validation of the inpiut becausse we had also as an option for the homework to hardcode
        // the array

        System.out.println("Introduceti fiecare persoana dupa " +
                "modelul 'Nume Prenume Varsta' apoi apasati enter");
        for (int i = 0; i < noOfPersons; i++) {
            System.out.println("Introduceti persoana numarul "+Integer.toString(i + 1) + " :");
            tempString = scan.nextLine();

            //inititalisation of each person object
            String[] personDetails = tempString.split("\\W+");
            personArray[i] = new Person(personDetails[0], personDetails[1], Integer.parseInt(personDetails[2]));
        }
        // correct use of the person sorter. Thank you!!!!
        PersonSorter ps = new PersonSorter();
        Person[] sortedArray = ps.sortPersons(personArray);

        //Results output
        System.out.println("Sirul de persoane ordonat dupa varsta:");
        for (Person item : sortedArray) {
            System.out.println(item.toString());
        }
    }
}

