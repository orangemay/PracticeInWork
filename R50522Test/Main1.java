package R50522Test;
import java.util.*;

public class Main1 {
    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //試験種類
        int l = sc.nextInt(); //学生人数
        sc.nextLine();

        int[][] scores = new int[l][n];
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < n; j++) {
                scores[i][j] = sc.nextInt();
            }
            sc.nextLine();
        }

        List<Integer> totalScores = new ArrayList<>();
        for (int i = 0; i < l; i++) {
            int total = 0;
            for (int j = 0; j < n; j++) {
                total += scores[i][j];
            }
            totalScores.add(i, total);
        }

        int winnerNum = totalScores.indexOf(Collections.max(totalScores));
        System.out.println(winnerNum + 1);

        int max = Arrays.stream(scores[winnerNum]).max().getAsInt();
        int maxIndex = Arrays.stream(scores[winnerNum]).boxed().toList().indexOf(max);
        System.out.println(maxIndex + 1);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //試験種類
        int l = sc.nextInt(); //学生人数
        sc.nextLine();

        Map<Integer, Integer> scores = new HashMap<>();
        int[][] scores = new int[l][n];
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < n; j++) {
                scores[i][j] = sc.nextInt();
            }
            sc.nextLine();
        }

        

    }
}
