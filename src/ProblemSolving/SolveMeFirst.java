package ProblemSolving;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SolveMeFirst {
    static void solveMeFirst(int a, int b) {
        int sum = a+b;
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        solveMeFirst(a, b);
    }

}
