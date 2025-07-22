public class Day5 {
    public static void main(String[] args) {
        int n = 39;
        int ar1[] =  {1,2,3,4};
        // prime(n);
        productExceptSelfBF(ar1);
    }

    public static boolean prime(int n) {
        boolean prime = true;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                prime = false;
            }
        }
        return prime;
    }

    public static int[] productExceptSelfBF(int[] nums) {
        int a[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int product = 1;
            for (int j = 0; j < nums.length; j++) {
                if (j != i) {
                    product *= nums[j];
                }
            }
            a[i] = product;
        }
        return a;
    }
}
