import java.util.*;
public class RotateSwap{
    int n,i,d,j;
    Scanner sc =  new Scanner(System.in);
    n =sc.nextInt();
    int arr[] = new int[n];
    d =sc.nextInt();
    for(i=0;i<n;i++){
        arr[i]=sc.nextInt();    
    } 
    int ary[]= new int[d];
    for(j=0;j<d;j++){
        ary[j]= arr[j];
    } 
    for(i=0;i<n;i++){
        System.out.println(ary[i]);    
    } 
     
}
