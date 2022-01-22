package com.xnut.java;

/**
 * @author yhstart
 * @create 2021-06-25 13:56
 */
public class HelloJava {
    public static void main(String[] args) {
        int count=0;
        for (int i = 1; i <=100 ; i++) {
            if(i % 5 !=0){
                System.out.print(i+" ");
                count++;
                if(count % 5 ==0) {
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                }
            }

        }

    }
}
