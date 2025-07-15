public class Patterns {
    public static void main(String[] args) {
        // printContinuosly(3);
        // printTriangle(4);
        // printTriangleReverse(4);
        // printTriangleReverseV2(4);
        // printReverseTriangle(4);
        // printPyramid(4);
        // printHollowDiamond(4);
        printButterFly(4);
    }

    public static void printPyramid(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            // for (int j = 0; j < (i * 2) + 1; j++) {
            // if (j > i) {
            // System.out.print((i * 2 + 1) - j);
            // } else {
            // System.out.print(j + 1);
            // }
            // }
            for (int j = 0; j < i + 1; j++) {
                System.out.print(j + 1);
            }
            for (int j = i; j > 0; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void printHollowDiamond(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j = 0; j < (i * 2 - 1); j++) {
                System.out.print(" ");
            }
            if (i != 0) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j = 0; j < n - 1 - (i * 2); j++) {
                System.out.print(" ");
            }
            if (i != n - 2) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printButterFly(int n) {
        // upper half
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < ((n * 2) - (i * 2) - 2); j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // lower half
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < i * 2; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printContinuosly(int n) {
        int k = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                k++;
                System.out.print(k + " ");
            }
            System.out.println("");
        }
    }

    public static void printTriangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    public static void printTriangleReverse(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j > 0; j--) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }

    public static void printReverseTriangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j < i) {
                    System.out.print(" ");
                } else {
                    System.out.print(i + 1 + "");
                }
            }
            System.out.println("");
        }
    }

    public static void printTriangleReverseV2(int n) {
        int k = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j > 0; j--) {
                k++;
                System.out.print(k + " ");
            }
            System.out.println("");
        }
    }

    public static void printTillN(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print((j + 1) + " ");
            }
            System.out.println("");
        }
    }

    public static void printTillNChars(int n) {
        int a = (int) 'A';
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print((char) (a + j) + " ");
            }
            System.out.println("");
        }
    }
}
