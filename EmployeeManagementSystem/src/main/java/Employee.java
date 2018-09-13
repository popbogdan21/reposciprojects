import java.util.Objects;

/**
 * CLass used to define general objects of Employee type which will be extended
 *      private String name- Employee name
 *     private int seniority- Employee seniority
 *     private int employeeID- Employee unique id- the generation is the users responsibility
 *     private boolean parkingPrivileges- holds parking space allocation the Employee
 */
public class Employee {
    private String name;
    private int seniority;
    private int employeeID;
    private boolean parkingPrivileges;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSeniority() {
        return seniority;
    }

    public void setSeniority(int seniority) {
        this.seniority = seniority;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public boolean getParkingPrivileges() {
        return parkingPrivileges;
    }

    public void setParkingPrivileges(boolean parkingPrivileges) {
        this.parkingPrivileges = parkingPrivileges;
    }

    /**
     * @return new format is Employee Name Employee seniority
     */
    @Override
    public String toString() {
        return name + " seniority " + seniority;
    }

    /**
     * @param o instance of <Employee></>
     *          the equality is assessed by using the EmployeeID
     *          Should be unique
     *          Responsibility is to the user for generating unique id numbers
     * @return boolean
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return getEmployeeID() == employee.getEmployeeID();
    }

    @Override
    public int hashCode() {

        return Objects.hash(getEmployeeID());
    }
}
