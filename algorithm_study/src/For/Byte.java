package For;

import java.util.Scanner;

//백준25314
public class Byte {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int numOfLong = num / 4;

        for(int i=1; i<=numOfLong; i++){
            System.out.print("long ");
        }
        System.out.print("int");

    }
}
