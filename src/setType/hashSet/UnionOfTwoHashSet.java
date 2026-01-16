package setType.hashSet;

import java.util.HashSet;
import java.util.Scanner;

public class UnionOfTwoHashSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // TODO: Read the number of elements in the first array (n1)
        int n1 = sc.nextInt();
        // TODO: Create a HashSet to store unique elements from the first array
        HashSet<Integer> set1 = new HashSet<>();
        for(int i = 0; i < n1; i++) {
            set1.add(sc.nextInt());
        }
        // TODO: Read the number of elements in the second array (n2)
        int n2 = sc.nextInt();
        // TODO: Add elements from the second array to the HashSet
        HashSet<Integer> set2 = new HashSet<>();
        for(int i = 0; i < n2; i++) {
            set2.add(sc.nextInt());
        }
        // TODO: Print the union of the two arrays as space-separated integers
        HashSet<Integer> unionSet = new HashSet<>(set1);
        unionSet.addAll(set2);
        for(int i : unionSet) {
            System.out.print(i + " ");
        }
        
        
        sc.close();
    }
}
