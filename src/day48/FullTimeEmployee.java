package day48;
//a non -abstract sub class of abstract class
//is called concrete class
//this class is responsible providing body ( implementation)
//for all abstract methods from super class


////FullTimeEmployee
////	instance fields :
////		 monthlySalary
////Constructor : to set all the fields
////instance methods ;
////	calculateAnualSalary
////	toString
public class FullTimeEmployee extends Employee {

    double monthlySalary;

  public FullTimeEmployee(String name,int id,double monthlySalary){
      super(name,id);
      this.monthlySalary=monthlySalary;

  }
  @Override
  public void calculateAnnualSalary(){
      System.out.println(name+" Annual Salary is "+monthlySalary*12);
  }
    @Override
    public String toString() {
        return "FullTimeEmployee{" +
                "monthlySalary=" + monthlySalary +
                ", name='" + name + '\'' +
                ", id=" + id +" ,yearly salary is "+monthlySalary*12+
                '}';
    }
}
