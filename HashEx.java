import java.util.HashMap;
import java.util.Map;
public class HashEx{
    public static void main(String args[]){
        HashMap <String ,Integer> empIds = new HashMap<>();
        empIds.put("aman",2029209);
        empIds.put("lovely",28373673);
        empIds.put("raja",6354438);
        System.out.println(empIds);
        System.out.println(empIds.get("aman"));
        System.out.println(empIds.containsKey("lovely"));
        System.out.println(empIds.containsValue(6354438));
        empIds.putIfAbsent("aprajit",2029172);
        System.out.println(empIds);
        empIds.remove("aprajit");
        System.out.println(empIds);
    }
}