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
   public static Robot robotWorker = new Robot();
   public static SuperWorker superWorker = new SuperWorker();
   public static Worker worker = new Worker();
   public static TempWorker tempWorker = new TempWorker();
   //public static Manager projectManager = new ProjectManager();
   //public static Manager productManager = new ProductManager();

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
      System.out.println("Calling work methods by having manager manage.");
      //I very much want to just make an array of BaseWorker and use a for loop
      tsManager.setWorker(robotWorker);
      tsManager.manage();
      tsManager.setWorker(superWorker);
      tsManager.manage();
      tsManager.setWorker(worker);
      tsManager.manage();
      tsManager.setWorker(tempWorker);
      tsManager.manage();

      System.out.println("Some of the workers are hungry.");
      
      worker.eat();
      superWorker.eat();
      tempWorker.eat();
      
      System.out.println("Now since they ate bad guacomole, some of the workers are sick.");
      
      worker.sick();
      superWorker.eat();
      tempWorker.sick();
      
      System.out.println("Nobody paid attnetion to the robot now it's not working.");
      robotWorker.reboot();
      
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

 




