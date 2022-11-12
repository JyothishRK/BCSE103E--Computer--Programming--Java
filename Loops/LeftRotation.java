package Loops;
/* 
LeftRotation
Input
The first line contains two seperated integers denoting the respective values of n(the number of integers) and d(the number of rotations you must perform).
Output
Print a single line of n space-separated integers denoting the final state of the array after performing d left rotations
Input
8 3
4 5 6 7 8 9 1 2
Output
7 8 9 1 2 4 5 6
*/
import java.util.Scanner;
public class LeftRotation{
    public static void main(String args[]){
        int n,d,i,j;
        int[] a=new int[20];int[] b=new int[10];
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        d=s.nextInt();
        for(i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        for(i=0;i<d;i++){
            a[n+i]=a[i];
        }
        for(i=d;i<n+d;i++){
            System.out.print(a[i]+" ");
        }
    }
}