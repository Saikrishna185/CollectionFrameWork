package setType.hashSet;

import java.util.HashSet;

public class DemoHash {
    static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(100);
        set.add(25);
        set.add(50);
        set.add(75);
        set.add(125);
        set.add(150);
        set.add(175);
        
        System.out.println(set);
    }
}
