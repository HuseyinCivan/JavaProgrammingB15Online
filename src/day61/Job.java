
package day61;

public class Job implements Comparable<Job>{

    //location
    //salary
    //companyName


    private String locaton;
    private  int salary;
    private String companyName;

    public Job(String locaton, int salary, String companyName) {
        this.locaton = locaton;
        this.salary = salary;
        this.companyName = companyName;
    }

    public String getLocaton() {
        return locaton;
    }

    public void setLocaton(String locaton) {
        this.locaton = locaton;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public String toString() {
        return "Job{" +
                "locaton='" + locaton + '\'' +
                ", salary=" + salary +
                ", companyName='" + companyName + '\'' +
                '}';
    }

    @Override
    public int compareTo(Job other) {
            if(other.salary>this.salary){
                return -1;
            }
            if(other.salary<this.salary){
                return 1;
            }
            return 0;
        }
}
//Please create Job class
//	location
//	salary
//	companyName
//	encapsulate all the fields
//	add constructor to set all the filedd value
//	add toStirng method
//Let this class implements Comparable interface
//	and add comparing logic of by salary
//Create a class called JobHunter with main method
//Create a LinkedList of Jobs
//and store your favorite 5 Jobs
//assign it to jobList varibale with List<Job> reference
//sort them and print out before and after