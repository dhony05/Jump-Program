import java.util.HashMap;

public class populatingHashMap {

    public static void main(String[] args) {
        populatingString_String("hello", "hola");
        int[] newArray = { 5, 2, 4, 5, 6, 7, 3, 12, 14, 10, 100, 400, 34, 30 };
        populatingDivFive(newArray);
    }

    /*
     * This method will take two Strings as parameters (key/value) and will store in
     * the hash map, This will print what it is stored inside the hash map
     */

    public static void populatingString_String(String first, String sec) {
        HashMap<String, String> populate = new HashMap<String, String>();

        // testing populate method
        populate.put(first, sec);
        System.out.println(populate);

        // testing populatingEvenOdd method
        for (int i = 0; i < 10; i++) {
            populatingEvenOdd(i);
        }

    }

    /*
     * This method will take a paramether type int and will verify if the paramether
     * is even or odd if the paramether is even will be stored in the hash mas with
     * the value of 0 and if is odd will have the value of 1, this is a great method
     * because if you want to retrieve only the odds just got use the inner method
     * .get(1) or .get(0) for even
     */
    public static void populatingEvenOdd(int num) {
        int value = 0;
        HashMap<Integer, Integer> evenOdd = new HashMap<Integer, Integer>();
        if (num % 2 == 0) {
            value = 0;
            evenOdd.put(num, value);

        } else {
            value = 1;
            evenOdd.put(num, value);
        }
        System.out.println(evenOdd);
    }

    public static void populatingDivFive(int[] numbs) {
        HashMap<Integer, Boolean> divByFive = new HashMap<Integer, Boolean>();
        for (int i = 1; i < numbs.length; i++) {
            if (numbs[i] % 5 == 0) {
                divByFive.put(numbs[i], true);
            } else {
                divByFive.put(numbs[i], false);
            }
        }
        System.out.println(divByFive);
    }

}