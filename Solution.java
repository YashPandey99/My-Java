import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        int rem=0;
        int m =0;
        int num=n;
        int c=0;
        int a=0;
        while(n>0){
            rem=n%2;
            n=n/2;
            c=c*10+rem;
        }
        while(c>0){
            rem = c%10;
            if(rem==1){
                a++;
            }
            if(rem==0){
                a=a*10+rem;
                }    
        }
        System.out.println(a);
        scanner.close();
    }
}
