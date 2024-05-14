package String;

import java.util.Scanner;

public class RepeatWords {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        for(int i=0; i<num; i++){
            int repeat = input.nextInt();
            String s = input.next();
            String[] string = s.split("");
            for(int j=0; j<string.length; j++){
                for(int k=0; k<repeat; k++){
                    System.out.print(string[j]);
                }
            }
            System.out.println();
        }
    }
}
