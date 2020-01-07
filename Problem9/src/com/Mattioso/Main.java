package com.Mattioso;

public class Main {

    public static void main(String[] args) {

        int[] nums;
        nums = new int[3];
        nums[0] = 1;
        nums[1] = 1;
        nums[2] = 1;

        while(true){

            if (nums[0] + nums[1] + nums[2] == 1000) {
                if(nums[0]*nums[0] + nums[1]*nums[1] == nums[2] * nums[2]) {
                    System.out.println(nums[0] * nums[1] * nums[2]);
                    System.out.println(nums[0]);
                    System.out.println(nums[1]);
                    System.out.println(nums[2]);
                    break;
                }
            }

            nums[2]++;
            if (nums[2] == 1000) {
                nums[2] = 0;
                nums[1]++;
                if (nums[1] == 1000) {
                    nums[1] = 0;
                    nums[0] ++;
                }
            }


        }

    }
}
