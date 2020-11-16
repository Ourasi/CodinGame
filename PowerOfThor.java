import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 * ---
 * Hint: You can use the debug stream to print initialTX and initialTY, if Thor seems not follow your orders.
 **/
class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int lightX = in.nextInt(); // the X position of the light of power <40
        int lightY = in.nextInt(); // the Y position of the light of power <18
        int initialTx = in.nextInt(); // Thor's starting X position <40
        int initialTy = in.nextInt(); // Thor's starting Y position <18

        int thorX = initialTx;
        int thorY = initialTy;

        // game loop
        while (true) {
            int remainingTurns = in.nextInt(); // The remaining amount of turns Thor can move. Do not remove this line.

            // Write an action using System.out.println()
            String directionX = "";
            String directionY = "";

            if (thorX > lightX) {
                directionX = "W";
                thorX-=1;
            } else if (thorX < lightX) {
                directionX = "E";
                thorX+=1;
            } 
            
            if (thorY > lightY) {
                directionY = "N";
                thorY-=1;
            } else if (thorY < lightY) {
                directionY = "S";
                thorY+=1;
            }
            // To debug: System.err.println("Debug messages...");

            // A single line providing the move to be made: N NE E SE S SW W or NW
            System.out.println(directionY+directionX);
        }
    }
}
