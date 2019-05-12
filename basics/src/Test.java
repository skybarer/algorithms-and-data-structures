/**
 * @author : akashdhar
 * @date : 13-04-2019
 * @time : 07:18 PM
 */

class access {
    public int x;
    private int y;

    void call(int a, int b) {
        x = a + 1;
        y = b;
    }
}

public class Test {

    public static long getIdealNums(long l, long r) {
        // Write your code here
        long expoSum = 0;
        long count = 0;
        for (long i = 0; i <= l; i++) {
            for (int j = 0; j <= r; j++) {
                expoSum = (long) (Math.pow(3, i) * Math.pow(5, j));
                if (expoSum >= l && expoSum <= r) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void printValue(int i, int j, int k) {
        System.out.println("int");
    }


    public static void printValue(byte... b) {
        System.out.println("long");
    }

    public static void main(String[] args) {
        byte b = 9;
//        printValue(b, b, b);
//        System.out.println(getIdealNums(1, 1));
        access obj = new access();
        obj.call(2,3);
//        System.out.println(obj.x+ " "+obj.y);
    }
}
