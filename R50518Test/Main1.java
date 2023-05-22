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

// class Main{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int N = sc.nextInt();
//         sc.nextLine();
        
//         int[] A = new int[N];
//         for(int i = 0 ; i < N; i ++){
//             A[i] = sc.nextInt();
//             sc.nextLine();
//         }

//         int direction = 0;  //  最初は北向き
//         int x = 0; // X座標の初期値
//         int y = 0; // Y座標の初期値
//         for(var a: A){

//             switch(direction) {
//                 case 0:    // 北: Y軸のプラス方向
//                     y = y + a;
//                     break;
//                 case 1:   // 東   X軸のプラス方向
//                     x = x + a;
//                     break;
//                 case 2:   // 南   Y軸のマイナス方向
//                     y = y - a;
//                     break;
//                 case 3:   // 西   x軸のマイナス方向
//                     x = x - a;
//                     break;
//                 default:
//                     break;
//             }
//             direction = (direction + 1) % 4;
//         }

//         System.out.println(x + " " + y);
//     }
// }
