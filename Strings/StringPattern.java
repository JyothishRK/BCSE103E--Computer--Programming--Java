package Strings;
/* 
Given a String 'S'. Print the following pattern using String S.
Example: S= HELLO
H
H E
H E L
H E L L
H E L L O
H E L L
H E L
H E
H
Input Format
Single Line of input represents String S.
Constraints
1<= String Length <= 1000
Output Format
pattern based on given String.
Sample Input 0
Hello
Sample Output 0
H
H e
H e l
H e l l
H e l l o
H e l l
H e l
H e
H
*/
import java.util.Scanner;
public class StringPattern{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        String a=s.next();
        int n=a.length();
        int j=0;
        while(j<n){
            j++;
            for(int i=0;i<j-1;i++){
                System.out.print(a.charAt(i)+" ");
            }
            System.out.print(a.charAt(j-1));
            System.out.println();
        }
        while(j>0){
            j--;
            for(int i=0;i<j-1;i++){
                System.out.print(a.charAt(i)+" ");
            }
            System.out.print(a.charAt(j-1));
            System.out.println();
        }
    }
}
