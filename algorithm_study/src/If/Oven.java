package If;

import java.util.Scanner;

public class Oven {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int hour = input.nextInt();
        int minute = input.nextInt();
        int time = input. nextInt();

        int addHour = time / 60;
        int addMinute = time % 60;

        if(minute + addMinute < 60){
            minute = minute + addMinute;
        }else{
            if(hour == 23){
                hour = 0;
                minute = addMinute + minute - 60;
            }else{
                hour = hour + 1;
                minute = addMinute + minute - 60;
            }
        }

        if(addHour+hour >= 24){
            hour = addHour + hour - 24;
        }else{
            hour +=addHour;
        }

        System.out.println(hour + " " + minute);
    }
}
