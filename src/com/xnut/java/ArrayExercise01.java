package com.xnut.java;

/**
 * @author yhstart
 * @create 2021-10-01 21:57
 */
public class ArrayExercise01 {
    public static void main(String[] args) {
        int[] arr={4,-1,9,10,23};
        int max=arr[0];
        int maxIndex=0;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]>max){
                max=arr[i];
                maxIndex=i;
            }
        }
        System.out.println("最大值为："+max+",maxIndex="+maxIndex);
    }
}
