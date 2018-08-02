/*
    @Class Calculator contains the methods for arithmetic calculations

    @calculator() uses the required switch statement used to identify
    the operation and calls the arithmetic methods

    @Arithmetic methods add -- ads two numbers, subtract -- deducts two numbers,
    multiply -- multiplies two numbers, divide -- divides two number

    @all arithmetic methods return double type values and use two double type

 */
package calculator;

import java.lang.*;


public  class Calculator {

    public  double calculator(double n1, double n2, String op) {

        switch (op) {
            case "+": {
                return add(n1,n2);
            }
            case "-": {
                return subtract(n1,n2);
            }
            case "*": {
                return multiply(n1,n2);
            }
            case "/": {
                if (n2 != 0) {
                    return divide(n1,n2);
                } else {
                    System.out.println("Division by zero is not allowed\nProgram will exit now");
                    System.exit(0);
                }
                return 0;
            }
            default: {
                System.out.println("Unknown operation requested by user\nProgram will exit now:");
                System.exit(0);
            }
        }
        return 0;
    }
    private static double add(double n1, double n2){
        return (n1+n2);
    }
    private static double subtract(double n1, double n2){
        return (n1-n2);
    }
    private static  double multiply(double n1, double n2){
        return (n1*n2);
    }
    private static double divide(double n1, double n2){
        return (n1/n2);
    }

}


