package com.belajar;

import com.belajar.oop.MathClass;

import java.util.Scanner;

public class MathJava {
    static int findHighValue(int x, int y){
        return Math.max(x,y);
    }
    static int findLowValue(int x, int y){
        return Math.min(x,x);
    }
    static int akarSqrt(int x){
        return (int) Math.sqrt(x);
    }
    static int getRandomNumber(int x){
        return (int) (Math.random() * x); //0
    }
    static void TrianglePattern(int x ){
        for(int c = 0; c<=x; c++){
            for(int b = 0; b<=c; b++){
                System.out.print(b);
            }
            System.out.println("");
        }
    }
    static void triangleIsocalesPattern(int x){
        int row = x;
        int i,j;
        for( j = 0; j<= row;j++){
            for(i = (row - j); i>=0; i--){
                System.out.print(" ");
            }
            for(i = 0; i<=j; i++){
                System.out.printf("%d ",i);
            }
            System.out.println("");
        }
    }
    static void TrianglePatternLeft(int x ){
        int row = x;
        int j ,m;
        for(j = 0; j<= row; j++){
            for(m = 1*(row - j); m>=0; m--){
                System.out.print(" ");
            }
            for(m =0; m<= j; m++){
                System.out.printf("%d",m);
            }
            System.out.println("");
        }

 //break mau buat kopi dulu :"v
        //biar semangat ngoding nya:v
        //wait oke
//        for(int d = 0 ; c)
    }
    public static void main(String[]args){
        System.out.println("METHOD MATH JAVA");
        /*
         sqrt()
         max
         min
         random
         */
        Scanner GetUserInput = new Scanner(System.in);

            int val_1 , val_2;
            System.out.println("Input X Number = ");
            val_1 = GetUserInput.nextInt();
            System.out.println("Input Y Number = ");
            val_2 = GetUserInput.nextInt();
            System.out.println("Nilai Tertinggi = " + findHighValue(val_1,val_2));
            System.out.println("Nilai Terendah = " + findLowValue(val_1,val_2));
            System.out.println("Nilai Akar = " + akarSqrt(val_1));
            System.out.println("Nilai Acak =" + getRandomNumber(val_1));
            int getRandomNumber = (int) (Math.random() * 50);
            System.out.println("Nilai Acak = " + getRandomNumber);
            int max_value , low_value;
            max_value = 30;
            low_value = 10;

            int resCalculate = (max_value-low_value) -1; // max
            for(int i = 0 ; i<= resCalculate  ; i++){
                    int getRand = (int) (Math.random() * resCalculate); // random

                    System.out.printf("Value => %d \n" ,getRand);
                    System.out.println("Value High = %d" +findHighValue(getRand,resCalculate) );
                    System.out.printf("value Low = %d", findLowValue(getRand,resCalculate));
                    TrianglePattern(getRand);
                    System.out.println("Triangle Pattern Left");
                    TrianglePatternLeft(getRand);
                triangleIsocalesPattern(getRand);
            }
        MathClass objTriangle = new MathClass();
            //parameter 3 =choose
            objTriangle.LiniearCalculate(20.2,3.3,1,"Triangle-Right");


    }


}
