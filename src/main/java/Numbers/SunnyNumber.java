package Numbers;

public class SunnyNumber {

    /*
    A number is called a sunny number if the number next to the given number is a perfect square.
    In other words, a number N will be a sunny number if N+1 is a perfect square.
    Given, N=80 then N+1 will be 80+1=81, which is a perfect square of the number 9. Hence 80 is a sunny number.

     */
    public static void main(String[] args) {
        int n1=1, n2=1000;
        for(int i=n1;i<=n2;i++){
            if(getSquareRoot(i+1))
                System.out.print(i +" ");
        }

    }

    public static boolean getSquareRoot(int n){
       double root= Math.sqrt(n);
       // if n = 2, root= 1.41, root%1=0.41....If n=4, root =2.0, root%1=0;
       if(root%1==0)
           return true;
       else return false;

    }

}
