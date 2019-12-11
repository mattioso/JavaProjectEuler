package com.Mattioso;

public class Main {

    public static void main(String[] args) {
	    int sumSquare = 0;
	    int squareSum = 0;

	    int count = 0;

	    while (!(count == 100)) {
	        count++;
	        sumSquare += count * count;
            squareSum += count;
        }
        squareSum *= squareSum;

        System.out.println(squareSum - sumSquare);
    }
}
