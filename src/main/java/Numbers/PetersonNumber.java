package Numbers;

/*A number is said to be Peterson if the sum of factorials of each digit is equal to the sum of the number itself.Number = 145
145 = !1 + !4 + !5
=1+4*3*2*1+5*4*3*2*1
=1+24+120
145=145*/

import java.util.Scanner;

public class PetersonNumber {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=145;int sum=0;
        int temp=n;
        while(n>0){
            sum=sum+findFactorial(n%10);
            n=n/10;
        }
        if(sum==temp)
            System.out.println(true);
        else System.out.println(false);
    }

    public static int findFactorial(int n){
        int factorial=1;
        while(n>1){
            factorial=factorial*n;
            n--;
        }
        System.out.println( "factorial is "+factorial);
    return  factorial;
    }
}
