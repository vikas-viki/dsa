import java.util.HashMap;

public class Arrays {
    public static void main(String[] args) {
        int arr[] = { 4, 2, 7, 8, 1, 2, 5 };
        int arrb[] = { 1, 2, 3, 4, 3, 2, 2, 1, 3 };
        int arrc[] = { 2, 3, 7, 9 };
        int arrd[] = { 1, 2, 3, 5, 3, 5, 5,5,5,5,5,5,5,5,55,5,57, 6, 5, 8, 9, 7, 5, 5, 5, 5, 6, 4, 1, 5, 5, 2, 4, 5, 5 };
        // reverseArray(arr);
        // printUnique(arrb);
        // printCommon(arr, arrb);
        // maximumSubarraySumBrute(arr);
        // maximumSubarraySumKadane(arr);
        // pairSumBrute(arrc, 11);
        // pairSumTwoPointer(arrc, 11);
        majorityElement(arrd);
    }

    public static void reverseArray(int[] a) {
        int i = 0;
        int j = a.length - 1;
        while (i < j) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
        for (int k = 0; k < a.length; k++) {
            System.out.print(a[k] + " ");
        }
    }

    public static void printUnique(int[] a) {
        boolean yes = true;
        for (int i = 0; i < a.length; i++) {
            yes = true;
            for (int j = 0; j < a.length; j++) {
                if (a[j] == a[i] && i != j)
                    yes = false;
            }

            if (yes) {
                System.out.println("Unique: " + a[i]);
                return;
            }
        }
    }

    public static void printCommon(int a[], int b[]) {
        HashMap<Integer, Integer> mp = new HashMap<Integer, Integer>();
        for (int i = 0; i < a.length; i++) {
            mp.put(a[i], mp.getOrDefault(a[i], 0) + 1);
        }
        for (int i = 0; i < b.length; i++) {
            Integer val = mp.get(b[i]);
            if (val != null && val > 0) {
                System.out.println(b[i]);
                mp.put(b[i], val - 1);
            }
        }
    }

    public static void maximumSubarraySumBrute(int a[]) {
        int len = a.length;
        int max = 0;
        for (int i = 0; i < len; i++) {
            int sum = 0;
            for (int j = i; j < len; j++) {
                sum += a[j];
                if (sum > max)
                    max = sum;
            }
        }
        System.out.println(max);
    }

    public static void maximumSubarraySumKadane(int a[]) {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int num : a) {
            sum += num;
            max = Math.max(sum, max);
            if (sum < 0)
                sum = 0;
        }
        System.out.println(max);
    }

    public static void pairSumBrute(int nums[], int target) {
        int a = 0, b = 0;
        for (int num1 : nums) {
            for (int num2 : nums) {
                if (num1 + num2 == target) {
                    a = num1;
                    b = num2;
                }
            }
        }
        System.out.println(a + " " + b);
    }

    public static void pairSumTwoPointer(int nums[], int target) {
        int i = 0;
        int j = nums.length - 1;
        while (i < j) {
            int sum = nums[i] + nums[j];
            if (sum < target) {
                i++;
            } else if (sum > target) {
                j--;
            } else {
                System.out.println(nums[i] + " " + nums[j]);
                return;
            }
        }
    }

    public static void majorityElement(int[] n) {
        int freq = 0;
        int ans = 0;
        for (int num : n) {
            if (freq == 0) {
                ans = num;
            }
            if (ans == num) {
                freq++;
            } else {
                freq--;
            }
        }
        // if we have to return -1 if no majority element
        // int count = 0;
        // for (int num : n) {
        //     if (num == ans)
        //         count++;
        // }
        // System.out.println(count + " " + n.length);
        // if (count < n.length / 2)
        //     ans = -1;
        
        System.out.println(ans);
    }
}
