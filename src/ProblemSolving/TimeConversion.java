package ProblemSolving;

import Java.DateAndTime;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class TimeConversion {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) throws ParseException {
        /*
         * Write your code here.
         */
        Date horaParsed = new SimpleDateFormat("hh:mm:ssa").parse(s);
        SimpleDateFormat formatarHora = new SimpleDateFormat("HH:mm:ss");
        return formatarHora.format(horaParsed);
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException, ParseException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}

