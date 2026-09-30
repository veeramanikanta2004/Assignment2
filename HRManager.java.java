package employee.manager;
public class HRManager extends Manager{
	public HRManager(String Name,int Employee_ID,int Salary,int Teamsize,String Department){
		super(Name,Employee_ID,Salary,Teamsize,Department);
	}
	public String work(){
		return "this guy works as an Hr";
	}
}