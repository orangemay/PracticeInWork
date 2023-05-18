package R50518Test;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        int[] selectionA = new int[n];
        int[] selectionB = new int[n];

        for (int i = 0; i < n; i++) {
            selectionA[i] = sc.nextInt();
        }
        sc.nextLine();

        ArrayList<Integer> results = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            selectionB[i] = sc.nextInt();
            if (selectionA[i] == selectionB[i]) {
                results.add(i + 1);
            }
        }
        
        if (results.isEmpty()) {
            System.out.println("0");
        } else {
            for (var result: results) {
                System.out.print(result + " ");
            }
        }
    }
}
