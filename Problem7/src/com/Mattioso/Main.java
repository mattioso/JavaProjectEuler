package com.Mattioso;

public class Main {

    public static void main(String[] args) {

        int numOfPrimes = 0;
        int count = 0;

        while(numOfPrimes != 1002) {
            count += 1;
            if (checkPrime(count)) {
                numOfPrimes += 1;
            }
        }
        System.out.println(count);

    }

    public static boolean checkPrime(int num) {

        int count = 1;

        while (!(count == Math.round((float) num / 2))) {
            count++;
            if(num % count == 0) {
                return false;
            }
        }

        return true;

    }
}
