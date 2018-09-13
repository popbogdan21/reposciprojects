import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * EmployeeDetailsFiller is used to create a instance of a particular Employee subclass
 *
 */
public class EmployeeDetailsFiller {
    /**
     * @param employee Represents the objects<Employee></> which needs details filling
     * @return the object with filled details
     */
    public Employee addEmployeeDetails(Employee employee) {
        boolean properInput = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name: ");
        employee.setName(scanner.nextLine());
        do {
            System.out.println("Enter employee seniority(years)");
            try {
                employee.setSeniority(scanner.nextInt());
                properInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Not a valid input for seniority:");
                scanner.nextLine();
            }
        } while (!properInput);
        properInput = false;
        do {
            System.out.println("Enter the employee ID number: ");
            try {
                employee.setEmployeeID(scanner.nextInt());
                properInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Not a valid input for id:");
                scanner.nextLine();
            }
        } while (!properInput);
        properInput = false;

        do {
            System.out.println("Does the employee have parking privileges? true/false");
            try {
                employee.setParkingPrivileges(scanner.nextBoolean());
                properInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Not a valid input for id:");
                scanner.nextLine();
            }
        } while (!properInput);
        return employee;
    }
}
