package com.Mattioso;

public class Main {

    public static void main(String[] args) {

        int num1 = 2;
        int num2 = 1;
        int sum = 2;

        while(num1 < 4000000){

            int temp = num1;
            num1 += num2;
            num2 = temp;

            if (num1 % 2 == 0){
                sum += num1;
            }

            System.out.println("Num1 " + num1 + " Num2 " + num2 + " Temp " + temp);
        }

        System.out.println(sum);

    }
}
