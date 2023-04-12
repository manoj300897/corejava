import java.util.*;
class Mappingtree{
public static void main(String[] args){
	TreeMap<Integer, String> hmap = new TreeMap<>();
	hmap.put(166, "eagle");
	hmap.put(333, "lion");
	hmap.put(154, "scorpio");
	hmap.put(124, "tiger");
	Set set = hmap.entrySet();
	Iterator iterator = set.iterator();	
	while(iterator.hasNext()){
		Map.Entry m = (Map.Entry)iterator.next();
		System.out.println("key is :\t"+ m.getKey() + "\t &\t value is :\t"+ m.getValue());
		
}
}
}