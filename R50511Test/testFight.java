import java.util.*;

public class testFight {
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);
        String name = sc.nextLine();
        String[] nameList = name.split(",");
        ArrayList<String> list = new ArrayList<String>(Arrays.asList(nameList));

        int feedNumber = sc.nextInt();
        for (int i = 0; i < feedNumber; i++) {
            list.add(0, "a");
        }

        String result = String.join("", list);
        System.out.println(result);
    }
}

