


import java.util.HashMap;
public class EvenOdd{


    public static void main(String[] args) {
        int[] a = {5,7,2,4,9};
        populatingEvenOdd(a);

    }
    public static void populatingEvenOdd(int[] num) {
        int value = 0;
        HashMap<Integer, Integer> evenOdd = new HashMap<Integer, Integer>();
        for (int i = 0; i < num.length; i++) {    
        
        if (num[i] % 2 == 0) {
            value = 0;
            evenOdd.put(num[i], value);

        } else {
            value = 1;
            evenOdd.put(num[i], value);
        }
    }
        System.out.println(evenOdd);
    }
}