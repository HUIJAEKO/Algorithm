package Operation;

import java.util.Scanner;

public class MultiplyUse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        input.nextLine();
        int b = input.nextInt();

        int b1 = b/100;
        int b2 = b/10%10;
        int b3 = b%10;

        int c = a*b3;
        int d = a*b2;
        int e = a*b1;
        int f = c+(d*10)+(e*100);

        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
    }
}
