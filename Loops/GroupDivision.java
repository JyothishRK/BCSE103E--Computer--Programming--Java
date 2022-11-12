package Loops;
/* 
group_division
Given a group of j numbers S = s1, s2, ..., sj and another group of k numbers Q = q1, q2, ..., qk. If (q1 + q2 + ... + qk)/k < (s1 + s2 + ... + sj)/j please print the sequence S and otherwise please print the
sequence Q.
Input Format
In the first line you are given one integer 2<=n<=1000, and in the following line n integers: -1000 <= si <= 1000.
In the third line you are given one integer 2<=m<=1000, and in the following line m integers: -1000 <= qi <= 1000.
Constraints
-1000 <= si <= 1000. -1000 <= qi <= 1000.
Output Format
The sequence of requested integers separated by spaces in the same order as in the input.
Sample Input 0
5
-2 -1 0 1 4
6
-3 -2 -1 1 2 3
*/
import java.util.Scanner;
public class GroupDivision{
    public static void main(String ags[]){
        int i,j,k,res1=0,res2=0;
        int[] a=new int[100];int[] b=new int[100];
        Scanner s=new Scanner(System.in);
        j=s.nextInt();
        for(i=0;i<j;i++){
            a[i]=s.nextInt();
        }
        k=s.nextInt();
        for(i=0;i<k;i++){
            b[i]=s.nextInt();
        }
        for(i=0;i<j;i++){
            res1+=a[i];
        }
        for(i=0;i<k;i++){
            res2+=b[i];
        }
        if((res1/j)>=(res2/k)){
            for(i=0;i<j;i++){
                System.out.print(a[i]+" ");
            }
        }
        else{
            for(i=0;i<k;i++){
                System.out.print(b[i]+" ");
            }
        }
    }
}