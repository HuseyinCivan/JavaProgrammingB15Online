package day48;

//HourlyEmployee

//instance fields :
//	hourlyWage , numsOfHours ,

//Constructor : to set all the fields
//instance methods ;
//	calculateAnualSalary
//	toString
public class HourlyEmployee extends Employee {
    double hourlyWage;
    int numsOfHours;
public HourlyEmployee(String name, int id,double hourlyWage,int numsOfHours){
    super(name, id);
    this.hourlyWage=hourlyWage;
    this.numsOfHours=numsOfHours;
}
public void calculateAnnualSalary(){
    System.out.println(name+" AnnualSalary is "+hourlyWage*numsOfHours);
}

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "hourlyWage=" + hourlyWage +
                ", numsOfHours=" + numsOfHours +
                ", name='" + name + '\'' +
                ", id=" + id +" ,yearly salary is "+hourlyWage*numsOfHours+
                '}';
    }
}
