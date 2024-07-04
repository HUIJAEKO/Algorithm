package For;

import java.util.Scanner;

//백준2439
public class Star2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        for(int i=1; i<=num; i++){
            for(int j=5-i; j>0; j--){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            if(i!=num){
                System.out.println();
            }

        }

    }
}
