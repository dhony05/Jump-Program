import java.util.Scanner;

public class StringSc{


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please type any sentence of your choosing: ");
        String sentence = "";
        while ((!(sentence = sc.nextLine()).equalsIgnoreCase("exit"))) {
            
            
            System.out.println("Please type any sentence of your choosing: ");
        }
        sc.close();



    }

    public static void getVowelNum(String s){
         int count = 0;
         for (int i = 0; i < s.length(); i++) {
             if((s.charAt(i).equalsIgnoreCase("a"))
             ||(s.charAt(i).equalsIgnoreCase("e"))
             ||(s.charAt(i).equalsIgnoreCase("i"))
             ||(s.charAt(i).equalsIgnoreCase("o"))
             ||(s.charAt(i).equalsIgnoreCase("u")) {


             }
         }
    }

}