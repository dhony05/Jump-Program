public class LambdaEx {

    public static void main(String[] args) {
        PrintName anonymus =(String name,String lastname)  ->{
            return String.format("%s %s", name,lastname);

        };
        System.out.println(anonymus.printUserName("Donelys", "Familia"));

    }
}
@FunctionalInterface
public interface PrintName{

    public String printUserName(String first, String sec);
}