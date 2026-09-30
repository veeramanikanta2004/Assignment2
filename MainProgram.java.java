package Program;
import employee.developer.javadeveloper;
import employee.developer.pythondeveloper;

public class MainProgram{
	public static void main(String[] args){
		javadeveloper jd = new javadeveloper("Nirmal",977,50000,"java");
		pythondeveloper pd = new pythondeveloper("Hansi",999,50000,"python");
		
		System.out.println(jd.work());
		System.out.println(pd.work());
		System.out.println("programming language "+jd.ProgrammingLnguage);
		System.out.println("programming language "+pd.ProgrammingLnguage);
	}
}
		
		