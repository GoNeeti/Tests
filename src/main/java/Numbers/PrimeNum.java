package Numbers;

import java.util.Scanner;

public class PrimeNum {

    public static void main(String args[]){

        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        int n2=s.nextInt();
        System.out.println(isPrime(n));
        //Print prime numbers between two num
        for(int i=n; i<=n2;i++){
            if(isPrime(i))
                System.out.print(i+" ");
        }

    }

    public  static boolean isPrime(int n){

        if(n<=1) return false;
        for(int i=2;i<=n/2;i++){
            if(n%i==0)
                return false;
            }
        return true;
    }

}
