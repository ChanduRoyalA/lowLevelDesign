package Threads.Practice;

public class EmailThread extends Thread{
    EmailThread(){
        setName("EMAIL-THREAD");
    }

    @Override
    public void run() {
        try {
            System.out.println("Thread Started : " +getName());
            Thread.sleep(5000);
            System.out.println("Thread Finished : " +getName());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
