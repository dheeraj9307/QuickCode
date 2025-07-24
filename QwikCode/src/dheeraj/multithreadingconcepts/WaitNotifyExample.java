/*
sleep() pauses a thread without releasing the lock, usually to delay execution. 
wait() causes a thread to release the lock and wait until notified. 
notifyAll() wakes all waiting threads so they can compete to reacquire the lock and continue.
 */
package dheeraj.multithreadingconcepts;

class WaitNotifyExample {
    public static void main(String[] args) {
        final Object lock = new Object();

        Thread t1 = new Thread(() -> {
            synchronized (lock) {
                System.out.println("Thread-1 waiting...");
                try {
                    lock.wait(); // releases lock
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread-1 resumed!");
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (lock) {
                System.out.println("Thread-2 notifying...");
                lock.notify(); // wakes up t1
            }
        });

        t1.start();
        try { Thread.sleep(1000); } catch (Exception e) {}
        t2.start();
    }
} 
/*OUTPUT:
Thread-1 waiting...
Thread-2 notifying...
Thread-1 resumed!
*/
