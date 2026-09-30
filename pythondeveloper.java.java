package employee.developer;
public class pythondeveloper extends Developer{
	public pythondeveloper(String Name,int Employee_ID,int Salary,String ProgrammingLnguage){
		super(Name,Employee_ID,Salary,ProgrammingLnguage);
	}
	public String work(){
		return "He works as an Python developer";
	}
}
