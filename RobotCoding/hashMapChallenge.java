import java.util.HashMap;
import java.util.Scanner;
public class hashMapChallenge{



    public static void main(String[] args) {
        populatingString_String("Parlin", 1);
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter key to find please?");
        
        System.out.println(populate.get(sc.nextLine()));

        

    }

    public static void populatingString_String(String first, int sec) {
        HashMap<String, Integer> populate = new HashMap<String, Integer>();

        // testing populate method
        populate.put(first, sec);
        System.out.println(populate);
        

    }
}