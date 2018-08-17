/*
  @Class Variable has 4 methods, handles the user input and checks
   @Variables ()- recommended by SonarLint not sure what
   it does- think it makes the class limited to the package  --
   WOULD APPRECIATE SOME EXPLANATIONS IF YOU HAVE   TIME  :)))
    @inputFromConsole -- initiates read operations;
    @inputVariables   -- handles user read dialogs and calls isDouble () method to check if the read values  were
   numeric, returns double value of the string thar is read from the keyboard String argument
    @isDouble - returns boolean value true if the String arg used corresponds to number or false if this condition
   is not met
  */
package calculator;

import java.util.Scanner;

public class Variables {

    public double inputFromConsole(){
        double firstNumber;
        double lastNumber;
        String operation;
        firstNumber = inputVariables("first");
        lastNumber = inputVariables("second");
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Please input the operation you want to perform (please use + , -, *, / ): ");
        operation = scan1.nextLine();
        Calculator calc = new Calculator();
        return calc.calculator (firstNumber,lastNumber,operation);
    }
    private double inputVariables(String a) {
        String tempNumber;
        System.out.println("Please insert the " + a + " number:");
        Scanner scan = new Scanner(System.in);
        tempNumber = scan.nextLine();
        if (iSDouble(tempNumber)) {
            return Double.parseDouble(tempNumber);
        } else {
            System.out.println("Your input is a non-numeric variable.\nProgram will exit now");
            System.exit(0);
        }
        return 0;
    }
    private  boolean iSDouble (String tempNumber) {
        try {
            Double.parseDouble(tempNumber);
            return true;
        }
        catch (NumberFormatException nfe){
            return false;
        }
    }
}