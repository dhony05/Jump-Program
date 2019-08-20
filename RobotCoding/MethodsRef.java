import java.util.Arrays;
import java.util.List;

public class MethodsRef{

    

    

    public void classicIterationg(List aList){
        for (String var : aList) {
            System.out.println(var);
        }
    
    
        }
public static void main(String[] args) {

    List <String> myArray = Arrays.asList("a","b","c","d","e","f","g","h","i","j");
    MethodsRef inRef = new MethodsRef();
    IteraFace iter = inRef::classicIterationg;
    iter.Iterating();
    
    long start = System.currentTimeMillis();
   myArray.stream().forEach(x ->  System.out.print(x));
   long end = System.currentTimeMillis();
   System.out.println(" time " +(end-start));
}

}

public interface IteraFace{

    public void Iterating();
}