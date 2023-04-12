import java.util.*;


class Manager{
	void Assigning(){
		int emps;
		String Projname;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the no of employees");
		emps=sc.nextInt();
		System.out.println("enther the projname");
		Projname=sc.next();
		if(emps<=100){
		System.out.println("you cant add anymore employee");     //grandfather
		System.out.println("Projname");
		}
	    }
	void salary(){
		int sal=30000;
		System.out.println(sal);
			}}			
	
	class TL extends Manager{
	void work(){
		String workname;
		Scanner sc=new Scanner(System.in);		//father
		workname=sc.next();
		System.out.println(workname);
	}
	}



	class Employee extends TL{			//son
	void emp(){
		String name="man";
		System.out.println(name);
		}}

	public class maininherit{
	public static void main(String[] args){
		Employee obj= new Employee();
		obj.Assigning();
		obj.work();
		obj.salary();
		obj.emp();
	}
	}

	


