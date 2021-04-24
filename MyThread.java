class MyThread extends Thread {  
       public void run() 
            { System.out.println(“ this thread is running ... ”); 
               for(int i=0;i<5;++i)                                          
               System.out.println("Child thread " +i);         
          }  } 
class ThreadEx1 {
 public static void main(String [] args ) {  
             MyThread t = new MyThread();   
             t.start();                                                                   
            for(int i=0;i<5;++i)                                                         
                System.out.println("  main thread   "+i);              
} } 

