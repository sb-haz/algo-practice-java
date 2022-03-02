public class Fibonacci {

    public static void main(String[] args) {

        int num = 10;

        System.out.println(fibonacci(num));
    }

    static int fibonacci(int num) {

        int fib[] = new int[num + 2];

        fib[0] = 0;
        fib[1] = 1;

        for (int i = 2; i <= num + 1; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        return fib[num];
    }
}
