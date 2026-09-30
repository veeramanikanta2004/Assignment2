package employee;
import java.util.Scanner;
import static java.lang.System.out;
public class Employee{
	String Name;
	int Employee_ID;
	int Salary;
	public Employee(String Name,int Employee_ID,int Salary){
		this.Name=Name;
		this.Employee_ID=Employee_ID;
		this.Salary=Salary;
	}
	public String work(){
		return "This Person Works as an Employee";
	}
	public String details(){
		return "Name of this Employee is: "+" "+Name+"and the id is: "+" "+Employee_ID;
	}
}
		
		