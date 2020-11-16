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
        int N = in.nextInt();
        ArrayList<Integer> p = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int pi = in.nextInt();
            p.add(pi);
        }

        Collections.sort(p);
        int p0 =0;
        int d = p.get(0);
        for(int i : p){
            if (Math.abs(i-p0) < d)
                d = Math.abs(i-p0);
            p0 = i;
        }

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println(d);
    }
}
