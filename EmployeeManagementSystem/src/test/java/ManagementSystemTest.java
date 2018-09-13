import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ManagementSystemTest handles unit test for the ManagementSystem behaviours
 */
class ManagementSystemTest {
    List<Employee> testEmployeeList = new ArrayList<Employee>();

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        testEmployeeList.addAll(Arrays.<Employee>asList(new JuniorDeveloper(),
                new JuniorDeveloper(), new ManagementStaff(), new Tester(), new Tester()));
        setUpDetails(testEmployeeList,0,"junior1",1,2,true);
        setUpDetails(testEmployeeList,1,"junior2",3,1,false);
        setUpDetails(testEmployeeList,2,"manager",2,1,true);
        setUpDetails(testEmployeeList,3,"tester1",5,1,false);
        setUpDetails(testEmployeeList,4,"tester2",4,1,true);
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {

    }

    @Test
    void sortEmployees() {
        ManagementSystem managementSystem= new ManagementSystem();
        List<Employee> expectedList= new ArrayList<Employee>();
        expectedList.addAll(Arrays.<Employee>asList(new JuniorDeveloper(),new ManagementStaff(),
                new JuniorDeveloper(), new Tester(), new Tester()));
        setUpDetails(expectedList,0,"junior1",1,2,true);
        setUpDetails(expectedList,1,"manager",2,1,true);
        setUpDetails(expectedList,2,"junior2",3,1,false);
        setUpDetails(expectedList,4,"tester1",5,1,false);
        setUpDetails(expectedList,3,"tester2",4,1,true);
        Assertions.assertEquals(expectedList, managementSystem.sortEmployees(testEmployeeList,new SeniorityComparator()));

    }

    @org.junit.jupiter.api.Test
    void listEmployeesWithoutParkingSpace() {
        ManagementSystem managementSystem= new ManagementSystem();
        List<Employee> expectedList= new ArrayList<Employee>();
        expectedList.addAll(Arrays.<Employee>asList(new JuniorDeveloper(), new Tester()));
        setUpDetails(expectedList,0,"junior2",3,1,false);
        setUpDetails(expectedList,1,"tester1",5,1,false);
        Assertions.assertEquals(expectedList, managementSystem.listEmployeesWithoutParkingSpace(testEmployeeList));

    }

    @org.junit.jupiter.api.Test
    void listEmployeesWithParkingSpace() {
        ManagementSystem managementSystem= new ManagementSystem();
        List<Employee> expectedList= new ArrayList<Employee>();
        expectedList.addAll(Arrays.<Employee>asList(new JuniorDeveloper(),new ManagementStaff(), new Tester()));
        setUpDetails(expectedList,0,"junior1",1,2,true);
        setUpDetails(expectedList,1,"manager",2,1,true);
        setUpDetails(expectedList,2,"tester2",4,1,true);
        Assertions.assertEquals(expectedList, managementSystem.listEmployeesWithParkingSpace(testEmployeeList));
    }
    private void setUpDetails(List<Employee> testEmployeeList,int i, String name,
                              int seniority, int employeeID, boolean parkingPrivileges){
        testEmployeeList.get(i).setName(name);
        testEmployeeList.get(i).setEmployeeID(employeeID);
        testEmployeeList.get(i).setSeniority(seniority);
        testEmployeeList.get(i).setParkingPrivileges(parkingPrivileges);
    }

}