package StarPatterns;

public class PyramidPattern {

    public static void main(String[] args) {
        int n=6;

        printPyramidPattern( n);
    }

    /**
     *        *
     *       * *
     *      * * *
     *     * * * *
      */

    public static void printPyramidPattern(int n){

        for(int i=0; i<n;i++){

            // To print initial spaces
            for(int j=n-i;j>1;j--){
                System.out.print(" ");
                // Loop is till 1 because start will be printed along with space "* ", so 2 chars are covered here.

            }
            //to print stars
                for(int j=0;j<=i;j++){
                    System.out.print("* ");
                }

            System.out.println();
        }




    }
}
