package heap_space;

/**
 * @author : akashdhar
 * @date : 04-05-2019
 * @time : 08:52 AM
 */
public class Heap {

    public static void heapDetails (){
        // Get current size of heap in bytes
        long heapSize = Runtime.getRuntime().totalMemory();

        // Get maximum size of heap in bytes. The heap cannot grow beyond this size.// Any attempt will result in an OutOfMemoryException.
        long heapMaxSize = Runtime.getRuntime().maxMemory();

        // Get amount of free memory within the heap in bytes. This size will increase // after garbage collection and decrease as new objects are created.
        long heapFreeSize = Runtime.getRuntime().freeMemory();
        System.out.println("heapSize : " + heapSize/(1024*1024) +"MB");
        System.out.println("heapMaxSize : " + heapMaxSize/(1024*1024) +"MB");
        System.out.println("heapFreeSize : " + heapFreeSize/(1024*1024) +"MB");
    }
}
