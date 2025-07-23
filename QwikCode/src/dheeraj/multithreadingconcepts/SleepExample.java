package dheeraj.multithreadingconcepts;

class SleepExample {
    public static void main(String[] args) {
        System.out.println("Start");
        try {
            Thread.sleep(2000); // 2 seconds pause
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("End after 2 seconds");
    }
}
/*
OUTPUT:
Start
End after 2 seconds
*/