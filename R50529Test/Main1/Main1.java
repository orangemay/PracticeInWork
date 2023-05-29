package R50529Test.Main1;


import java.util.*;
import java.util.stream.Collectors;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        String S = sc.nextLine();
        String[] SS = S.split("");

        // HashMapのキーを使う。 X + "-" + Y
        // (3,5)  "3-5"
        // 田中くんが移動するたびに、その座標がキーになかったら値を1とする。　その座標が、既にhashmapに存在したら過去同じ座標にいたってこと
        Map<String, Integer> dup = new HashMap<>();
        dup.put("0-0", 1);

        int X = 0;
        int Y = 0;
        for(var command: SS){
            switch(command){
                case "R":
                    X++;
                    break;
                case "L":
                    X--;
                    break;
                case "U":
                    Y++;
                    break;
                case "D":
                    Y--;
                    break;
            }
            String key = X + "-" + Y;
            //System.out.println(key);
            if(dup.containsKey(key)){
                //System.out.println("hit");
                System.out.println("Yes");
                return;
            } else {
                //System.out.println("not hit");
                dup.put(key, 1);
            }
        }

        System.out.println("No");

    }
}