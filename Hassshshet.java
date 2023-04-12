import java.util.*;
public class Hassshshet{
	public static void main(String[] args)
	{
		HashSet<Integer> set = new HashSet<>();
		set.add(23);
		set.add(54);
		set.add(15);
		set.add(456);
		set.add(15);		//it cant contain duplicate value
		set.remove(54);
Iterator<Integer> it = set.iterator();
while(it.hasNext()){
	System.out.println(it.next());
}
}
}