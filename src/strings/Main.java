package strings;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String message = sc.nextLine();
        char[] arr = message.toCharArray();
        char[] carr = new char[arr.length];
        for(int i = 0; i < arr.length; i++) {
            char ch = arr[i];
            if(ch == ' ') {
                carr[i] = ch;
            }
        }
        
        
        int j = carr.length-1;
        for(int i = 0; i < arr.length; i++) {
            char ch = arr[i];
            if(ch != ' ') {
                if(carr[j] == ' ') {
                    j--;
                }
                carr[j] = arr[i];
                j--;
                
            }
        }
        
        String newMessage = new String(carr);
        System.out.println(newMessage);
    }
}
