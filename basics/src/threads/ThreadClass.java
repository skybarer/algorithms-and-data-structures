package threads;

/**
 * @author : akashdhar
 * @date : 30-06-2019
 * @time : 04:25 PM
 */
public class ThreadClass extends Thread {


    public static void main(String[] args) {
        ThreadClass threadClass = new ThreadClass();
        ThreadClass threadClass1 = new ThreadClass();
        threadClass.start();
        // java.lang.IllegalThreadStateException
        // threadClass.start();
        threadClass1.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
    }
}
