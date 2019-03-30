package swaping;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author : akashdhar
 * @date : 30-03-2019
 * @time : 07:41 PM
 */
public class SwappingUsingAtomic {

    public static void swap(AtomicInteger a, AtomicInteger b) {
        // look mom, no tmp variables needed
        a.set(b.getAndSet(a.get()));
    }

    public static void main(String[] args) {
        AtomicInteger a = new AtomicInteger(10);
        AtomicInteger b = new AtomicInteger(12);

        System.out.printf("a = %s, b = %s\n", a, b);
        swap(a, b);
        System.out.printf("a = %s, b = %s\n", a, b);

    }
}
