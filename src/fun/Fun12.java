package fun;

/**
 * Project Admin -> Husanboy Azamov
 * Package Name  -> fun
 * Class Date -> 6/21/2022/ 2:05 PM
 */
public class Fun12 {

    static int a, b, c;

    public static void main(String[] args) {
        a = 3;
        b = 2;
        c = 3;
        show(); // 3 2 3
        sort3();
        show(); // 2 3 3
    }


    public static void sort3() {
        if (a > b) {
            int t = a;
            a = b;
            b = t;
        }
        if (b > c) {
            int t = b;
            b = c;
            c = t;
        } // a=6, b=1, c=9



        // avval dastlabki 2 tasi saralansin
        if (a > b) {
            int t = a;
            a = b;
            b = t;
        } // a=1, b=6, c=9
    }

    public static void show() {
//        System.out.printf("%d, %d, %d\n", a, b, c);
        System.out.println(a + " " + b + " " + c);
    }
}
