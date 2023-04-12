import java.util.*;	
public class Treeehet{
	public static void main(String[] args)
	{
		Treeset<String> set = new Treeset<>();
		set.add("man");
		set.add("women");
		set.add("boy");
		set.add("girl");
		set.remove("girl");
		Iterator<String> it = set.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
}
}

		