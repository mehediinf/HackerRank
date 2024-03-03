/*
You are given an integer nn, you have to convert it into a string.

Please complete the partially completed code in the editor. If your code successfully converts nn into a string ss the code will print "Good job". Otherwise it will print "Wrong answer".

nn can range between −100−100 to 100100 inclusive.
*/

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

       int n = input.nextInt();

       try{

        if(-100 <=n && n<=100){

            String str = Integer.toString(n);
    
            if (str.equals(n)) {
     
             System.out.println("Wrong answer");
             
            }
            else{
             
             System.out.println("Good job");
            }
     
    
           }

       }catch(Exception e){

            System.out.println("Wrong! Enter your number range between -100 to 100 ");

       }

    }
}
