import java.util.Comparator;

/**
 * Class used to define a comparison method between Employee type objects
 */
public class SeniorityComparator implements Comparator<Employee> {
    public int compare(Employee o1, Employee o2) {
        Integer seniority = o1.getSeniority();
        return seniority.compareTo(o2.getSeniority());
    }
}
