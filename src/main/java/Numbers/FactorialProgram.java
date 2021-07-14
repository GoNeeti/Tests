package Numbers;

import java.util.Scanner;

public class FactorialProgram {

    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n= s.nextInt();
        printFactorialUsingLoop(n);
        System.out.println("factorial using recursion is "+ factorialusingRecursion(n));

    }

    public static void printFactorialUsingLoop(int n){
        int fact=1;
        for(int i=2;i<=n;i++){
            fact=fact*i;

        }
        System.out.println("Factorial Using Loop is " + fact);
    }

    public static int factorialusingRecursion(int n){
        if(n<=1)
            return 1;
        return n*factorialusingRecursion(n-1);


    }


}
