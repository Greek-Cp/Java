package com.belajar;

import java.util.Scanner;

public class WhileLoopJava {
    public static void main(String[]args){
        System.out.println("While Loop");

        Scanner Input = new Scanner(System.in);
        int n = Input.nextInt();
        int x =0;
        int y= 0;
        while( x <= n){
            System.out.printf("Hello World %d \n", x);
            x++;
        }
    }
}
