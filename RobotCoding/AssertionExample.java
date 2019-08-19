import java.util.Scanner;
public class AssertionExample{


    /*
    Create a program that verify if you have the right age to drink alcohol 
    the program will contain a method and with in the method an Assertion statement
    */
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Welcome to JumpBar, Enter age please: ");
    int age = sc.nextInt();
    checkingAge(age); 
    sc.close();   
    }
    public static void checkingAge(int age){
            assert age >= 21 : "The person is underage, therefore can't drink alcohol";
            System.out.println("The person is " + age + " years old and can drink alcohol.");

    }
}