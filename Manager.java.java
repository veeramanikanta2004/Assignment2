package employee.manager;
import employee.Employee;
public class Manager extends Employee{
	int TeamSize;
	String Department;
	public Manager(String Name,int Employee_ID,int Salary,int Teamsize,String Department){
		super(Name,Employee_ID,Salary);
		this.TeamSize=TeamSize;
		this.Department=Department;
	}
	public String work(){
		return "Works as an Manager";
	}
	public String manageteam(){
		return "Manages team of size: "+" "+TeamSize;
	}
}
	
	