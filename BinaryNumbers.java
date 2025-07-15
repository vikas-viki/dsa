public class BinaryNumbers {
    public static void main(String[] args) {
        decimalToBinary(10);
        // decimalToBinaryV2(101);
        // binaryToDecimal(1100101);
    }

    public static void decimalToBinary(int n) {
        StringBuilder s = new StringBuilder("");
        while (n >= 1) {
            s.insert(0, n % 2);
            n = n / 2;
        }
        System.out.println(s);
    }

    public static void decimalToBinaryV2(int n) {
        int ans = 0;
        int pow = 0;
        while (n >= 1) {
            int rem = n % 2;
            ans += (Math.pow(10, pow) * rem);
            pow++;
            n = n / 2;
        }
        System.out.println(ans);
    }

    public static void binaryToDecimal(int n) {
        int pow = 0;
        int ans = 0;
        while (n > 0) {
            int rem = n % 10;
            ans += (Math.pow(2, pow) * rem);
            pow++;
            n = n / 10;
        }
        System.out.println(ans);
    }
}
