package StarPatterns;

public class DiamondPattern {

    public static void main(String[] args) {
        int n=6;

        printPattern( n);
    }

    /*
     *     *
     *    * *
     *   * * *
     *    * *
     *     *
     */
    private static void printPattern(int n) {
        //upward triangle
        for(int i=0;i<n;i++){

            for(int j=n-i;j>1;j--){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        //Downward triangle
        //n-2 as nth line is covered in upward triangle and indexing is from 0, so n-2
        for(int i=n-2;i>=0;i--){
            /*
            Printing initial spaces. if i=4 and n was 6 but since n=6 is covered above,
            it is 5 for this, so we need to print 5 stars.hence n-1
             */
            for(int j=n-1;j>i;j--){
                System.out.print(" ");
            }
            for(int j=i;j>=0;j--){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
