package R50529Test.Main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int N = sc.nextInt();
//         sc.nextLine();

//         List<Double> aArr = new ArrayList<>();
//         for (int i = 0; i < 5 * N; i++) {
//             aArr.add(Double.valueOf(sc.nextInt()));
//         }

//         int numberPer = 5 * N;
//         for (int i = 0; i < N; i++) {
//             double max = Math.max(aArr.get(1), aArr.get(0));
//             double min = Math.min(aArr.get(1), aArr.get(0));
    
//             for (int j = 2; j < numberPer; j++) {
//                 max = Math.max(aArr.get(j), max);
//                 min = Math.min(aArr.get(j), min);
//             }
//             aArr.remove((Double)max);
//             aArr.remove((Double)min);
//             numberPer -= 2;
//         }

//         double sum = aArr.stream().mapToInt(Double::intValue).sum();
//         double result = sum / numberPer;
//         System.out.println(result);
//         }
// }

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();

        List<Integer> scores = new ArrayList<>();
        for(int i = 0; i< N*5; i++){
            scores.add(sc.nextInt());
        }

        // 昇順ソートして、真ん中の3Nだけ別リストとして切り出せばよい。
        List<Integer> scores2 = scores.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        List<Integer> scores3 = scores2.subList(N, 4 * N);

        // あとは3N分の平均値を求める
        double total = 0;
        for(var a: scores3){
            total += a;
        }
        System.out.println(total / (3 * N));
        
    }
}
