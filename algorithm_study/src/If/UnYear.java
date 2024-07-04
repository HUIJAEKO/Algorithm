package If;

import java.util.Scanner;

//백준2753
public class UnYear {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();

        if(year%4==0){
            if(year%400==0){
                System.out.println("1");
            }else if(year%100!=0){
                System.out.println("1");
            }else{
                System.out.println("0");
            }
        }else{
            System.out.println("0");
        }
    }
}
