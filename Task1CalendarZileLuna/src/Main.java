/*
    @ program has 3 classes
    @ CalendarZileLuna - the main class
                      - contains main() method
                      - initiates user input and input validation
                      - initiates operations for determination of the number of days in a month
                      - prints the result
    @ ReadDate - handles user input
               - validates the input
    @ NumarDeZile - has one method that has @param month, year as Strings and
                    returns the number of days in a month as an integer
                  - has 4 methods: 3 data validation mathods validMonth(), validYear() and isNumber() and one method
                    readData() that handles input and calls the validation methods
    Written By Bogdan Pop
    P.S Sry ca am scris codul jumatate in romana and half in with english names
        Will be mor consistent in the future
*/

import java.lang.*;
public class Main {

    public static void main(String[] args) {
        System.out.println("Programul calculeaza numarul de zile dintr-o luna si un an specificat\n" +
                "Programul accepta luna si anul sub forma de variable numerice");
        ReadDate reader = new ReadDate();
        //get the values of month and year from console
        reader.readData();
        //calls findNumberOfDays to find the number of days in a given month and year and prints the statement
        System.out.println("Ati solicitat numarul de zile din Luna: " + ReadDate.month + " si Anul " + ReadDate.year + "" +
                " acesta este: " + NumarDeZile.findNumberOfDays(reader.month, reader.year));

    }
}
