class Employee
{
private int savings;
private String name;
public int getSavings(){
	return(savings);
}
public String getName(){
	return(name);
}
public void setSavings(int sav)
{
	this.savings=sav;
}
public void setName(String man){
	this.name=man;
}}
class Encap{
public static void main(String[] args){
	Employee obj = new Employee();
	obj.setSavings(3012566);
	obj.setName("\tmanoj");
	System.out.println("Savings amount \t\t" + obj.getSavings());
	System.out.println("Name \t\t" + obj.getName());
}}