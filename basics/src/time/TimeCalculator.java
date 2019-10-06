package time;

import java.util.concurrent.TimeUnit;

/**
 * @author : akashdhar
 * @date : 14-04-2019
 * @time : 12:02 PM
 */
public class TimeCalculator {
    private static long startTime = 0;
    private static long endTime = 0;

    public static void startTime() {
        startTime = System.nanoTime();
    }

    public static void endTime() {
        endTime = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println("Total Time: " + totalTime / 1_000_000_000.0 + " sec");
    }
}
