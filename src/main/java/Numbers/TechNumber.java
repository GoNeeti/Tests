package Numbers;

public class TechNumber {
/*
A number is called a tech number if the given number has an even number of digits and the number can be divided exactly into two parts
 from the middle. After equally dividing the number, sum up the numbers and find the square of the sum.
 If we get the number itself as square, the given number is a tech number, else, not a tech number. For example, 3025 is a tech number.

 2025 ---> 20 and 25 ==> 20+25=45 -->sq(45) --->2025 (=initial num)
 */
    public static void main(String[] args) {
        int n1=1;
        int n2=1000000;
        //isTechNum(81);
        for(int i=n1;i<n2;i++){
            if(isTechNum(i))
                System.out.println(i);
        }

    }

    public static boolean isTechNum(int n){
        int numOfDigits=0;int temp=n; int leftNum=0; int rightNum=0;int temp2=n;int temp3=n;
        int square=n*n;
        while(n>0){
            n=n/10;
            numOfDigits++;
        }

        if(numOfDigits%2!=0)
            return false;
        String str= Integer.toString(temp);
        leftNum=Integer.parseInt(str.substring(0,numOfDigits/2));
        rightNum=Integer.parseInt(str.substring(numOfDigits/2));


        int sum=leftNum+rightNum;
       if(sum*sum == temp3)
           return  true;
       else return false;

    }
}
