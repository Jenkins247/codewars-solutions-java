package kata.kyu8;

public class SumOfMultiples {
    public static long sumMul(int n, int m) throws IllegalArgumentException{
        if (n < 1 || m < 1) throw new IllegalArgumentException("n or m < 1");
        int sum = 0;
        for (int i = n; i < m; ) {
            sum += i;
            i += n;
        }
        return sum;
    }
}
