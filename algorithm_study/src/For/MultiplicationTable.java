package For;

import java.util.Scanner;

//백준2739
public class MultiplicationTable {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        for(int i=1; i<=9; i++){
            System.out.println(num + " * " + i + " = " + num*i);
        }
    }
}
