package listTypes.arraylists;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // TODO: Read the number of elements for the first LinkedList (n1)
        int n1 = sc.nextInt();
        // TODO: Create the first LinkedList to store integers
        LinkedList<Integer> list1 = new LinkedList<>();
        // TODO: Read and add n1 integers to the first LinkedList
        for(int i = 0; i < n1; i++) {
            list1.add(sc.nextInt());
        }
        // TODO: Read the number of elements for the second LinkedList (n2)
        int n2 = sc.nextInt();
        // TODO: Create the second LinkedList to store integers
        LinkedList<Integer> list2 = new LinkedList<>();
        // TODO: Read and add n2 integers to the second LinkedList
        for(int i = 0; i < n2; i++) {
            list2.add(sc.nextInt());
        }
        // TODO: Compare the two LinkedLists
        boolean flag = list1.containsAll(list2);
        // TODO: Print whether they are identical or not
        
        sc.close();
    }
}