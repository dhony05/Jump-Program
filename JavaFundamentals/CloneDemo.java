class Originals implements Cloneable{
    int aInteger =0;
    String bString = "";

    Originals(int x, String y){
        aInteger = x;
        bString = y;
    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}



public class CloneDemo{


    public static void main(String[] args)  throws CloneNotSupportedException{
        Originals old = new Originals(50, "Hello");
        Originals dopleGanger = (Originals)old.clone(); //deep clone has his own space in nmemory 
        Originals shadow = old ; // Shadow clone have the same reference in the memory if original change , shadow clone change too

        old.aInteger = 7;
        old.bString = "thig a change into this clone";
        System.out.println(shadow.aInteger + " "  + shadow.bString);
        System.out.println(old.aInteger + " "  + old.bString);
        System.out.println(dopleGanger.aInteger + " "  + dopleGanger.bString);


    }


}