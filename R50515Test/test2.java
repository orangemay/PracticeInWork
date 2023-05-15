package R50515Test;
import java.util.*;

public class test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        String[] sList = S.split("");

        Map<String, Integer> scoMusic = new HashMap<>();
        scoMusic.put("d", 0);
        scoMusic.put("r", 1);
        scoMusic.put("m", 2);
        scoMusic.put("f", 3);
        scoMusic.put("s", 4);
        scoMusic.put("l", 5);
        scoMusic.put("c", 6);

        /*
        Map<String, Integer> scoMusic = new HashMap<>(Map.of(
            "d", 0,
            "r", 1,
            "m", 2,
            "f", 3,
            "s", 4,
            "l", 5,
            "c", 6
        ));
        */
 
        String nowKey = "m";
            int count = 0;
          int playSec = 1;

        for (int i = 0; i < sList.length; i++) {
            int distance = Math.abs(scoMusic.get(sList[i]) - scoMusic.get(nowKey));
            count += distance + playSec;
            nowKey = sList[i];
        }

        System.out.println(count);
    }
}
