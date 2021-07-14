package StarPatterns;

public class LeftRightStarPattern {

    public static void main(String[] args) {
        int n=6;
        printRightStarPattern(n);
        printLeftStarPattern(n);

    }

    /*
     *
     * *
     * * *
     * * * *
     */
    public static void printRightStarPattern(int n){

        for(int i=0; i<n;i++){

            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }


    }

/*
               *
             * *
           * * *
 */
    public static void printLeftStarPattern(int n){
        for(int i=n-1;i>=0;i--){
            for(int j=0;j<n;j++){
                if(j>=i)
                    System.out.print("* ");
                else
                System.out.print("  ");
            }
            System.out.println();
        }


    }


}
