package Threads.Practice;

import java.util.concurrent.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Bank {
    int amount;
    String name;
    Lock lock;

    Bank(String name, int amount) {
        this.name = name;
        this.amount = amount;
        this.lock = new ReentrantLock();
    }

    void addAmount(int amount) {
        this.amount += amount;
    }

    int getAmount() {
        return this.amount;
    }

    public void deducteAmount(int amount) {
        this.amount -= amount;
    }
}

class TransferAmount implements Runnable {
    int amount;
    Bank from;
    Bank to;

    TransferAmount(Bank from, Bank to, int amount) {
        this.amount = amount;
        this.to = to;
        this.from = from;
    }


    @Override
    public void run() {
        boolean lockA = false;
        boolean lockB = false;

        if (amount < from.amount) {
            System.out.println("Transferring :" + amount + " from " + from.name + " to " + to.name);
            System.out.println(Thread.currentThread().getName() + "Trying to Lock " + from.name);
            try {
                lockA = from.lock.tryLock(1000, TimeUnit.MILLISECONDS);
                if (lockA) {
                    System.out.println(Thread.currentThread().getName() + "Locked " + from.name);
                    System.out.println(Thread.currentThread().getName() + "Trying to Lock " + to.name);
                    lockB = to.lock.tryLock(1000, TimeUnit.MILLISECONDS);
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        System.out.println("Interrupted");
                    }
                    if (lockB) {
                        System.out.println(Thread.currentThread().getName() + "Locked " + to.name);
                        from.deducteAmount(amount);
                        to.addAmount(amount);
                        System.out.println(from.name + " amount :" + from.amount);
                        System.out.println(to.name + " amount :" + to.amount);

                        System.out.println(Thread.currentThread().getName() + "unLocked " + to.name);
                        System.out.println("Funds transferred by" + Thread.currentThread().getName());
                    } else {
                        System.out.println(Thread.currentThread().getName() + "Failed to Lock " + to.name);
                    }
                } else {
                    System.out.println(Thread.currentThread().getName() + "Failed to Lock " + from.name);
                }
            } catch (InterruptedException e) {

            } finally {
                if (lockA) {
                    from.lock.unlock();
                    System.out.println(Thread.currentThread().getName() + "unLocked " + from.name);
                }
                if (lockB) {
                    to.lock.unlock();
                    System.out.println(Thread.currentThread().getName() + "unLocked " + to.name);
                }
            }
        }
    }
}

public class ThreadPractice {

    public void main(String[] args) throws InterruptedException, ExecutionException {
        Bank a = new Bank("Bank A", 1000);
        Bank b = new Bank("Bank B", 200);

        TransferAmount tA = new TransferAmount(a, b, 100);
        TransferAmount tB = new TransferAmount(b, a, 100);
        Thread t1 = new Thread(tA);
        Thread t2 = new Thread(tB);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

    }
}
