import java.util.Scanner;

class TowerOfHanoi {
    static int getMoves(int n) {

       if (n==1)
           return 1;
            return 2 * getMoves(n - 1) +1;

    }


    public static void main(String[] argh) {
        int n = 6;
        System.out.println(getMoves(n));

    }

}