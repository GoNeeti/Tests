package Numbers;

import java.util.*;

// https://www.hackerrank.com/challenges/java-loops/problem

class Series1{



    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int s=a+b;
            System.out.println(s);
            int exp=1;
            for(int j=1;j<n;j++){
                    exp=2*exp;
                    s=s+(b*exp);
                System.out.println(s);
                }
        }
        in.close();
    }
}


