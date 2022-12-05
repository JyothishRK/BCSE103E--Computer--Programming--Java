package Strings;
/* 
In a college students are playing a game in their activity class. 
They are given cards with words on them and then the students have to sort them alphabetic order. Suama is a student in that class who is good in java programmming.
She want to write a Java program for this task your task is to help her.
Given S is a line of string with multiple words. Suma and you have to read the line of string and sort the words in alphabetical order and display them with length of each word

Input Format:
single line of string
Constraints:
lenth of string>0
Output Format:
print sorted words line by line with lengths
Sample Input 0:
hello this is an example with cased letters
The sorted words are:
an : 2
cased : 5
example : 7
hello : 5
is : 2
letters: 7
this: 4
with: 4
*/
import java.util.Scanner;
public class StringSorting{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int i,j;
        String a=s.nextLine();
        String mod[]=a.split(" ");
        int n=mod.length;
        for(i=0;i<n-1;++i){
            for(j=0;j<n-i-1;++j){
                char s1=mod[j].charAt(0);char s2=mod[j+1].charAt(0);
                if(mod[j].charAt(0)>mod[j+1].charAt(0)){
                    String temp=mod[j];mod[j]=mod[j+1];mod[j+1]=temp;
                }
            }
        }
        System.out.println("The sorted words are:");
        for(i=0;i<n;i++){
            System.out.println(mod[i]+" : "+mod[i].length());
        }
    }
}
