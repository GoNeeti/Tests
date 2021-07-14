package Numbers;

import java.util.Scanner;

//A number is called an automorphic number if and only if the square of the given number ends with the same number
// itself. For example, 25, 76 are automorphic numbers because their square is 625 and 5776, respectively
// and the last two digits of the square represent the number itself. Some other automorphic numbers are 5, 6, 376, etc.
public class AutomorphicNumber {


    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n=376;int digit=0;int dig2=0;
        boolean flag=false;

        System.out.println(isAutomorphicNum(n));

        //Program to print all automorphic numbers within range
        int n1=1, n2=10000;
        for(int i=n1;i<n2;i++){
            if(isAutomorphicNum(i))
                System.out.print(i+" ");
        }


    }

    public static int returnSquare(int n){
        return n*n;
    }


    public static boolean isAutomorphicNum(int n){
        boolean flag=false;
        int square=returnSquare(    n);
        while(n!=0){
                      

            if(n%10!=square%10) {
                return false;
            }
            n=n/10; square=square/10;
            flag=true;

        }
        return flag;
    }

}
