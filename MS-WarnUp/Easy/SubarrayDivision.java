import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the birthday function below.
    static int birthday(List<Integer> s, int d, int m) {

        int ways = 0;
        int sum = 0;
      
        if(m <= s.size()) 
            for(int i = 0; i < m; i++)
                sum += s.get(i);
        if(sum == d) ways++;
       
            
        for(int i = 0; i < s.size()-m; i++)
        {
            sum = sum - s.get(i) + s.get(i+m);
            if(sum == d) ways++;
        }
        return ways;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] sItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> s = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int sItem = Integer.parseInt(sItems[i]);
            s.add(sItem);
        }

        String[] dm = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int d = Integer.parseInt(dm[0]);

        int m = Integer.parseInt(dm[1]);

        int result = birthday(s, d, m);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
