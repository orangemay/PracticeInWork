import java.math.BigInteger;
import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        sc.nextLine();

        String[] tmpA = RpgMap.readLineWithConvert(sc, H);
        String[] tmpB = RpgMap.readLineWithConvert(sc, H);
        RpgMap.setHW(H, W);

        RpgMap A = new RpgMap(tmpA);
        RpgMap B = new RpgMap(tmpB);

        if(A.equals(B)){
            System.out.println("Yes");
            return;
        }

        for(int i = 0; i < H; i++){
            for(int j = 0; j < W; j++){
                A.shiftHorizontal();
                //A.display();
                if(A.equals(B)){
                    System.out.println("Yes");
                    return;
                }
            }
            A.shiftVerticalBackward();
            if(A.equals(B)){
                System.out.println("Yes");
                return;
            }
        }

        System.out.println("No");

    }
}

class RpgMap{
    static int h;  // タテ
    static int w;  // ヨコ
    String[] binStr;

    public RpgMap(String[] rows){
        this.binStr = rows;
    }

    public static void setHW(int h, int w){
        RpgMap.h = h;
        RpgMap.w = w;
    }

    public static String[] readLineWithConvert(Scanner sc, int count){
        String[] tmp = new String[count];
        for(int i = 0; i < count; i++){
            tmp[i] = sc.nextLine().replace('.','0').replace('@','1');
        }
        return tmp;

    }

    /*
     * 後方縦シフト
     */
    public void shiftVerticalBackward(){
        String[] shifted = new String[RpgMap.h];
        for(int i = 0; i < RpgMap.h; i ++){
            shifted[i] = binStr[(i + 1) % (RpgMap.h)];
        }
        this.binStr = shifted;
    }

    /*
     * 横シフト
     */
    public void shiftHorizontal(){
        int bin;
        int overDigit;
        for(int i = 0; i < RpgMap.h; i++){
            overDigit = Integer.parseInt(String.valueOf(binStr[i].charAt(0)));
            bin = Integer.parseInt(binStr[i], 2) << 1;
            bin -= (overDigit << (RpgMap.w));
            bin += overDigit;
            String tmp = Integer.toBinaryString(bin);
            BigInteger bigInt = new BigInteger(tmp);
            String origin = String.format("%0" + RpgMap.w + "d", bigInt);
            binStr[i] = origin;
        }
    }

    /*
     * 全表示
     */
    public void display(){
        System.out.println("A---------------");
        for(var a: this.binStr){
            System.out.println(a.replace('0','.').replace('1','@'));
        }
        System.out.println("A-end--------------");
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof RpgMap)){
            return false;
        }
        RpgMap compare = (RpgMap)obj;
        for(int i = 0; i < RpgMap.h; i++){
            int originBin = Integer.parseInt(binStr[i], 2);
            int compBin = Integer.parseInt(compare.binStr[i], 2);
            if( originBin != compBin){
                return false;
            }
        }
        return true;
    }
}