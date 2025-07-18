public class Day4 {
    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        int[] arr2 = {1,8,6,2,5,4,8,3,7};
        // System.out.println(powxn(3, 5));
        // stockBuyAndSell(arr);
        System.out.println(maxArea(arr2));
    }

    public static double powxn(double x, int n) {
        if (x == 0 || x == 1)
            return x;
        if (n == 0)
            return 1.0;
        if (x == -1 && n % 2 == 1)
            return -1.0;
        if (x == -1 && n % 2 == 0)
            return 0.0;

        if (x < 0) {
            x = 1 / x; // cause x^-n = (1/x)^n;
        }

        long binaryForm = Math.abs((long) n);
        double ans = 1;
        while (binaryForm > 0) {
            if (binaryForm % 2 == 1) {
                ans *= x;
            }
            x = x * x;
            binaryForm /= 2;
        }
        return ans;
    }

    public static void stockBuyAndSell(int[] prices) {
        int maxProfit = 0;
        int bestBuy = prices[0];
        for (int i = 0; i < prices.length; i++) {
            maxProfit = Math.max(maxProfit, prices[i] - bestBuy);
            bestBuy = Math.min(bestBuy, prices[i]);
        }
        System.out.println(maxProfit);
    }

    public static int maxArea(int[] height) {
        int left = 0, right = height.length - 1;
        int water = 0;
        while (left < right) {
            int w = right - left;
            int h = Math.min(height[left], height[right]);
            water = Math.max(w * h, water);
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return water;
    }
}