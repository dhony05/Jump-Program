
 class By5{  
    synchronized void printTable(String n){//synchronized method  
      for(int i=1;i<n.length();i++){  
        System.out.println(n.charAt(i));  
        try{  
         Thread.sleep(400);  
        }catch(Exception e){System.out.println(e);}  
      }  
     
    }  
   }  
     
    class FirstThread extends Thread{  
   By5 t;  
   public FirstThread(By5 t){  
   this.t=t;  
   }  
   public void run(){  
   t.printTable("rr");  
   }  
     
   }  
    class SecondThread extends Thread{  
   By5 t;  
   public SecondThread(By5 t){  
   this.t=t;  
   }  
   public void run(){  
   t.printTable("RR");  
   }  
   }  
     
   public class SynchonizedExample{
   public static void main(String args[]){  
   By5 obj = new By5();//only one object  
   FirstThread t1=new FirstThread(obj);  
   SecondThread t2=new SecondThread(obj);  
   t1.start();  
   t2.start();  
   }  
   }  