
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int noOfPersons = 0;
        String tempString = "";
        Scanner scan = new Scanner(System.in);

        System.out.println("Cate persoane doriti sa introduceti?");
        noOfPersons = Integer.parseInt(scan.nextLine());

        Persons[] personsArray = new Persons[noOfPersons];

        System.out.println("Introduceti fiecare persoana dupa " +
                "modelul 'Nume Prenume Varsta' apoi apasati enter");

        for (int i = 0; i < noOfPersons; i++) {
            System.out.println("Introduceti persoana numarul "+Integer.toString(i + 1) + " :");
            tempString = scan.nextLine();
            personsArray[i] = new Persons(tempString);
        }

        new PersonSorter(personsArray);
        System.out.println("Sirul de persoane ordonat dupa varsta:");
        for (Persons item : personsArray) {
            System.out.println(item.toString());

        }
    }
}

