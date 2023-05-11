import java.util.*;

public class enhance {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder ans = new StringBuilder(sc.nextLine());
        int n = sc.nextInt();
        sc.nextLine();

        int[] feedNums = new int[n];
        for (int i = 0; i < n; i++) {
            feedNums[i] = sc.nextInt();
        }
        sc.nextLine();

        for (int feedNum: feedNums) {
            ans.append(" ");
            for (int i = 0; i < feedNum; i++) {
                ans.append("a");
            }
        }

        System.out.println(ans.toString());

    }
}

// public class enhance {
//     public static void main(String[] args) {
        
//         Feed pokemon = new Feed();

//         pokemon.name();
//         pokemon.intake();
//     }
    
// }

// class Feed {

//     Scanner sc = new Scanner(System.in);
//     String name = sc.nextLine();
//     String[] nameList = name.split(",");

//     int numberFeed = sc.nextInt(); //食事の回数
//     int foodIntake = sc.nextInt(); //餌の個数

//     public void name() {
//         ArrayList<String> nameArr = new ArrayList<String>(Arrays.asList(nameList));

//         for (int i = 0; i < numberFeed; i++) {
//             nameArr.add(" ");
//         }

//         String result = String.join("", nameArr);
//         System.out.print(result);
//     }

//     public void intake() {

//         //int[] intakeNumber = new int[numberFeed];
//         for (int i = 0; i < numberFeed - 1; i++) {
//             int intakeNumber = foodIntake;
//             for (int j = 0; j < intakeNumber; j++) {
//                 System.out.print("a");
//             }
//             System.out.print(" ");
//         }
//     }
// }