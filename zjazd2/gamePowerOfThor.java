
/*AUTHOR: Joanna Walkiewicz
*SUMMARY: Your program must allow Thor to reach the light of power.
*Thor moves on a map which is 40 wide by 18 high. Note that the coordinates (X and Y) start at the top left! This means the most top left cell has the coordinates "X=0,Y=0" and the most bottom right one has the coordinates "X=39,Y=17".

*Once the program starts you are given:
*the variable lightX: the X position of the light of power that Thor must reach.
*the variable lightY: the Y position of the light of power that Thor must reach.
*the variable initialTX: the starting X position of Thor.
*the variable initialTY: the starting Y position of Thor.
*At the end of the game turn, you must output the direction in which you want Thor to go among.*/


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
      int lightX = in.nextInt(); // the X position of the light of power
      int lightY = in.nextInt(); // the Y position of the light of power
      int initialTx = in.nextInt(); // Thor's starting X position
      int initialTy = in.nextInt(); // Thor's starting Y position

      // game loop
      
          
      int x = 0;
      int y = 0;
      while (true) {
          int remainingTurns = in.nextInt(); // The remaining amount of turns Thor can move. Do not remove this line.
          int posx = initialTx + x; 
          int posy = initialTy + y; 
          
          String dir = ""; //dir=direction
          
          
          if(lightY > posy) 
          {
              dir = dir + "S"; 
              y++; //dodajemy 1 do Y 
          }
          else if(lightY < posy) 
          {
              dir = dir + "N"; 
              y--; 
          }
          
         
          
          if(lightX > posx) 
          {
              dir = dir + "E"; 
              x++; 
          }
          else if(lightX < posx) 
          {
              dir = dir + "W"; 
              x--; 
          }
          
          // Write an action using System.out.println()
          // To debug: System.err.println("Debug messages...");
          System.err.println("X:" + posx);
          System.err.println("Y:" + posy);

          // A single line providing the move to be made: N NE E SE S SW W or NW
          System.out.println(dir);
      }
  }
}
