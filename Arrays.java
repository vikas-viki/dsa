import java.util.HashMap;

public class Arrays {
    public static void main(String[] args) {
        int arr[] = { 4, 2, 7, 8, 1, 2, 5 };
        int arrb[] = { 1, 2, 3, 4, 3, 2, 2, 1, 3 };
        // reverseArray(arr);
        // printUnique(arrb);
        printCommon(arr, arrb);
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
}
