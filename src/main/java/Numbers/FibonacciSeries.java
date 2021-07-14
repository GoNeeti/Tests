package Numbers;

public class FibonacciSeries {

    static int n1=0, n2=1, n3=1;
    public static void main(String args[]){

        int n=6;
        if(n==2)
            System.out.print(n1 +" "+n2);
        if(n==1)
            System.out.print(n1);
        System.out.print(n1 +" "+n2);
        fibonacciSeriesUsingRecursion(n-2);

        //fibSeriesUsingLoops(n);

    }

    //Using recursion
    public static int fibonacciSeriesUsingRecursion(int n){
        if(n<1)
            return 0;
        n3=n1+n2;
        n1=n2;
        n2=n3;
        System.out.print( " "+n3);
        return fibonacciSeriesUsingRecursion(n-1);
    }

    //Without recursion
    public static void fibSeriesUsingLoops(int n){

        if(n==1) {System.out.println(0); return;}
        int a=0, b=1, c=1;
        System.out.print(a + " "+b);
        for(int i=2;i<n;i++){
            c=a+b;
            System.out.print(" "+c);
            a=b;
            b=c;

        }

    }
}
