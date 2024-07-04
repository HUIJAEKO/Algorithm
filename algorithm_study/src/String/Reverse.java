package String;

import java.util.Scanner;

//백준2908
public class Reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String a = input.next();
        String b = input.next();

        StringBuilder reverseA = new StringBuilder(a);
        StringBuilder reverseB = new StringBuilder(b);

        String resultA = reverseA.reverse().toString();
        String resultB = reverseB.reverse().toString();

        int A = Integer.parseInt(resultA);
        int B = Integer.parseInt(resultB);

        if(A>B){
            System.out.println(A);
        }else if(B>A){
            System.out.println(B);
        }
    }

}