package Loops;
/* 
Decreasing.Increasing
Provided S - a set of n integers S = s1, s2, ..., sn. Check whether it is possible to divide S into two parts: s1, s2, ..., si and si+1, si+2, ..., sn (1 <= i < n)
Remember that the first part is strictly decreasing while the second is strictly increasing one.
Input Format
In the first line you are given an integer 2<=n<=100 and
in the following line n integers
-100 <= si <= 100.
Output Format
One word Yes or No.
Input
5
-1 2 -1 1 -1
Output
No
Input
6
3 1 -2 -2 -1 3
Output
Yes
*/
import java.util.Scanner;
    public class DecreasingIncreasing{
    public static void main(String args[]){
        int n,i,pos=0;
        int[] arr=new int[20];String res="Yes";
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        for(i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        while(arr[i]>arr[i+1] && i<n){
            i++;
        }
        pos=i;
        for(i=pos;i<n+1;i++){
            if(arr[i]>arr[i+1]){
                res="No";
        }
        }
        System.out.println(res);
    }
}

