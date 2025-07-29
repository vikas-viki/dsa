import java.util.Arrays;

class Day7 {
    public static void main(String[] args) {
        int arr[] = { 40, 30, 10, 20 };
        int m = 2;
        // painterPartition(arr, m);
        int cowsArr[] = { 1, 2, 8, 4, 9 };
        int cows = 3;
        // aggressiveCows(cowsArr, cows);
        int piles[] = {3,6,7,11};
        int h = 8;
        minEatingSpeed(piles, h);
    }

    public static void minEatingSpeed(int[] piles, int h){
        int start = 1;
        int end = Integer.MIN_VALUE;
        for(int i =0; i< piles.length; i++){
            end = Math.max(end, piles[i]);
        }
        int ans= -1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(isKokomidPossible(piles, h, mid)){
                ans = mid;
                end = mid - 1;
            }else {
                start = mid + 1;
            }
        }
        System.out.println(ans);
    }

    public static boolean isKokomidPossible(int[] piles, int h, int k) {
        int hours = 0;
        for (int pile : piles) {
            hours += (pile + k - 1) / k;
        }
        return hours <= h;
    }

    public static void aggressiveCows(int arr[], int c) { // O(nlogn + log(range) * n)
        Arrays.sort(arr); // O(n log n)
        int start = 0;
        int max =  arr[arr.length - 1];
        int min = arr[0];
        int end = max - min;
        int ans = -1;
        while (start <= end) { // O(log(range))
            int mid = start + (end - start) / 2;

            if (isCowsPossible(arr, c, mid)) {
                ans = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        System.out.println(ans);
    }

    public static boolean isCowsPossible(int arr[], int cows, int mid) { // O(n)
        int numCows = 1;
        int lastPos = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - lastPos >= mid) {
                numCows++;
                lastPos = arr[i];
            }
        }
        return numCows >= cows;
    }

    public static void painterPartition(int arr[], int m) { // O(log(sum) * n)
        long end = 0;
        long start = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            end += arr[i];
            if (arr[i] > start) {
                start = arr[i];
            }
        }

        long ans = -1;
        while (start <= end) {
            long mid = start + (end - start) / 2;

            if (isPossible(mid, arr, m)) {
                System.out.println("mid: " + mid);
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        System.out.println(ans);
    }

    public static boolean isPossible(long maxPossibleVal, int arr[], int m) {
        int painter = 1;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (sum + arr[i] <= maxPossibleVal) {
                sum += arr[i];
            } else {
                painter++;
                sum = arr[i];
            }
        }
        return painter <= m;
    }
}