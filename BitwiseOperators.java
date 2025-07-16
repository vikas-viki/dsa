public class BitwiseOperators {
    public static void main(String[] args) {
        // reverseInt(521);
        isPowerOfTwo(34);
    }

    public static void isPowerOfTwo(int n){
        System.out.println(Integer.bitCount(n) == 1);
    }

    public static void reverseInt(int n) {
        int newn = 0;
        int pow = String.valueOf(n).length() - 1;
        while (n > 0) {
            int rem = n % 10;
            n = n / 10;
            newn += rem * Math.pow(10, pow);
            pow--;
        }
        System.out.println(newn);
    }
}
