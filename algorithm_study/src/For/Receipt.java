package For;

import java.util.Scanner;

public class Receipt {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int total = input.nextInt();
        int totalPrice = 0;
        int numOfPro = input.nextInt();

        for(int i=0; i<numOfPro; i++){
            int price = input.nextInt();
            int num = input.nextInt();
            totalPrice += price*num;
        }

        if(totalPrice == total){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
