package For;

import java.util.Scanner;

//백준2438
public class Star1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        for(int i=1; i<=num; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
