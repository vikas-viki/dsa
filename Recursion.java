public class Recursion {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        // printName(1, 3);
        // printOneToN(4);
        // printNToOne(4);
        // printSumOfN(3, 0);
        // System.out.println(getSumOfN(3));
        // System.out.println(factorial(4));
        // factorial(4, 1);
    }

    public static void printName(int current, int end) {
        if (current > end)
            return;
        System.out.println("Vikas");
        printName(current + 1, end);
    }

    public static void printOneToN(int n) { // backtracking mechanism
        if (n == 0)
            return;
        printOneToN(n - 1);
        System.out.println(n);
    }

    public static void printNToOne(int n) {
        if (n == 0)
            return;
        System.out.println(n);
        printNToOne(n - 1);
    }

    public static void printSumOfN(int n, int sum) {
        if (n == 0) {
            System.out.println(sum);
            return;
        }
        sum += n;
        printSumOfN(n - 1, sum);
    }

    public static int getSumOfN(int n) {
        if (n == 0) {
            return 0;
        }

        return n + getSumOfN(n - 1);
    }

    public static int factorial(int n) {
        if(n == 1){
            return 1;
        }
        return n * factorial(n -1);
    }

    public static void factorial(int n, int fact){
        if(n == 1){
            System.out.println(fact);
            return;
        }
        fact *= n;
        factorial(n  -1 , fact);
    }
}
