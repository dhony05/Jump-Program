class Originals implements Cloneable{
    int a =0;
    String b = "";

    Originals(int x, String y){
        a = x;
        b = y;
    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}



public class CloneDemo{


    public static void main(String[] args)  throws CloneNotSupportedException{
        Originals old = new Originals(50, "Hello");
        Originals dopleGanger = (Originals)old.clone(); //deep clone has his own space in nmemory 
        Originals shadow = old ; // Shadow clone have the same reference in the memory

        old.a = 7;
        old.b = "thig a change into this clone";
        System.out.println(shadow.a + " "  + shadow.b);
        System.out.println(old.a + " "  + old.b);
        System.out.println(dopleGanger.a + " "  + dopleGanger.b);


    }


}