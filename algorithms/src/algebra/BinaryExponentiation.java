package algebra;

public class BinaryExponentiation {

    public static long powerRecursive(long a, long b) {
        if (b == 0) return 1;
        if ((b & 1) == 1) return a * powerRecursive(a * a, (b - 1) / 2);
        return powerRecursive(a * a, b / 2);
    }

    public static long powerIterative(long a, long b) {
        long res = 1;
        while (b > 0) {
            if ((b & 1) == 1) res = res * a;
            a *= a;
            b >>= 1;
        }
        return res;
    }

    public static long powerMod(long a, long b, long m) {
        a %= m;
        long res = 1;
        while (b > 0) {
            if ((b & 1) == 1) res = a * a % m;
            a = a * a % m;
            b >>= 1;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(powerMod(2, 1000, (10^9+7)));
        System.out.println(powerIterative(2, 8));
        System.out.println(powerRecursive(2, 9));
        System.out.println(powerRecursive(2, 10));
    }
}
