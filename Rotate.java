import java.util.*;
public class Rotate {
    public static void main(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for(int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter from where to rotate");
        int d = sc.nextInt();   
        int b[] = new int[d];
        for(int j = 0; j < n; j++)
        {
            b[j] = sc.nextInt();
        }
        int p = a.length;        
        int q = b.length;  
        int[] result = new int[p + q];   
        System.arraycopy(a, 0, result, 0,p);  
        System.arraycopy(b, 0, result, p, q);  
        System.out.println(Arrays.toString(result));
}
}
