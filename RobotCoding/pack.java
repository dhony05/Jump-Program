public class pack extends cook{

    public static void main(String[] args) {
        absolute(-5);
        
        System.out.println(absolute(-5));
        
        System.out.println(cooked());
       
    }


    public static int absolute(int n){
        
        return Math.abs(n);

    }

}


public static class cut{

    public static String cutting(){
        return "I have cut the onion!";
    }

}

public static class fry extends cut{
    public static String fried (){
        return cut()+ "I have fried the onion!";
    }
}

public static class cook extends fry{
    
    public static String cooked(){
        return fry()+ "Together, we have cooked onion!";
    }
}
