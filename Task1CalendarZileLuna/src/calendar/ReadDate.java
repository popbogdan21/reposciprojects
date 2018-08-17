/*
@ NumberOfDays - has one method that has @param month, year as Strings and
                   returns the number of days in a month as an integer
                 - has 4 methods: 3 data validation methods validMonth(), validYear() and isNumber() and one method
                   readData() that handles input and calls the validation methods
*/

package calendar;
import java.util.Scanner;

public class ReadDate {


        public static String month="";
        public static String year="";
        public void readData() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Va rugam introduceti luna:");
            month = sc.nextLine();
            //while used to get a valid  month input
            while (!validMonth(month)) {
                System.out.println("Nu ati introdus o luna valida\nVa rugam introduceti luna:");
                month = sc.nextLine();
            }
            System.out.println("Va rugam introduceti anul:");
            year = sc.nextLine();
            // while used to get a valid year input
            while (!validYear(year)){
                System.out.println("Nu ati introdus un an valid\nVa rugam introduceti anul");
                year = sc.nextLine();
            }
        }
        //
        private  boolean validMonth(String month) {
            if (isNumber(month)) {
                return (Integer.parseInt(month) >= 1) && (Integer.parseInt(month) <= 12) && (!month.substring(0, 1).equals("0"));
            }else{
                return false;
            }
        }
        // checks if the year input is valid
        private  boolean validYear (String year){
            // checks if the year input is valid
            if (isNumber(year)) {
                return (Integer.parseInt(year) > 0) && (!year.substring(0, 1).equals("0"));
            }else{
                return false;
            }
        }
        //checks if the string a corresponds to a number but for example if i input 0003 it will validate it
        //hence I used a check condition in the validYear() method
        private  boolean isNumber (String a){
            try {
                Integer.parseInt(a);
            } catch (NumberFormatException nfe) {
                return false;
            }
            return true;
        }
    }
