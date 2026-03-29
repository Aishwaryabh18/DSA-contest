import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static boolean isImperfect(int x) {
        if (x <= 0) return false;
        return ((x % 2 == 0) ^ (x % 5 == 0));

    }
    public static void main(String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t--> 0) {
            int d = 0;
            int n = sc.nextInt();

            while (true) {
                int l = n - d;
                int r = n + d;

                if (isImperfect(l) || isImperfect(r)) {
                    System.out.println(d);
                    break;
                }
                d++;
            }
        }
    }
}