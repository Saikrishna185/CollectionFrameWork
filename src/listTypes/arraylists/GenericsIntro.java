package listTypes.arraylists;

import java.util.ArrayList;

public class GenericsIntro {
    static void main() {
        ArrayList<String> al = new ArrayList<>();
        al.add("Hello");
        al.add("World");
//        al.add(12);
//        al.add(234.43);
//        al.add(true);
        
        IO.println(al);
    }
}
