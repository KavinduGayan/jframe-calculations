package com.jtutorials.array;

public class Balance {

    public static void main(String[] args) {
        int[] ints= {2, 1, 1, 1, 4};
        System.out.println(canBalance(ints));
    }

    public static boolean canBalance(int[] nums) {
        double midSum=0;
        double tempSum=0;
        boolean is=false;
        for(int i=0;i<nums.length;i++) {
            midSum=midSum+nums[i];
        }
        midSum=midSum/2;
        System.out.println("mid sum "+midSum);
        for(int j=0;j<nums.length;j++) {
            tempSum=tempSum+nums[j];
            System.out.println(tempSum);
            if(tempSum == midSum){
                is=true;
                break;
            }
        }
        return is;
    }

}
