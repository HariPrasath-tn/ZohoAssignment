package Threading;

import static java.lang.System.out;

public class FirstThread {
    public static void main(String[] args) throws Exception{
        Thread th1 = new Thread(() ->{
            int count = 0;
            while(++count != 3){
                    out.println("Thread1");
                    try{Thread.sleep(1000);}catch (Exception e){}
                }

        }, "Thread1");

        Thread th2 = new Thread(()-> {
                while(th1.isAlive()) {
                    out.println("Thread2");
                    try{Thread.sleep(1000);}catch (Exception e){}
                }
        }, "Thread2");
        th1.setPriority(10);
        th2.setPriority(1);
        th1.start();
        th2.start();
        th1.join();
        out.println(th1.getName() + " Completed job ");

        th2.join();
        out.println(th2.getName() + " Completed job ");
        out.println("Success ");
    }
}
