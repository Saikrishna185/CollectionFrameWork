package setType.hashSet;

import java.util.HashSet;
import java.util.Scanner;

public class DifferenceTwoHashSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // TODO: Read the number of elements in the first set (n1)
        int n1 = sc.nextInt();
        // TODO: Create a HashSet to store elements of the first set (A)
        HashSet<Integer> setA = new HashSet<>();
        // TODO: Add elements of the first set (A) to the HashSet
        for(int i = 0; i < n1; i++) {
            setA.add(sc.nextInt());
        }
        // TODO: Read the number of elements in the second set (n2)
        int n2 = sc.nextInt();
        // TODO: Read elements of the second set (B) and remove them from the HashSet (setA)
        HashSet<Integer> setB = new HashSet<>();
        for(int i = 0; i < n2; i++) {
            setB.add(sc.nextInt());
        }
        for(int i : setB) {
            setA.remove(i);
        }
        // TODO: Print the remaining elements in setA (difference A - B) or "No difference"
        if(!setA.isEmpty()) {
            for(int i : setA) {
                System.out.print(i + " ");
            }
        } else {
            System.out.println("No difference");
        }
        sc.close();
    }
}
