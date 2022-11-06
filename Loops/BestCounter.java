package Loops;
/*
BEST COUNTER
In a theme park, there are N number of ticket counters and in each counter there are currently Mi (where i ranges from 1 to N) number of persons standing in a line to get tickets. Each
counter person takes Ti units of time to service each person. Currently the employees at the counter have gone for a break and they will be back after Bi units of time break.
Ladies and Differently-abled people have special counters where they can go and get the tickets, if the general counter is not free.
A person has to choose the best counter where he can get the ticket at a faster rate, rather than standing for a long time in a queue.
Write a program to choose the best counter.
Assume there are no ambiguous inputs and there are atleast 3 counters.
Input Format:
The first line is an integer(n) which corresponds to total number of counters.
The second line consists of 'n' integers which correspond to number of customers in each counter.
The third line consists of 'n' integers which correspond to the time taken by person in counter to service each customer.
The fourth line consists of 'n' integers which correspond to the break time taken by each person in counter.
The fifth line consists of an integer which corresponds the counter for ladies.
The sixth line consists of an integer which corresponds the counter for differently-abled.
The seventh line consists of a character 'M' or 'F', to indicate the gender.
The eigth line consists of a character 'D' or 'N', to indicate whether the person is Differently-abled or not.
Output format:
Output consists of an integer which corresponds to the counter number.
Input
5
6 7 4 3 2
2 1 3 2 1
10 0 5 15 20
25
MN
Output
3
*/

import java.util.Scanner;
public class BestCounter{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n,i,j,res=0,min=0;
        int[][] arr=new int[4][10];
        n=s.nextInt();
        for(i=0;i<n;i++){
            arr[0][i]=s.nextInt();
        }
        for(i=0;i<n;i++){
            arr[1][i]=s.nextInt();
        }
        for(i=0;i<n;i++){
            arr[2][i]=s.nextInt();
        }
        for(i=0;i<n;i++){
            arr[3][i]=arr[0][i]*arr[1][i]+arr[2][i];
        }
        int lad=s.nextInt();
        int diff=s.nextInt();
        String mf=s.nextLine();
        String dn=s.nextLine();
        min=arr[3][0];
        for(i=0;i<n;i++){
            if(min>arr[3][i]){
                min=arr[3][i];
            }
        }
        for(i=0;i<n;i++){
            if(min==arr[3][i]){
                res=i+2;
                break;
            }
        }
        if(mf=="M" && res==lad){
            res=res+1;
        }
        System.out.println(res);
    }
}