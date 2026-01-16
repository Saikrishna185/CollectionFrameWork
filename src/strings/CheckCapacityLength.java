package strings;

public class CheckCapacityLength {
    static void main() {
        StringBuffer str1 = new StringBuffer("Kodnest");
        System.out.println(str1.capacity());
        System.out.println(str1.length());
        str1.append("Tech");
        System.out.println(str1.capacity());
        System.out.println(str1.length());
        str1.append("nologies PVT ltd");
        System.out.println(str1.capacity());
        System.out.println(str1.length());
        str1.trimToSize();
        System.out.println(str1.capacity());
        System.out.println(str1.length());
    }
}
