package com.Mattioso;

public class Main {

    public static void main(String[] args) {

        boolean isDivisible = false;
        int num = 1;

        while(!divisible(num, 20)){
            num++;
        }
        System.out.println(num);
    }

    public static boolean divisible(int num, int highestCount) {

        int count = 1;
        while(!(count == highestCount)) {
            count++;
            if(!(num % count == 0)){
                return false;
            }
        }
        return true;

    }
}