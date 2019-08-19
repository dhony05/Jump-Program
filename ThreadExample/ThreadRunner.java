

public class ThreadRunner{

    public static void main(String[] args) {
        
        NumberCounter t1 = new NumberCounter();
        NumberCounter t2 = new NumberCounter();
        t1.start();
        t2.start();
    }
}


public class NumberCounter extends Thread{


    @Override
    public void run(){
        System.out.println("Thread "+ Thread.currentThread().getId()+ " hast started");

        for (int i = 0; i < 10; i++) {
            System.out.println("Thread "+ Thread.currentThread().getId() + ": " +i);

            
        }
       // super.run();
    }
}