package R50522Test;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        List<Integer> scoreA = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            scoreA.add(sc.nextInt());
        }

        sc.nextLine();

        // List<Integer> scoreB = new ArrayList<>();
        // for (int i = 0; i < n; i++) {
        //     scoreB.add(sc.nextInt());
        // }

        StringBuilder results = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int output = scoreA.get(i) - sc.nextInt();
            results.append(output);
            results.append(" ");
        }

        System.out.println(results);

    }
}