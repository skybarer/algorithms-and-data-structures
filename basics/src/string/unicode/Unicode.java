package string.unicode;

public class Unicode {
    public static void main(String[] args) {
        for (int i = 0; i < Math.pow(2, 16); i++) {
                System.out.printf("%d = %c =%s \n", i, (char) i, Integer.toBinaryString(i));
        }
    }
}
