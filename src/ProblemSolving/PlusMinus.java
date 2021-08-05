package ProblemSolving;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class PlusMinus {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        int positivo=0;
        int negativo=0;
        int zero=0;

        for (int i: arr) {
            if (i > 0) {
                positivo++;
            } else if (i < 0) {
                negativo++;
            } else {
                zero++;
            }
        }
        System.out.printf("%.6f\n", (float)positivo/arr.length);
        System.out.printf("%.6f\n", (float)negativo/arr.length);
        System.out.printf("%.6f\n", (float)zero/arr.length);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}