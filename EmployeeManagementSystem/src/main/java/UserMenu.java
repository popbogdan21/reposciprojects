import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class UserMenu {
    public void stratMenu() {
        List<Employee> listOfEmployees = new ArrayList<Employee>();
        List<Employee> juniorSoftwareEngineerList = new ArrayList<Employee>();
        List<Employee> unitTestersList = new ArrayList<Employee>();
        List<Employee> managementStaffList = new ArrayList<Employee>();
        System.out.println("What would you like to do?");
        Scanner scanner = new Scanner(System.in);
        int response = -1;
        do {
            System.out.println("1- Add Employee, 2-Print parking privileges situation,3-Quit");
            try {

                response = scanner.nextInt();
                switch (response) {
                    case 1: {
                        System.out.println("Enter the employee type: 1- Junior Developer, 2- Tester, 3- Management");
                        try {
                            int response2 = scanner.nextInt();
                            switch (response2) {
                                case 1: {
                                    JuniorDeveloper juniorDeveloper = new JuniorDeveloper();
                                    juniorDeveloper.addNewEmployee(juniorSoftwareEngineerList);
                                    break;
                                }
                                case 2: {
                                    Tester tester = new Tester();
                                    tester.addNewEmployee(unitTestersList);
                                    break;
                                }
                                case 3: {
                                    ManagementStaff managementStaff = new ManagementStaff();
                                    managementStaff.addNewEmployee(managementStaffList);
                                    break;
                                }
                                default: {
                                    System.out.println("Not a valid selection");
                                }
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("Not a valid selection");
                            scanner.nextLine();
                            break;
                        }
                        break;
                    }
                    case 2: {
                        System.out.println("Employees without parking privileges:");
                        ManagementSystem managementSystem = new ManagementSystem();
                        listOfEmployees.addAll(managementSystem.listEmployeesWithoutParkingSpace(juniorSoftwareEngineerList));
                        listOfEmployees.addAll(managementSystem.listEmployeesWithoutParkingSpace(unitTestersList));
                        listOfEmployees.addAll(managementSystem.listEmployeesWithoutParkingSpace(managementStaffList));
                        managementSystem.sortEmployees(listOfEmployees, new SeniorityComparator());
                        System.out.println(listOfEmployees);
                        listOfEmployees.clear();
                        System.out.println("Employees with parking privileges:");
                        listOfEmployees.addAll(managementSystem.listEmployeesWithParkingSpace(juniorSoftwareEngineerList));
                        listOfEmployees.addAll(managementSystem.listEmployeesWithParkingSpace(unitTestersList));
                        listOfEmployees.addAll(managementSystem.listEmployeesWithParkingSpace(managementStaffList));
                        managementSystem.sortEmployees(listOfEmployees, new SeniorityComparator());
                        System.out.println(listOfEmployees);
                        listOfEmployees.clear();
                        break;
                    }
                    case 3: {
                        break;
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("Not a valid argument");
                scanner.nextLine();
            }
        } while (response != 3);
    }
}

