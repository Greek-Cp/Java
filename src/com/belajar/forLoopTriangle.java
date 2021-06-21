package com.belajar;

import java.util.Scanner;

public class forLoopTriangle {
    static int  convertValueBeetwenXY(int x , int y){
         return x - y;

    }
    static void trianglePatternLeft(int x, int y){
         int p = convertValueBeetwenXY(x,y);
         int j = 0;
         int row = p;
         int ss = 0;
         for( j = 0; j<= row; j++){
             for(ss = 1*(row - ss); ss>=0; ss--){
                 System.out.print(" ");
             }
             for(ss = 0; ss<=j ; ss++){
                 System.out.print("*");
             }
             System.out.println("");
         }
    }
    static void  trianglePatternRight( int x ,int y){
        int p = convertValueBeetwenXY(x,y);
        int row = p;
        for(int s = 0 ; s<= row; s++){
            for (int c = 0 ; c<= s; c++){
                System.out.print("*");
            }
           System.out.println();
        }
    }

    static void trianglePatternSamaKaki(int x , int y){
        int result = convertValueBeetwenXY(x,y);
        int p = 0;
        int i = result;
        int j = 0;
        for(p =0 ; p<= result; p++){
            for(j = 1 * ( i - p); j>= 0; j--){
                System.out.print(" ");
                int valueInsideForLoop = convertValueBeetwenXY(i,j);
            }
            for(j = 0; j<= p; j++){
                System.out.printf("%d ",p );
            }
            System.out.println("");

        }


    }

    public static void main(String[]args){
        System.out.println("PROGRAM TRIANGLE PATTERN");
        Scanner MyInput = new Scanner(System.in);
        int nilai_1 , nilai_2;
        System.out.println("Inputkan Nilai 1");
        nilai_1 = MyInput.nextInt();
        System.out.println("Inputkan Nilai 2");
        nilai_2 = MyInput.nextInt();
        trianglePatternLeft(nilai_1,nilai_2);
        trianglePatternRight(nilai_1,nilai_2);
        trianglePatternSamaKaki(nilai_1,nilai_2);
    }
}
