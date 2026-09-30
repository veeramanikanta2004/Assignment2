package employee.developer;
public class javadeveloper extends Developer{
	public javadeveloper(String Name,int Employee_ID,int Salary,String ProgrammingLnguage){
		super(Name,Employee_ID,Salary,ProgrammingLnguage);
	}
	public String work(){
		return "This guy works as an Javadeveloper";
	}
}