/*prompting user to enter starting veloicty,
ending veloicty and time in seconds. Using this
information to find average acceleration
*/   
   //importing a scanner
   import java.util.Scanner;

//Name of the Class
public class Practice_2_6 {

   //Main Method
   public static void main(String[] args) {
   
      //creating a new scanner
      Scanner input = new Scanner(System.in);

   //Average acceleration is defined as the change of
   //velocity divided by the time taken to make the change.
   
      //prompting the user to enter the starting velocity
      System.out.println("Enter the starting veloicty: ");
      
      //taking input from a user of starting velocity
      double starting_veloicty = input.nextDouble();
      
      //prompting the user to enter the ending velocity
      System.out.println("Enter the ending veloicty: ");
      
      //taking input from a user of ending velocity
      double ending_veloicty = input.nextDouble();
      
      //prompting the user to enter the time span in seconds
      System.out.println("Enter the time span in seconds: ");
      
      //taking input from a user of time span in seconds
      double time_span_seconds = input.nextDouble();
      
      //calculating the average acceleration
      double avg_accel = (ending_veloicty - starting_veloicty)/time_span_seconds;
      
      //Displaying the average acceleration
      System.out.println("Average Acceleration: " + avg_accel);
      
   }//endo of main block
}//End of Class Practice_2_6   