import java.util.List;

/**
 * ManagementStaff adds specific behaviour for Management Staff employee
 * Extends Employee
 */
public class ManagementStaff extends Employee {

    /**
     * /**
     *
     * @param employeesList Receives a list of Employees
     *                      The list is intended to be a List<ManagementStaff>
     *                      Class calls the methods in the EmployeeDetailsFiller which handle the user input and object creation
     * @return the List of Employees with an added  ManagementStaff instance created using methods in the EmployeeDetailsFiller
     */
    public List<Employee> addNewEmployee(List<Employee> employeesList) {
        ManagementStaff managementStaff = new ManagementStaff();
        EmployeeDetailsFiller filler = new EmployeeDetailsFiller();
        try {
            managementStaff = (ManagementStaff) filler.addEmployeeDetails(managementStaff);
            employeesList.add(managementStaff);
        } catch (Exception e) {
            System.out.println("Method should add Management staff");
        }
        return employeesList;
    }
}
