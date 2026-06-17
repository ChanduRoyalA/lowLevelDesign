package Threads.Practice;

public class SMSThread extends Thread{
    SMSThread(){
        setName("SMS-THREAD");
    }
    @Override
    public void run() {
        try {
            System.out.println("Thread Started : " + getName());
            Thread.sleep(2000);
            System.out.println("Thread Finished : " + getName());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
