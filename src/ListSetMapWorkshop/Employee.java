package ListSetMapWorkshop;



public class Employee {

    private String firstName ;
    private String lastName ;
    private String departmant;
    private int salary ;

    public Employee(String firstName, String lastName, String departmant, int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.departmant = departmant;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDepartmant() {
        return departmant;
    }

    public int getSalary() {
        return salary;
    }

    public void setDepartmant(String departmant) {
        this.departmant = departmant;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", departmant='" + departmant + '\'' +
                ", salary=" + salary +
                '}';
    }
}
