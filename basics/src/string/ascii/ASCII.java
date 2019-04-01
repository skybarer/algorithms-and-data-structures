package string.ascii;

/**
 * @author : akashdhar
 * @date : 31-03-2019
 * @time : 12:36 AM
 */
public class ASCII {
    public static void main(String[] args) {
        System.out.println("character size in java: " + (char) 97);
        System.out.println("character size in java: " + (byte) 'a');

        for (int i = 0; i < 256; i++) {
            System.out.printf("%d = %c =%s \n", i, (char) i, Integer.toBinaryString(i));
        }
    }
}
