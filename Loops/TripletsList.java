package Loops;
/* 
Triples in a List
Alice wants to find the number of triples exist in her list which summed upto Zero.
Explanation:
For Example in a list of [-1 -1 2 -2 1 1 2]
[-1 -1 2] sum is 0
[-2 1 1] sum is 0
Output is 2
Input
5
-12 12 -12 3 4
Output
0
*/
import java.util.Scanner;
public class TripletsList{
    public static void main(String args[]){
        //Change the size of array depending on data size.
        int[] arr=new int[10];
        int i,count=0,n;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        for(i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        for(i=0;i<n-2;i++){
            if(arr[i]+arr[i+1]+arr[i+2]==0){
                count+=1;
            }
        }
        System.out.println(count);
    }
}