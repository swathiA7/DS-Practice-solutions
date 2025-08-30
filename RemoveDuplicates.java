import java.util.*;
import  java.io.*;
class SecondLarge
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no.of elements:");
        int n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("Enter elements:");
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        RemoveDuplicates p = new RemoveDuplicates();
        int[] r = p.removeDuplicatesUsingStream(a);
        n=r.length;
        Arrays.sort(r);
        System.out.println("2nd largest element"+r[n-2]);
        System.out.println("3rd largest element"+r[n-3]);
    
    }
}
public class RemoveDuplicates {
    public static int[] removeDuplicatesUsingStream(int[] arr) {
        return Arrays.stream(arr)
                     .distinct()
                     .toArray();
    }
}