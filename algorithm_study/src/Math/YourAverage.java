package Math;

import java.util.Scanner;

public class YourAverage {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        String[] name = new String[20];
        double[] num = new double[20];
        String[] score = new String[20];
        double totalnum = 0;
        double totalscore = 0;
        double result;

        for(int i=0; i<20; i++){
            name[i] = input.next();
            num[i] = input.nextDouble();
            score[i] = input.next();
            input.nextLine();
        }

        for(int i=0; i<20; i++){
            if(score[i].equals("P")){
                continue;
            }else{
                totalnum += num[i];
            }
        }

        for(int i=0; i<20; i++){
            if(score[i].equals("A+")){
                totalscore = totalscore + (num[i] * 4.5);
            }else if(score[i].equals("A0")){
                totalscore = totalscore + (num[i] * 4.0);
            }else if(score[i].equals("B+")){
                totalscore = totalscore + (num[i] * 3.5);
            }else if(score[i].equals("B0")){
                totalscore = totalscore + (num[i] * 3.0);
            }else if(score[i].equals("C+")){
                totalscore = totalscore + (num[i] * 2.5);
            }else if(score[i].equals("C0")){
                totalscore = totalscore + (num[i] * 2.0);
            }else if(score[i].equals("D+")){
                totalscore = totalscore + (num[i] * 1.5);
            }else if(score[i].equals("D0")){
                totalscore = totalscore + (num[i]);
            }else if(score[i].equals("F")){
                totalscore = totalscore + (num[i] * 0);
            }else{
                continue;
            }
        }

        result = totalscore / totalnum;
        System.out.printf("%.6f", result);
    }
}
