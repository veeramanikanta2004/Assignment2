package employee.developer;
import employee.Employee;
import static java.lang.System.out;
public class Developer extends Employee{
	public String ProgrammingLnguage;
	public Developer(String Name,int Employee_ID,int Salary,String ProgrammingLnguage){
		super(Name,Employee_ID,Salary);
		this.ProgrammingLnguage=ProgrammingLnguage;
	}
	public String work(){
		return "This guy works as an Developer";
	}
}
		
	