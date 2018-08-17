/*
    @Class Calculator contains the methods for arithmetic calculations
     @calculator() uses the required switch statement used to identify
    the operation and calls the arithmetic methods
     @Arithmetic methods add -- ads two numbers, subtract -- deducts two numbers,
    multiply -- multiplies two numbers, divide -- divides two number
     @all arithmetic methods return double type values and use two double type
  */
package calculator;


public  class Calculator {
        public double calculator(double n1, double n2, String op) {

            switch (op) {
                case "+": {
                    return add(n1, n2);
                }
                case "-": {
                    return subtract(n1, n2);
                }
                case "*": {
                    return multiply(n1, n2);
                }
                case "/": {
                    return divide(n1, n2);
                }
                default: {
                    System.out.println("Unknown operation requested by user\nProgram will exit now:");
                    System.exit(0);
                }
            }
            return 0;
        }

        private double add(double n1, double n2) {
            return (n1 + n2);
        }

        private double subtract(double n1, double n2) {
            return (n1 - n2);
        }

        private double multiply(double n1, double n2) {
            return (n1 * n2);
        }

        private double divide(double n1, double n2) {


            if (n2 == 0) {
                System.out.println("Divison by zero is not permited\nProgram will exit now");

                System.exit(0);

            }
            else{
                return n1/n2;
            }
            return 0;
        }
}
