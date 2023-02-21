import java.util.*;
public class SetEx{
    public static void main(String args[]){
        Set<String> names = new HashSet<>();
        names.add("vagyalakshmi");
        names.add("ranjana");
        names.add("rekha");
        names.add("shambhu");
        names.add("Rahja");
        names.add("lovely");
        names.add("aman");
        names.remove("aman");
        
     names.forEach(System.out::println);
     




        System.out.println(names.isEmpty( ));
    }
}
