package BruteForce;

import java.util.Scanner;

public class Director {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt(); //input number
        int num = 0; //테스트하는 숫자
        int test = 0; //테스트 횟수(666 존재시 증가)

        while(test<N){
            num++;
            if(testCode(num)){
                test++;
            }
        }
        System.out.println(num);
    }

    static boolean testCode(int num){
        String str = Integer.toString(num);
        int count = 0;

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == '6'){
                count++;
                if(count==3){
                    return true;
                }
            }else{
                count = 0;
            }
        }
        return false;
    }
}

