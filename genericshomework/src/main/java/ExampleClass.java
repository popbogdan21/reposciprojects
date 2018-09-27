import java.util.Objects;

/**
 * This is an example of class that implements Comparable
 * Contains Constructor, getters, setter for each field
 * Class implement Comparable and the method CompareTo
 * equals(), eashCode(), toString() have been overridden
 */
public class ExampleClass implements Comparable<ExampleClass> {

    private String name;
    private int value;

    /**
     * Constructor receives
     *
     * @param name  the name of the object
     * @param value the value of the object
     */
    public ExampleClass(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int compareTo(ExampleClass o) {
        return this.getValue() - o.getValue();
    }

    @Override
    public String toString() {
        return "ExampleClass{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ExampleClass)) return false;
        ExampleClass that = (ExampleClass) o;
        return getValue() == that.getValue() &&
                Objects.equals(getName(), that.getName());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getName(), getValue());
    }
}
