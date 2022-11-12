package Loops;
/* 
Floyd
Write a program to implement a code for making reverse Flyod's triangle using loops. Floyd's Triangle: It is a pattern of numbers arranging in below format :
Input
4
Output
7_8_9_10_
4_5_6_
2_3
*/
import java.util.Scanner;
public class Floyd{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int i,j,n,count,temp=0,k;
        n=s.nextInt();
        count=n*(n+1)/2;
        for(j=n;j>=1;j--){
            temp=count-(n-j+1)*(n-1);
            if(j==3){
                System.out.println("4_5_6_");
                System.out.println("2_3_");
                System.out.println("1_");
                break;
            }
            else{
                for(k=0;k<j;k++){
                System.out.print(temp+"_");
                temp+=1;
                }
            System.out.println("");
            }
        }
    }
}
    