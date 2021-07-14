package Numbers;

import java.util.Scanner;

public class PalindromeNumStr {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        String in=s.next();
       // String in=s.next();
        System.out.println(isPalindrome(n));
        System.out.println(isPalindrome(in));
    }

    public static boolean isPalindrome(int n){
        int digit=1;
        int m=0, n1=n;
        while(n>0){
            digit=n%10;
            n=n/10;
            m=m*10+digit;
        }

    System.out.println("Reversed num is "+ m);
        if(m==n1)
            return true;
        return false;


    }

    public static boolean isPalindrome(String s){
        String revStr="";
        for(int i=s.length()-1;i>=0;i--){
            revStr=revStr+s.charAt(i);

        }
        System.out.println("ReversedString is "+revStr);
        if(revStr.equals(s))
            return true;
        return false;
    }

}
