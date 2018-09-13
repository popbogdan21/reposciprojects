import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Handles Employee sorting methods and returns parking spaces situation
 */
public class ManagementSystem {

    /**
     * The method wasn't really necessary since I could used directly Collections.sort...
     *
     * @param listOfEmployees The list of employees which needs to be sorted/ Employee type object list
     * @param comparator      Object of SeniorityComparator which is used to define compare criteria
     * @return the sorted list
     */
    public List<Employee> sortEmployees(List<Employee> listOfEmployees, SeniorityComparator comparator) {
        Collections.sort(listOfEmployees, comparator);
        return listOfEmployees;
    }

    /**
     * @param listOfEmployees Employee type object list containing all the Employees(ideally, but receive any list)
     * @return Employee type object list containing which don't have parking spaces
     */
    public List<Employee> listEmployeesWithoutParkingSpace(List<Employee> listOfEmployees) {
        List<Employee> employeesWithoutParkingSpaces = new ArrayList<Employee>();
        for (Employee e : listOfEmployees) {
            if (e.getParkingPrivileges() == false) {
                employeesWithoutParkingSpaces.add(e);
            }
        }
        SeniorityComparator comparator = new SeniorityComparator();
        return sortEmployees(employeesWithoutParkingSpaces, comparator);
    }

    /**
     * @param listOfEmployees Employee type object list containing all the Employees(ideally, but receive any list)
     * @return Employee type object list containing which don't have parking spaces
     */
    public List<Employee> listEmployeesWithParkingSpace(List<Employee> listOfEmployees) {
        List<Employee> employeesWithParkigSpaces = new ArrayList<Employee>();
        for (Employee e : listOfEmployees) {
            if (e.getParkingPrivileges() == true) {
                employeesWithParkigSpaces.add(e);
            }
        }
        SeniorityComparator comparator = new SeniorityComparator();
        return sortEmployees(employeesWithParkigSpaces, comparator);
    }
}
