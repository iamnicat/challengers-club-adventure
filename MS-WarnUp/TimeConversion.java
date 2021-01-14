import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        
            if (s.charAt(8) == 'P') {

            if (s.substring(0, 2) == "12") {
                return s.substring(0, 8);
            }
            int hour = Integer.parseInt(s.substring(0, 2));
            int newHour = hour + 12;
            return "" + newHour + s.substring(2, 8);

        }
        if (s.charAt(8) == 'A') {

            if (s.substring(0, 2).equals("12")) {
                return "" + 0 + 0 + s.substring(2, 8);
            }
            return s.substring(0, 8);
        }

        return "";
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}
