package ir.dotin;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Computing {
    private static int[] a;

    public static int[] getA() {
        return a;
    }

    public static void setA(int[] a) {
        Computing.a = a;
    }

    static int countShifting(int[] arr, int n) {

        int inputArray[] = new int[n];

        for (int i = 0; i < n; i++)
            inputArray[i] = arr[i];
        int count = 0;
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            if (arr[i] != inputArray[i]) {
                count++;
            }
        }
        return count;
    }
}




