package strings;

public class MutableStrings {
    static void main(String[] args) {
        String s1 = new String("Kodnest");
        String s2 = "Kodnest";
        
        char[] arr1 = {'K', 'o', 'd', 'n', 'e', 's', 't'};
        String s3 = new String(arr1);
        
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        
        String s4 = "Technologies";
        
        s1=s1.concat("Technologies");
        s2=s2+"Technologies";
        s3=s3+s4;
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        
        s1.toUpperCase();
        System.out.println(s1);
        
        String s5 = new String("");
        
        System.out.println(s5.isEmpty());
        System.out.println(s5.isBlank());
        
        s5.toLo
    }
}
