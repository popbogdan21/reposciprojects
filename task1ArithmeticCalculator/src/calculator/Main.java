/*
       Package contains 3 classes
       Main class - contains the main() method-  initialises dialog and uses variables input class- Variables
       Variables - contains methods that allow user input and checks the validity of the user input
       Calculator - contains methods that allow mathematical operations
       Written by Bogdan Pop

 */
package calculator;

public class Main{
public static void main(String[]args){
        System.out.println("This program allows you to "+
        "perform basic operations between "+
        "two given numbers");
        /*Statement prints out the result. Alternatively i used
         an instance of Variables and  called the inputFromConsole() method like
         Variables  var =  new Variable()_________ the used var.inputFromConsole();
         SonarLint recommended to access the functions directly from the class (static method)
         Didn't get that but done it anyway( Most likely knows Java better than me:))) )
         */
         System.out.println("The result of the requested operation is: "+Variables.inputFromConsole());
        }
}