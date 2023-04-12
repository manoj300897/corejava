import java.util.*;
import java.lang.*;
class Manojlist{
	public static void main(String[] args)
{		
	LinkedList<String> bikes = new LinkedList<>();
	bikes.add("yamaha");
	bikes.add("ducati");
	bikes.add("bmw");
	bikes.add("re");	
	bikes.add(1,"pulsar");		
		System.out.println("linked list elements");
for(String str:bikes)
		System.out.println(str);

}
}
