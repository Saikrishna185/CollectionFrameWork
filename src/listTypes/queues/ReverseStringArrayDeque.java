package listTypes.queues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class ReverseStringArrayDeque {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // TODO: Read the input string
        String str = sc.nextLine();
        // TODO: Use ArrayDeque to store characters of the string
        char[] chArr = str.toCharArray();
        // TODO: Reverse the string using ArrayDeque
        ArrayDeque<Character> queue = new ArrayDeque<>();
        for(int i = chArr.length - 1; i >= 0; i--){
            queue.add(chArr[i]);
        }
        StringBuffer sb = new StringBuffer();
        for (char ch : queue) {
            sb.append(ch);
        }
        // TODO: Print the reversed string
        System.out.println(sb);
        sc.close();
    }
}
