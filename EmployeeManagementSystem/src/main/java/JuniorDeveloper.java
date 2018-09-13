import java.util.List;

/**
 * JuniorDeveloper extends Employee class
 * Adds additional behaviour to class
 */
public class JuniorDeveloper extends Employee {

    /**
     * @param employeesList Receives a list of Employees
     *                      The list is intended to be a List<JuniorDeveloper>
     *                      Class calls the methods in the EmployeeDetailsFiller which handle the user input and object creation
     * @return the List of Employees with an added JuniorDeveloper instance created using methods in the EmployeeDetailsFiller
     */
    public List<Employee> addNewEmployee(List<Employee> employeesList) {
        JuniorDeveloper juniorDeveloper = new JuniorDeveloper();
        EmployeeDetailsFiller filler = new EmployeeDetailsFiller();
        try {
            juniorDeveloper = (JuniorDeveloper) filler.addEmployeeDetails(juniorDeveloper);
            employeesList.add(juniorDeveloper);
        } catch (Exception e) {
            System.out.println("Method should add a Junior developer not another type of object");
        }
        return employeesList;
    }
}
