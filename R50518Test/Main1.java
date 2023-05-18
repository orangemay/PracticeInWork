package R50518Test;
import java.util.*;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        int x = 0;
        int y = 0;

        for (int i = 0; i < n; i++) {
            if (i % 4 == 0) {
                x += sc.nextInt();
            } else if (i % 4 == 1) {
                y += sc.nextInt();
            } else if (i % 4 == 2) {
                x -= sc.nextInt();
            } else if (i % 4 == 3) {
                y -= sc.nextInt();
            }
        }

        System.out.println(x + " " + y);

    }
}
