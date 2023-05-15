package R50515Test;
import java.util.*;

public class test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            set.add(sc.nextInt());
        }

        if (n == set.size()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        int[] inputs = new int[n];
        for (int i = 0; i < n; i++) {
            inputs[i] = sc.nextInt();
        }

        // boolean flag = true;
        // for (int i = 0; i < n; ++i) {
        //     for (int j = i + 1; j < n; ++j) {
        //         if (inputs[i] == inputs[j]) {
        //             flag = false;
        //             break;
        //         }
        //     }
        // }

        // if (flag == true) {
        //     System.out.println("YES");
        // } else {
        //     System.out.println("NO");
        // }
    }
}
