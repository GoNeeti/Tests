package Numbers;

import java.util.Scanner;

public class ArmStrongNum {
    //A positive number is called armstrong number if
    // it is equal to the sum of cubes of its digits for example 0, 1, 153, 370, 371, 407 etc.

    public static void main(String args[]){
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        System.out.println(isArmStrong(n));
    }

    public static boolean isArmStrong(int n){
        int s=0,t=1, n1=n;
        while(n>0){
            t=n%10;
            n=n/10;
            s=s+(t*t*t);
        }
        System.out.println(s);
        if(s==n1)
            return true;
        return false;
    }
}
