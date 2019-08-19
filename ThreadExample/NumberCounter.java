public class NumberCounter extends Thread{


    @Override
    public void run(){
        System.out.println("Thread "+ Thread.currentThread().getId()+ " hast started");

        for (int i = 0; i < 100; i++) {
            System.out.println("Thread "+ Thread.currentThread.getId() + ": " +nun);

            
        }
        super.run();
    }
}