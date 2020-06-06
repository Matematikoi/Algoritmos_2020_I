import java.util.Scanner;

public class Codeforces {
    static int a, b;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if (smartestSearch(x)){
            System.out.println(a+" "+b);
        }else {
            System.out.println(-1);
        }
    }

    /**
     * It's constant time,doesn't get
     * better than this
     * @param x
     * @return
     */
    private static boolean smartestSearch(int x) {
        if (x>1){
            a=x;b=x;
            return true;
        }
        return false;
    }


    /**
     * It's a better search since b has to divide a it
     * means that b<a. Also since a*b > x means we can start at
     * b <- a and stop when a*b <= x for a fixed a.
     *
     * @param x The x for the problem
     * @return A boolean, True if it found a matching pair a,b. False otherwise
     */
    private static boolean betterSearch(int x) {
        for (a = x ; a*2 > x ; a--){
            for (b=a ; a*b > x; b--){
                if (condition(x)){
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * This is the brute search, it search absolutely every possible pair that lays
     * in the specified range.
     * @param x
     * @return A boolean, True if it found a matching pair a,b. False otherwise
     */
    static boolean absoluteBruteForce(int x){
        for ( a = 1;a<=x;a++){
            for (b=1 ; b<=x;b++){
                if (condition(x)){
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean condition(int x) {
        return a<=x && b<=x && 1 <= a && 1<=b && a%b==0 && a*b >x && a<b*x;
    }


}

