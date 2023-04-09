// package Recursion;

public class basicRecursion {
    public static void printNum(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        printNum(n - 1);
        System.out.print(n + " ");
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return (n * factorial(n - 1));

    }

    public static int sumofNatural(int n) {
        if (n == 1) {
            return 1;
        }
        return (n + sumofNatural(n - 1));
    }

    public static int fabbonacci(int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        return (fabbonacci(n - 1) + fabbonacci(n - 2));

    }

    public static boolean isSorted(int[] arr, int i) {
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return isSorted(arr, i + 1);
    }

    public static int firstOccurance(int[] arr, int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return firstOccurance(arr, key, i + 1);
    }

    public static int lastOccurance(int[] arr, int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        int isFound = lastOccurance(arr, key, i + 1);
        if (isFound == -1 && arr[i] == key) {
            return i;
        } else {
            return isFound;
        }
    }

    public static int calculatePower(int base, int power) {
        if (power == 1) {
            return base;
        }
        return base * (int) Math.pow((double) base, (double) power - 1);
    }

    public static int calcPower(int base, int power) { //T(n) = O(n)
        if(power == 1) {
            return base;
        }
        int halfPower = calcPower(base, power/2);
        int half = halfPower * halfPower;
        if(power % 2 != 0) {
            return base * calcPower(base, power/2);
        }
        return half;
    }

    public static void main(String[] args) {
        // int n = 10;
        int[] arr = { 8, 3, 6, 9, 5, 10, 2, 5, 3 };
        // System.out.println(firstOccurance(arr, 5, 0));
        // System.out.println(lastOccurance(arr, 5, 0));
        // System.out.println(isSorted(arr, 0));
        System.out.println(calcPower(5, 4));
        // printNum(n);
        // System.out.println(factorial(5));
        // System.out.println(sumofNatural(5));
        // System.out.println(fabbonacci(25));
    }
}
