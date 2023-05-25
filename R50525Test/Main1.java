package R50525Test;
import java.util.*;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Q = sc.nextInt();
        sc.nextLine();

        int[] players = new int[N];
        List<String> results = new ArrayList<>();

        for (int i = 0; i < Q; i++) {
            int card = sc.nextInt();
            int playerNo = sc.nextInt() - 1;

            switch(card) {
                case 1:
                    players[playerNo]++;
                    break;
                case 2:
                    players[playerNo] += 2;
                    break;
                case 3:
                    if (players[playerNo] >= 2) {
                        results.add("Yes");
                    } else {
                        results.add("No");
                    }
                    break;
                default:
                    break;
            }
            sc.nextLine();
        }

        //     if (card == 1) {
        //         yellowCards[player]++;
        //         if (yellowCards[player] == 2) {
        //             quit.add(player);
        //         }
        //     } else if (card == 2) {
        //         redCards[player] = true;
        //         quit.add(player);
        //     } else if (card == 3) {
        //         if (quit.contains(player)) {
        //             results.add("Yes");
        //         } else {
        //             results.add("No");
        //         }
        //     }
        // }

        for (var a: results) {
            System.out.println(a);
        }

    }
}