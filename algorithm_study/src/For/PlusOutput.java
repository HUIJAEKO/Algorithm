package For;

import java.util.Scanner;

//백준10950
public class PlusOutput {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        for(int i=1; i<=num; i++){
            int a = input.nextInt();
            int b = input.nextInt();
            System.out.println(a+b);
        }

    }
}
