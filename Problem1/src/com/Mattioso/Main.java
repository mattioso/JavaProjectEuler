package com.Mattioso;

public class Main {

    public static void main(String[] args) {
        int total = 1;
        int num = 0;

        while(!(num == 1000)){
            num += 1;
            if ((num % 3 == 0) || (num % 5 == 0)){
                total += num;
            }
        }
        System.out.println("Your total is: " + total);
    }
}

