import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // the number of temperatures to analyse
        int d = 0;
        //int dMax = 5526;
        //int dMin = -273;
        for (int i = 0; i < n; i++) {
            
             // temperature by default
            int t = in.nextInt(); // a temperature expressed as an integer ranging from -273 to 5526
            
            if (Math.abs(t) > 0){
                if (d == 0)
                    d = t;
                else if (Math.abs(t) < Math.abs(d))
                    d = t;
                else if (t == Math.abs(d) || Math.abs(t) == d)
                    d = Math.abs(t);
                else if (t == d)
                    d = t;
            }
        }

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println(d);
    }
}
