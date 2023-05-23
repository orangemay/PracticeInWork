package R50522Test;
import java.util.*;

public class Main1 {
    // public static void main1(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt(); //試験種類
    //     int l = sc.nextInt(); //学生人数
    //     sc.nextLine();

    //     int[][] scores = new int[l][n];
    //     for (int i = 0; i < l; i++) {
    //         for (int j = 0; j < n; j++) {
    //             scores[i][j] = sc.nextInt();
    //         }
    //         sc.nextLine();
    //     }

    //     List<Integer> totalScores = new ArrayList<>();
    //     for (int i = 0; i < l; i++) {
    //         int total = 0;
    //         for (int j = 0; j < n; j++) {
    //             total += scores[i][j];
    //         }
    //         totalScores.add(i, total);
    //     }

    //     int winnerNum = totalScores.indexOf(Collections.max(totalScores));
    //     System.out.println(winnerNum + 1);

    //     int max = Arrays.stream(scores[winnerNum]).max().getAsInt();
    //     int maxIndex = Arrays.stream(scores[winnerNum]).boxed().toList().indexOf(max);
    //     System.out.println(maxIndex + 1);
    // }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //試験種類
        int l = sc.nextInt(); //学生人数
        sc.nextLine();

        Map<Integer, Integer> scores = new HashMap<>();
        int[][] scoresTable = new int[l][n];
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < n; j++) {
                scoresTable[i][j] = sc.nextInt();
            }
            sc.nextLine();
        }

        for (int i = 0; i < n; i++) {
            int topStudent = 0;
            int topScore = 0;
    
            for (int j = 0; j < l; j++) {
                if (scoresTable[j][i] > topScore) {
                    topScore = scoresTable[j][i];
                    topStudent = j;
                }
            }

            if(scores.containsKey(topStudent)) {
                scores.put(topStudent, scores.get(topStudent) + 1);
            } else {
                scores.put(topStudent, 1);
            }

        }

        int topCount = 0;
        int result = 0;
        for (var a: scores.entrySet()) {
            // System.out.println(a.getKey() + " " + a.getValue());
            if (topCount < a.getValue()) {
                topCount = a.getValue();
                result = a.getKey();
            }
        }
        System.out.println((result + 1) + " " + topCount);
    }
}
