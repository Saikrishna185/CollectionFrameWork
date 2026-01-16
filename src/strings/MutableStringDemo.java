package strings;

public class MutableStringDemo {
    static void main(String[] args) {
        StringBuffer str1 = new StringBuffer("Kodnest");
        str1.append("Tech");
        System.out.println(str1);
        System.out.println(str1.capacity());
        System.out.println(str1.indexOf("Tech"));
        System.out.println(str1.charAt(7));
        System.out.println(str1.length());
        System.out.println(str1.insert(7, "Industry"));
        System.out.println(str1.reverse());
        System.out.println(str1.reverse());
        System.out.println(str1.delete(16,19));
        System.out.println(str1.deleteCharAt(15));
        str1.setCharAt(0,'C');
        System.out.println(str1);
        str1.trimToSize();
        System.out.println(str1);

    }
}
