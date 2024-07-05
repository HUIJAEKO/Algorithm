package Math;

import java.util.Scanner;

public class LeastCommonMultiple {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();

        for(int i = 0; i < T; i++){
            int A = input.nextInt();
            int B = input.nextInt();

            int lcm = lcm(A, B);
            System.out.println(lcm);
        }
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int lcm(int a, int b) {
        return a * (b / gcd(a, b));
    }
}
