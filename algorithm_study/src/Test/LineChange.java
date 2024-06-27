package Test;

import java.util.Scanner;

public class LineChange {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();

        for(int i=1; i<=a; i++){
            System.out.print("*");
            if(i%b == 0){
                System.out.println();
            }
        }
    }
}
