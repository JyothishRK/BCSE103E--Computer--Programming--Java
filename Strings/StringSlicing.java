package Strings;
/*
Sruthi has got the task to slicing the string S with N charecters and she has to find no of VOWELs in each slice. Your task
is to help Sruthi to slice the given string S with N charecters and Display no of VOWELs each slice.
Input Format
First line contains a string s with out any spaces Second line contains integer N
Constraints
string length <100
N<=10
Output Format
print each slice and no of vowels line by line
Sample Input 0
welcome
4
Sample Output 0
welc: 1
elco: 2
lcom: 1
come: 2
*/
import java.util.Scanner;
public class StringSlicing{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n,i,j,len;
        String a=s.nextLine();
        len=a.length();
        n=s.nextInt();
        for(i=0;i<len-3;i++){
            String s1=a.substring(i,i+n);
            int count =0;
        for(int k=0;k<n;k++){
            if(s1.charAt(k)=='a' || s1.charAt(k)=='e' || s1.charAt(k)=='i' || s1.charAt(k)=='o' || s1.charAt(k)=='u' || s1.charAt(k)=='A' || s1.charAt(k)=='E' || s1.charAt(k)=='I' || s1.charAt(k)=='O' || s1.charAt(k)=='U'){
                count++;
            }
        }
        System.out.println(s1+": "+count);
        }
    }
}
