package math.reverse;

/**
 * @author : akashdhar
 * @date : 12-05-2019
 * @time : 08:04 AM
 */
public class ReverseNumber {

    public static void main(String[] args) {
        System.out.printf("Given number   : %d\n", Long.MAX_VALUE);
        System.out.printf("Reverse number : %d", reverse(Long.MAX_VALUE));
    }

    public static Long reverse(Long num) {

        long reverseNum = 0L;

        while (num > 0) {
            reverseNum = reverseNum * 10 + num % 10;
            num = num / 10;
        }
        return reverseNum;
    }


}
