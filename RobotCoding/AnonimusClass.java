public class AnonimusClass extends claseEstatica{



    public static void main(String[] args) {
        claseEstatica a = claseEstatica();
        a.doWhatever1();
        a.doWhatever2();
        a.unMetodo();
        
    }

    static class claseEstatica{

        public void unMetodo(){
            System.out.println("This is printing unMetodo");
        }

        class anony implements unaInterface1,unaInterface2{
            @Override
            doWhatever1(){
                System.out.println("doWhatever1 is printing something");
    
            }
            doWhatever2(){
                System.out.println("doWhatever2 is printing something");
    
            }
    
            
        }

    }

}

public class unaClase{


}
public interface unaInterface{
    public abstract doWhatever1();


    interface otraInteface{
        public abstract doWhatever2();


    }
}