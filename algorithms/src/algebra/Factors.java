package algebra;

import java.util.*;

public class Factors {
    public static List<Long> factors(long n) {
        List<Long> list = new ArrayList<>();
        for (long i = 1; i * i < n; i++) {
            if (n % i == 0) {
                list.add(i);
                if(n != i) list.add(n / i);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        List<Long> f = factors(24);
        Collections.sort(f);
        System.out.println(f);

        List<Long> f1 = factors(12);
        Collections.sort(f1);
        System.out.println(f1);
    }
}
