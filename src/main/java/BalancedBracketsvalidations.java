import java.util.*;
import java.util.Scanner;

// Write your code here. DO NOT use an access modifier in your class declaration.
class Parser{
    boolean isBalanced(String s)
    {
        char[] arr=s.toCharArray();
        ArrayList<Character> arrayList=new ArrayList<>();
        for(int i=0; i<arr.length;i++ ) {
            if (arr[i] == '{')
                arrayList.add('}');

            else if (arr[i] == '(')
                arrayList.add(')');

            else if (arr[i] == '}' || arr[i] == ')') {
                if (arrayList.isEmpty()) return false;
                if (arrayList.get(arrayList.size() - 1) == arr[i])
                    arrayList.remove(arrayList.size() - 1);
                else return false;

            }}

            return true;


}}
class Solution {

    public static void main(String[] args) {
        Parser parser = new Parser();

        Scanner in = new Scanner(System.in);

        while (in.hasNext()) {
            System.out.println(parser.isBalanced(in.next()));
        }

        in.close();
    }
}
