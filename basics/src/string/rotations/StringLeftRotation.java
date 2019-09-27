package string.rotations;

/**
 * @author : akashdhar
 * @date : 30-06-2019
 * @time : 10:11 AM
 */
public class StringLeftRotation {

    private static String leftRotate(String str) {
        return str.substring(1) + str.charAt(0);
    }

    public static void main(String[] args) {
        String input = "aaxaabc";
        String output = "aabcaax";
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.equals(output)) {
                break;
            } else {
                input = leftRotate(input);
                count++;
            }
        }
        System.out.println(input);
    }
}
