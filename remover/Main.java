import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void removeOggy(ArrayList<String> names) {
        
        for (int index = 0; index < names.size(); index++) { 
            // accessing each element of array 
            String name = names.get(index);
            if(name.contains("oggy"))
                names.set(index, "");
        }
        names.removeAll(Arrays.asList("", null));
        return;
    }
    public static boolean oggyIsRemoved(Arrimport java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void removeOggy(ArrayList<String> names) {        
        names.removeIf(it -> it.contains("oggy"));
        return;
    }
    public static boolean oggyIsRemoved(ArrayList<String> names) {
        List<String> oggys = names.stream().filter(it -> it.contains("oggy")).collect(Collectors.toList());
        return oggys.size() == 0;
    }
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>(Arrays.asList("nobita", "bheem", "oggy", "oggy cockroach", "ninja"));
        removeOggy(names);
        if(oggyIsRemoved(names)) {
            System.out.println("Passed!");
            System.exit(0);
        } else {
            System.out.println("Failed!!");
            System.exit(1);
        }
    }
}ayList<String> names) {
        List<String> oggys = names.stream().filter(it -> it.contains("oggy")).collect(Collectors.toList());
        return oggys.size() == 0;
    }
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>(Arrays.asList("nobita", "bheem", "oggy", "oggy cockroach", "ninja"));
        removeOggy(names);
        if(oggyIsRemoved(names)) {
            System.out.println("Passed!");
            System.exit(0);
        } else {
            System.out.println("Failed!!");
            System.exit(1);
        }
    }
}