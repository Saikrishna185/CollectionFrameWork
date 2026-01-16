package strings;

import java.util.Scanner;

public class ReverseString {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] arr = str.toCharArray();
        StringBuffer sb = new StringBuffer();
        for (int i = arr.length - 1 ; i >= 0; i--) {
            sb.append(arr[i]);
        }
        System.out.println(sb);
    }
}
