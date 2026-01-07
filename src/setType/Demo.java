package setType;

import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class Demo {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // TODO: Read the number of product prices (n)
        int n = sc.nextInt();
        // TODO: Create a TreeSet to store product prices
        TreeSet<Integer> pts = new TreeSet<>();
        // TODO: Read and add n product prices to the TreeSet
        for(int i = 0; i < n; i++) {
            pts.add(sc.nextInt());
        }
        // TODO: Read the minPrice and maxPrice for the range query
        int minPrice = sc.nextInt();
        int maxPrice = sc.nextInt();
        // TODO: Perform the range query using TreeSet's subSet() method
        SortedSet<Integer> res = pts.subSet(minPrice,true, maxPrice, true);
        // TODO: Print the product prices in the range, or "NO PRODUCTS" if none are found
        if(!res.isEmpty()) {
            for(int i : res) {
                System.out.print(i + " ");
            }
        } else {
            System.out.println("No Products");
        }
        sc.close();
    }
}
