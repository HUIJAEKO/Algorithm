package If;

import java.util.Scanner;

//백준14681
public class Quadrant {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();

        if(x>0){
            if(y>0){
                System.out.println("1");
            }else{
                System.out.println("4");
            }
        }else{
            if(y>0){
                System.out.println("2");
            }else{
                System.out.println("3");
            }
        }
    }
}
