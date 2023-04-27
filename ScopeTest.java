public class ScopeTest {
    public static void main(String args[]) {
        Scopes s = new Scopes(50);
        s.loopNumber();
        s.loopNumber2();
        System.out.println(s.number); 
    }
}

class Scopes {
    int number;

    public Scopes(int a) {
        this.number = a;
    }

    public void loopNumber() {
        int number = 10;
        for(int i = 0; i < 5; i ++) {
            number += 1;
            System.out.println(number);
        }

        System.out.println("loopNumberの最後：" + this.number);
    }

    public void loopNumber2() {
        for(int i = 0; i < 5; i++) {
            number += 5;
            System.out.println(number);
        }
        int number = 10;

        System.out.println("loopNumber2の最後：" + number);
    }
}