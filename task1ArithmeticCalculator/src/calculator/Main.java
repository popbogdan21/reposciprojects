package calculator;
/*
       Package contains 3 classes
       Main class - contains the main() method-  initialises dialog and uses variables input class- Variables
       Variables - contains methods that allow user input and checks the validity of the user input
       Calculator - contains methods that allow mathematical operations
       Written by Bogdan Pop
  */
public class Main {

        public static void main(String[]args){
            System.out.println("This program allows you to "+
                    "perform basic operations between "+
                    "two given numbers");
            Variables var=new Variables();

            System.out.println("The result of the requested operation is: "+var.inputFromConsole());
        }
}

