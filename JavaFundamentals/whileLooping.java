
import java.util.Scanner;

public class whileLooping {

    public static void main(String[] args) {
        counterControlled(40);


        ///////////////************** Sentinel Controlled  */
        Scanner myObjectInput = new Scanner(System.in);

        System.out.println("Enter stop to finish");

        String stopingLoop = "";

        while ((!(stopingLoop = myObjectInput.nextLine()).equalsIgnoreCase("stop"))) {
            System.out.println("Say Whaaaat ?");

        }
        System.out.println("You " + stopingLoop + "ped the loop");
        myObjectInput.close();


        ////////////////////////***********************OBOE */

        int count = 0;
        while(count != 20){
            count =  count + 3;     
            System.out.println(count);

        }

    }

    public static void counterControlled(int input) {
        /*
         * The CounterControlled is programmed to end after it is executed a fixed
         * amount of times for example Challenge: Print all the even numbers from 1-10
         * Count-controlled while loop Must have
         */

        // stating point
        int num = 1;
        // ending condition
        while (num <= input) {
            if (num % 2 == 0) {
                System.out.print("[" +num + "]" + " ");

                // a process to go from
            }
            // begining to ending
            num = num + 1;

        }
        System.out.println("-------------------");

    }
}