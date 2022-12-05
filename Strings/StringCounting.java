package Strings;
/*
Program to Count the Occurrences of each Word in a given Sentence/String.
Input Format
Accept a string/Sentence and a word from the user.
Constraints
Only Characters accepted.
Output Format
Print the total count.
Sample Input 0
hi hi bye hi bye
bye
Sample Output 0
Count of the word is: 2
*/
import java.util.Scanner;
public class StringCounting{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        String one=s.nextLine();
        String[] two=one.split(" ");
        int n=two.length;
        String key=s.next();
        int count=0;
        for(int i=0;i<n;i++){
            if(key.compareTo(two[i])==0){
                count+=1;
            }
        }
        System.out.println("Count of the word is: "+count);
    }
}
