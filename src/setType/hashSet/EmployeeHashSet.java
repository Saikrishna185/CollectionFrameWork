package setType.hashSet;

import java.util.HashSet;
import java.util.Scanner;

public class EmployeeHashSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // TODO: Create a HashSet to store unique employee IDs
        HashSet<Integer> set = new HashSet<>();
        // TODO: Read the number of initial employee IDs (n)
        int n = sc.nextInt();
        // TODO: Add n employee IDs to the HashSet
        for (int i = 0; i < n; i++) {
            set.add(sc.nextInt());
        }
        // TODO: Perform operations until "STOP" is encountered
        sc.nextLine();
        boolean flag = true;
        while (flag){
            String[] arr = sc.nextLine().split(" ");
            String command = arr[0];
            switch (command){
                case "ADD" -> {
                    set.add(Integer.parseInt(arr[1]));
                    System.out.println(set);
                }
                case "REMOVE" -> {
                    set.remove(Integer.parseInt(arr[1]));
                    System.out.println(set);
                }
                case "CHECK" -> System.out.println(set.contains(Integer.parseInt(arr[1])));
                case "PRINT" -> {
                    if(!set.isEmpty()){
                        System.out.println(set);
                    }else {
                        System.out.println("EMPTY");
                    }
                }
                case "STOP" -> flag = false;
            }
        }
        // Operations include ADD, REMOVE, CHECK, PRINT, and STOP
        
        sc.close();
    }
}
