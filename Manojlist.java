import java.util.LinkedList;
class Manojlist{
	public static void main(String[] args)
{		
	LinkedList<String> bikes = new LinkedList<>();
	bikes.add("yamaha");
	bikes.add("ducati");
	bikes.add("bmw");
	bikes.add("re");	
	bikes.add(1, "pulsar");		
		System.out.println("enter the linkedlist");
	Iterator<String>it = bikes.iterator();
	while(it.hasNext()){
		System.out.println(it.next());
}
}

