import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class sd {
	public static void main(String[] args) {
		
	
	   HashMap<String, Integer> map = new HashMap<>();
       map.put("A", 3);
       map.put("B", 4); // map에 Key, Value 삽입
       
       System.out.println(map.entrySet());
       System.out.println();
       System.out.println();
       
       for(Map.Entry<String, Integer> ent : map.entrySet()) {
           System.out.println("entry.getKey() : " + ent.getKey());
           System.out.println("entry.getValue() : " + ent.getValue());
       }
       System.out.println();

       System.out.println( map.entrySet().stream()
    		   
                                         .map(Map.Entry<String, Integer>::getKey)
                                         
                                         .collect(Collectors.toList()));
}
}
