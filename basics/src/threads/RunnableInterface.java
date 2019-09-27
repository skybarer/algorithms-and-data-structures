package threads;

/**
 * @author : akashdhar
 * @date : 30-06-2019
 * @time : 04:33 PM
 */
public class RunnableInterface implements  Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new RunnableInterface());
        Thread thread1 = new Thread(new RunnableInterface());
        thread.start();
        thread1.start();
    }
}
