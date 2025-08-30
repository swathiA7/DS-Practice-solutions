import java.util.*;
import java.math.*;
import java.io.*;
class ThreeGreatCandidates
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        int[] ar = Arrays.sort(arr);
        System.out.println(Math.max(ar[0] * ar[1] * ar[n - 1],ar[n - 1] * ar[n - 2] * ar[n - 3]));
    }
}