import java.util.Scanner;
public class exeption{

    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    System.out.println("enter positive number ");
    int n = sc.nextInt(); 


    try {
        if(n > 0){
            System.out.println("it is a positive");
        }
    } catch (Exception e) {
        //TODO: handle exception
        System.out.println("Invalid number");
    }
    }

}