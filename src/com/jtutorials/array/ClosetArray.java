package com.jtutorials.array;

public class ClosetArray {

    public static void main(String[] args) {
        int[] a = {2, 5, 3, 7, 9, 11, 13};
        System.out.println(closetHaltMaxInt(a));
    }
    public static double closetHaltMaxInt(int[] a) {
        int temp=0;
        for (int i=0;i<a.length;i++) {
            for (int j=i;j<a.length;j++) {
                if(a[i] > a[j]) {
                    //swap
                   temp= a[i];
                   a[i]=a[j];
                   a[j] = temp;
                }
             }
        }
        //get max
        double halfMax=a[a.length-1]/2F;
        double gapmin=0;
        double gapMax=0;
        int minVal=0;
        int maxVal=0;
        for (int g=0;g<a.length;g++) {
            if (halfMax<a[g]) {
                gapMax=a[g]-halfMax;
                gapmin=halfMax-a[g-1];
                minVal=a[g-1];
                maxVal=a[g];
                break;
            }
        }
        if (gapMax>gapmin) {
            return minVal;
        }
        else {
            return maxVal;
        }
    }
}
