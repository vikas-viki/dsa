import java.util.Arrays;

public class Day6 {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 7, 9 };
        // int ans = binarySearch(arr, 7);
        int ans = binaryRecursiveSearch(arr, 70, 0, 4);
        System.out.println(ans);
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

    public static int binarySearch(int nums[], int ele) { // logn
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + ((end - start) / 2);

            if (ele < nums[mid]) {
                end = mid - 1;
            } else if (ele > nums[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static int binaryRecursiveSearch(int nums[], int ele, int start, int end) {
        int mid = start + ((end - start) / 2);
        if (start > end)
            return -1;
        if (ele < nums[mid]) {
            return binaryRecursiveSearch(nums, ele, start, mid - 1);
        } else if (ele > nums[mid]) {
            return binaryRecursiveSearch(nums, ele, mid + 1, end);
        } else {
            return mid;
        }
    }
}
