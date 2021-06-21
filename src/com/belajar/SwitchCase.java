package com.belajar;

import java.util.Scanner;

public class SwitchCase {

    static void trianglePatternLeft(int x ){
        int p = x;
        int j = 0;
        int v = 0;
        for(j = 0; j<= p; j++){
            for(v = p - v; v>= 0; v--){
                System.out.print(" ");
            }
            for(v = 0;v <= j;v++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    static void trianglePatterRight(int x ){
        for(int c = 0 ; c <= x ; c++){
            for(int b = 0; b<=c; b++){
                System.out.print(c);
            }
            System.out.println();
        }
    }

    static void trianglePatternSamaKaki(int x){
        int ps = 0;
        int row = x;
        int j = 0;
        for(ps = 0; ps<= row;ps++){
            for(j = row- ps ; j>=0;j--){
                System.out.print(" ");
            }
            for(j = 0 ; j<=ps; j++){ 
                System.out.printf("%d ",ps);
            }
            System.out.println("");
        }
    }
    static double functionSum(double x, double y){
        return x + y;
    }

    static double functionMultiple(double x, double y){
        return x * y;
    }
    static double functionDivided(double x, double y){
        return x / y;
    }
    static double functionKurang(double x, double y ){
        return x - y;
    }
    static double functionFindHighNumberBeetwen2variablexy(double x, double y){
        return Math.max(x,y); //Nilai Terendah , Nilai maximum
    }
    static double functionFindLowNumberBeetwen2Variablexy(double x, double y){
        return Math.min(x,y);
    }
    static double functionGetRandomNumberBeetwen2VariableXY(double x, double y){
        return (double) (Math.random() * x)-y;
    }
    static double functionModulusNumberBeetwen2VariableXY(double x, double y){
        return x % y;
    }
    static void CheckOddOrEven(int x){
        if( x % 2 == 0){
            System.out.printf("%d = is even",x);
        } else{
            System.out.printf("%d = is odd", x);
        }
    }
    static double convertValueXY(double x , double y){
        /*
               ${x == panjang}
               ${y == lebar}
         */
        return x * y;
    }
    static double SqrtXY(double x){
        return Math.sqrt(x);
    }
    public static void main(String[]args){
        System.out.println("Switch Case");
        System.out.println("Kalkulator Switch Case");
        Scanner KeyboardInputUser = new Scanner(System.in);
        String Long_Text = "  <1> PENJUMLAHAN\n" +
                "                <2> PERKALIAN\n" +
                "                <3> PEMBAGIAN\n" +
                "                <4> MODULUS OPERATOR\n" +
                "                <5> FIND HIGH NUMBER\n" +
                "                <6> FIND LOW NUMBER\n" +
                "                <7> RANDOM NUMBER X -> Y\n" +
                "                <8> TRIANGLE PATTERN LEFT\n" +
                "                <8..9> TRIANGLE PATTERN RIGHT , SAMAKAKI\n" +
                "                <10> SQRT\n" +
                "                <11> PENGURANGAN\n" +
                "                <12> CHECK  EVEN OR EDD";
        System.out.println(Long_Text);
        int opsi = KeyboardInputUser.nextInt();

        switch (opsi){
            //Kalkulator Switch Case
            /*
                <1> PENJUMLAHAN
                <2> PERKALIAN
                <3> PEMBAGIAN
                <4> MODULUS OPERATOR
                <5> FIND HIGH NUMBER
                <6> FIND LOW NUMBER
                <7> RANDOM NUMBER X -> Y
                <8> TRIANGLE PATTERN LEFT
                <8..9> TRIANGLE PATTERN RIGHT , SAMAKAKI
                <10> SQRT
                <11> PENGURANGAN
                <12> CHECK  EVEN OR EDD
             */


            case 1:{
                int nilai_1 ,nilai_2;
                System.out.print("input nilai_1: ");
                nilai_1 = KeyboardInputUser.nextInt();
                System.out.println();
                System.out.print("input nilai_2");
                nilai_2 = KeyboardInputUser.nextInt();
                System.out.print(functionSum(nilai_1,nilai_2));
                break;

            } case 2:{
                int nilai_1 ,nilai_2;
                System.out.print("input nilai_1: ");
                nilai_1 = KeyboardInputUser.nextInt();
                System.out.println();
                System.out.print("input nilai_2");
                nilai_2 = KeyboardInputUser.nextInt();
                System.out.println(functionMultiple(nilai_1,nilai_2));
                break;
            } case 3:{
                int nilai_1 ,nilai_2;
                System.out.print("input nilai_1: ");
                nilai_1 = KeyboardInputUser.nextInt();
                System.out.println();
                System.out.print("input nilai_2");
                nilai_2 = KeyboardInputUser.nextInt();

                System.out.println( functionDivided(nilai_1,nilai_2));
                break;
            } case 4:{
                int nilai_1 ,nilai_2;
                System.out.print("input nilai_1: ");
                nilai_1 = KeyboardInputUser.nextInt();
                System.out.println();
                System.out.print("input nilai_2");
                nilai_2 = KeyboardInputUser.nextInt();

                System.out.println(  functionModulusNumberBeetwen2VariableXY(nilai_1,nilai_2));
                break;
            } case 5:{
                int nilai_1 ,nilai_2;
                System.out.print("input nilai_1: ");
                nilai_1 = KeyboardInputUser.nextInt();
                System.out.println();
                System.out.print("input nilai_2");
                nilai_2 = KeyboardInputUser.nextInt();

                System.out.println( functionFindHighNumberBeetwen2variablexy(nilai_1,nilai_2));
                break;
            } case 6:{
                int nilai_1 ,nilai_2;
                System.out.print("input nilai_1: ");
                nilai_1 = KeyboardInputUser.nextInt();
                System.out.println();
                System.out.print("input nilai_2");
                nilai_2 = KeyboardInputUser.nextInt();

                System.out.println(functionFindLowNumberBeetwen2Variablexy(nilai_1,nilai_2));
                break;
            } case 7:{
                int nilai_1 ,nilai_2;
                System.out.print("input nilai_1: ");
                nilai_1 = KeyboardInputUser.nextInt();
                System.out.println();
                System.out.print("input nilai_2");
                nilai_2 = KeyboardInputUser.nextInt();
                System.out.println(
                        functionGetRandomNumberBeetwen2VariableXY((double) nilai_1,(double) nilai_2));
                break;
            } case 8:{
                int nilai_1 ,nilai_2;
                System.out.print("input nilai_1: ");
                nilai_1 = KeyboardInputUser.nextInt();
                System.out.println();
                System.out.print("input nilai_2");
                nilai_2 = KeyboardInputUser.nextInt();
                double GetValue = convertValueXY(nilai_1,nilai_2);

                trianglePatternLeft((int) GetValue);
                break;
            } case 9:{
                int nilai_1 ,nilai_2;
                System.out.print("input nilai_1: ");
                nilai_1 = KeyboardInputUser.nextInt();
                System.out.println();
                System.out.print("input nilai_2");
                nilai_2 = KeyboardInputUser.nextInt();
                double GetValue = convertValueXY(nilai_1,nilai_2);
                trianglePatterRight((int) GetValue);
                break;
            } case 10:{
                int nilai_1 ,nilai_2;
                System.out.print("input nilai_1: ");
                nilai_1 = KeyboardInputUser.nextInt();
                System.out.println();
                System.out.print("input nilai_2");
                nilai_2 = KeyboardInputUser.nextInt();
                double GetValue = convertValueXY(nilai_1,nilai_2);
                trianglePatternSamaKaki((int) GetValue);
                break;
            } case 11:{
                int nilai_1 ,nilai_2;
                System.out.print("input nilai_1: ");
                nilai_1 = KeyboardInputUser.nextInt();
                System.out.println();
                System.out.print("input nilai_2");
                nilai_2 = KeyboardInputUser.nextInt();
                double GetValue = convertValueXY(nilai_1,nilai_2);

                System.out.println(SqrtXY(GetValue));
                break;
            } case 12:{
                int nilai_1 ,nilai_2;
                System.out.print("input nilai_1: ");
                nilai_1 = KeyboardInputUser.nextInt();
                System.out.println();
                System.out.print("input nilai_2");
                nilai_2 = KeyboardInputUser.nextInt();

                System.out.println( functionKurang((double) nilai_1 , (double) nilai_2));
                break;
            } case 13:{
                int nilai_1 ,nilai_2;
                System.out.print("input nilai_1: ");
                nilai_1 = KeyboardInputUser.nextInt();
                System.out.println();
                System.out.print("input nilai_2");
                nilai_2 = KeyboardInputUser.nextInt();
                double getValue = convertValueXY(nilai_1,nilai_2);

                CheckOddOrEven((int) getValue);
                break;

            } default:{
                System.out.println("your case wrong");
                break;
            }
        }

    }
}
