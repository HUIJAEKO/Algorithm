package If;

import java.util.Scanner;

//백준2884
public class Alarm {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int hour = input.nextInt();
        int minute = input.nextInt();

        if(minute>=45){
            minute = minute - 45;
        }else{
            if(hour == 0){
                hour = 23;
                minute = 60 - (45-minute);
            }else{
                hour = hour - 1;
                minute = 60 - (45-minute);
            }
        }
        System.out.println(hour + " " + minute);
    }
}
