
 class Sync{  
     //synchronized method 
    synchronized void printStatus(int n){
        System.out.println("Thread "+ Thread.currentThread().getId()+ " hast started");
      for(int i=0;i<=10;i++){   
        System.out.println("Thread "+ Thread.currentThread().getId() + ": " +i);   
        try{ 
         Thread.sleep(400);  
        }catch(Exception e){System.out.println(e);} 
         
      }  
     
    }  
   }  
     
    class FirstThread extends Thread{  
   Sync t;  
   public FirstThread(Sync t){
         
   this.t=t;  
   }  
   public void run(){  
 
   t.printStatus(0);  
   }  
     
   }  
     
   public class SynchronizedClass{
   public static void main(String args[]){  
   Sync obj = new Sync();//creatign only one object  
   FirstThread t1=new FirstThread(obj);  
   FirstThread t2=new FirstThread(obj);
   FirstThread t3=new FirstThread(obj);   
   t1.start();  
   t2.start(); 
   t3.start(); 
   }  
   }  