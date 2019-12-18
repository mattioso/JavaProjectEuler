package com.Mattioso;

public class Main {

    public static void main(String[] args) {

        long num = 600851475143L;
        Tuple test = getPrimeFactor(num);
        long largestFactor = test.value2;
        System.out.println(largestFactor);

        while (!isPrime(test.value1)){
            test = getPrimeFactor(test.value1);
            largestFactor = Math.max(test.value2, largestFactor);
            System.out.println(test.value2);
        }

        largestFactor = Math.max(test.value1, largestFactor);
        System.out.println(test.value1);
        System.out.println("Largest Factor: " + largestFactor);

    }

    public static Tuple getPrimeFactor(long num) {

        Tuple var = new Tuple(-1, -1);
        int count = 1;

        while (!(count == num)) {
            count += 1;
            if (num % count == 0){
                if (isPrime(count)){
                    var.value1 = num / count;
                    var.value2 = count;
                    return var;
                }
            }
        }
        return var;
    }

    public static boolean isPrime(long num) {
        int count = 1;
        while (!(count == (num - 1))) {
            count += 1;
            if (num % count == 0){
                return false;
            }
        }
        return true;
    }
}
