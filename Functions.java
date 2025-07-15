public class Functions {
    public static void main(String[] args) {
        // sumOfDigits(154);
        // calculateNCR(8, 2);
        printNthFibonacci(10);
    }

    public static void sumOfDigits(int num) {
        int sum = 0;

        while (num != 0) {
            sum += (num % 10);
            num = num / 10;
        }
        System.out.println(sum);
    }

    public static void calculateNCR(int n, int r) {
        // ncr = n! / (n-r)! * r!
        int ncr = factorial(n) / (factorial(n - r) * factorial(r));
        System.out.println(ncr);
    }

    public static int factorial(int n) {
        if (n == 1)
            return 1;

        return n * factorial(n - 1);
    }

    public static void printNthFibonacci(int n) {
        int count = 2;
        if (n <= 1) {
            System.out.print(n);
            return;
        }
        int f1 = 0, f2 = 1, f3 = 0;

        while (count <= n) {
            f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
            count++;
        }
        System.out.println(f3);

    }
}
