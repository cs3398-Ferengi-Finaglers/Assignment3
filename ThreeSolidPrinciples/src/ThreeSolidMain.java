// The ThreeSolidMain Class follows the Single Responsibility Principle of running the program 
// when it is called by the Operating System. This is due to the fact that the main class serves 
// only one type of user -- the person running the program. The I/O is geared to serve the user. 
// Similarly, the ThreeSolidMain Class also follows the Open Close Principle because the main 
// class calls for the Manager class instead of implementing setWorker() and Manage() methods. 
//Ana Prymachenko 

package ThreeSolidPrinciples;

import java.awt.*;        // Using AWT container and component classes
import java.awt.event.*;  // Using AWT event classes and listener interfaces
import java.io.*;

//import threesolid.IWorker;


public class ThreeSolidMain
{   

   public static Manager tsManager = new Manager();

   // The entry main() method
   public static void main(String[] args) 
   {
 
      try 
      {
         System.out.format("Starting ... \n");               
      } 
      catch (Exception main_except)
      {
         main_except.printStackTrace();
      }

            try 
      {
         System.out.format("Stopping ... \n");               
      } 
      catch (Exception main_except)
      {
         main_except.printStackTrace();
      }

      System.exit(0);

   }
 }

 




