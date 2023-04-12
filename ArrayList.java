import java.util.ArrayList;
import java.util.List;
public class ArrayList{
	public static void main(String[] args)
{
		ArrayList<String> arrList = new ArrayList<>();
		arrList.add("cricket");
		arrList.add("baseball");
		arrList.add("tennis");
		arrList.add("volleyball");
		arrList.add(3,"rugby");
		System.out.println("Array list elements");
for(String str:arrList)
		System.out.println(str);

}
}
