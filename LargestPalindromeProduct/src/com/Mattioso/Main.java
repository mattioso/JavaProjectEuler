package com.Mattioso;

public class Main {

    public static void main(String[] args) {

        int x = 0;
        int y = 0;
        int largestPalindrome = 0;
        int largestX = 0;
        int largestY = 0;

        while(!(x == 1000)){
            x++;
            y = 0;
            while(!(y == 1000)){
                y++;
                if (isPalandrome(x*y) && (x*y > largestPalindrome)){
                    largestPalindrome = x*y;
                    largestX = x;
                    largestY = y;
                }
            }
        }
        System.out.println("Largest Palindrome: " + largestPalindrome + " Largest X: " + largestX + " Largest Y: " + largestY);
    }

    public static boolean isPalandrome(int num) {

        String stringNum = Integer.toString(num);
        return stringNum.equals(invertString(stringNum));

    }

    public static String invertString(String str) {

        char[] chars = str.toCharArray();
        char[] toReturn = new char[chars.length];
        int count = chars.length;
        int count2 = 0;

        while(!(count == 0)){
            count--;
            toReturn[count2] = chars[count];
            count2++;
        }

        return String.copyValueOf(toReturn);

    }

}
