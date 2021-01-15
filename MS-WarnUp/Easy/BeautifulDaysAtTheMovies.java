import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the beautifulDays function below.
    static int beautifulDays(int i, int j, int k) {
          
    int num,count=0,result;
    int temp, newNum = 0, x = 0;
    for ( x = i; x <= j ; x++)
    {
        num = x;
        newNum = 0;
     
        while (num != 0)
        {
            temp = num % 10;
            newNum = 10 * newNum + temp;
            num = num / 10;
        }
        if(x>newNum){
            result = x-newNum;
        }else{
            result = newNum-x;
        }
        
 
        if (result%k==0)
        {
            count++;
        }
    }
    return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] ijk = scanner.nextLine().split(" ");

        int i = Integer.parseInt(ijk[0]);

        int j = Integer.parseInt(ijk[1]);

        int k = Integer.parseInt(ijk[2]);

        int result = beautifulDays(i, j, k);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
