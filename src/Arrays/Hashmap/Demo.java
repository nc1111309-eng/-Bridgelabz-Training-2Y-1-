package Arrays.Hashmap;

import java.util.*;

public class Demo {
    static void main() {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(46,"Nitin Chauhan");
        map.put(78,"Vishal");
        map.put(8,"Bakra ");
        System.out.println(map);
        System.out.println(map.get(8));
        map.put(8,"Akash");
        System.out.println(map);
        System.out.println(map.containsKey(8));
        map.remove(8);
        System.out.println(map);
    }
}
