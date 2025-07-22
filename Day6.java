import java.util.Arrays;

public class Day6 {
    public static void main(String[] args) {

    }

    public int[] productExceptSelf(int[] nums) {
        int ans[] = new int[nums.length];
        Arrays.fill(ans, 1);
        int suffix = 1;

        for (int i = 1; i < nums.length; i++) {
            ans[i] = ans[i - 1] * nums[i - 1];
        }

        for (int j = nums.length - 2; j >= 0; j--) {
            suffix *= nums[j + 1];
            ans[j] *= suffix;
        }

        return ans;
    }
}
