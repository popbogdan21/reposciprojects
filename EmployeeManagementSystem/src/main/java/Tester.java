import java.util.List;

/**
 * Tester adds specific behaviors to Tester employees
 * Extends Employe
 */
public class Tester extends Employee {

    /**
     * @param employeesList Receives a list of Employees
     *                      The list is intended to be a List<Tester>
     *                      Class calls the methods in the EmployeeDetailsFiller which handle the user input and object creation
     * @return the List of Employees with an added Tester instance created using methods in the EmployeeDetailsFiller
     */

    public List<Employee> addNewEmployee(List<Employee> employeesList) {
        Tester tester = new Tester();
        EmployeeDetailsFiller filler = new EmployeeDetailsFiller();
        try {
            tester = (Tester) filler.addEmployeeDetails(tester);
            employeesList.add(tester);
        } catch (Exception e) {
            System.out.println("Method should add a Tester not another object type");
        }
        return employeesList;
    }
}
