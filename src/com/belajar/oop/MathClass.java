package com.belajar.oop;

import java.util.Scanner;

public class MathClass {
    int x = 0;
    int y = 0;
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


    double sumFunction(double x , double y){
        return x +y;
    }
    double multipleFunctioN(double x ,double y){
        return x * y;
    }
    double calculateSum(double x,  double y){
        return (double) x + (double) y;
    }
    public double calculateSubstraction(double x ,double y){
        return x - y;
    }
    public double calculateDivided(double x,double y){
        return x / y;
    }
    static double getResultCalculate(double result){
        return result;
    }
    static double convertXYFindHeight(double x, double y){
        return Math.max(x,y);
    }
    static double convertXYFindLow(double x , double y){
        return Math.min(x ,y);
    }
    static double getValueFrom2Variable(double x ,double y){
        return 1 * ( x * y);
    }

    //create function triangle right
    static void trianglePatternRight(double x){
        double d ,y , k = x;
        // hmm
        for(d = 0; d <=k; d++){
            for(y = 0; y<=d; y++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void triangleSamaKaki(double x ) {

        double ss = x;
        double p = 0;
        double i = 0;
        for (p = 0; p <= ss; p++) {
            for (i = ss - p; ss >= 0; i--) {
                System.out.print("");
            }
            for (i = 0; i <= p; i++) {
                System.out.print(i + " ");
            }
            System.out.println("");
        }
    }
    public void LiniearCalculate(double x, double y,int ch,String operatorMath){
        System.out.println("Choose Pattern Linier");
        /*
          1. f(x) = nX (nOperator) nY ..
         */
        Scanner KeyboardUser = new Scanner(System.in);
        int choose = ch;
        double getNumber =(double) x;
        double getNumber_2 =(double) y;
        if(choose == 1){
            System.out.println("Input Operation Pattern Linier");
            switch (operatorMath){
                case "+":

                    double result = getNumber + getNumber_2;
                    System.out.println("result sum = " + result);
                    break;
                case "*":
                    double resultMult = getNumber * getNumber_2;
                    System.out.println("result multiple = " + resultMult);
                    break;
                case "-":
                    double resultSubstraction = getNumber - getNumber_2;
                    System.out.println("result substraction" + getResultCalculate(resultSubstraction));
                    break;
                case "/":
                    double resultDivided = getNumber / getNumber_2;
                    System.out.println("result divided = " + getResultCalculate((resultDivided)));
                    break;
                    //exponen math
                case "Exponen":
                    double getResult = Math.pow(getNumber,getNumber_2);
                    break;
                case "%":
                    double getResultMod = getNumber % getNumber_2;
                    System.out.println("result mod = " + getResultCalculate(getResultMod));
                case "triangle pow":
                    double getCalculatePow = Math.pow(getNumber,getNumber_2);
                    int p = (int) getCalculatePow;
                    int j = 0;
                    int k = 0;
                    for(k = 0; k<=p ; k++){
                        for(j = p - k; j>=0 ; j--){
                            System.out.print(" "); // left space
                        }
                        for(j = 0; j<=k; j++){
                            System.out.print(j); // we change to number j
                        }
                        System.out.println();
                    }//end for loop
                    break;

                case "5":
                    System.out.println("Find Height Value " +
                            convertXYFindHeight(getNumber,getNumber_2));
                    break;
                case "6":
                    System.out.println("Find Low Value " + convertXYFindLow(getNumber,getNumber_2));
                    break;
                case "Triangle-Right":
                    System.out.println("Create Triangle From XY");

                    double pGet =getNumber + getNumber_2;
                    trianglePatternRight(pGet);
                    break;
                case "Triangle-Samakaki":
                    System.out.println("Create Triangle From XY");

            }
        }
    }
    double calculateAreaSurfaceTriangle(double x , double y){
        return 1/2 * x * y;
    }

    public void trianglePatterRight(int x ){
        for(int c = 0 ; c <= x ; c++){
            for(int b = 0; b<=c; b++){
                System.out.print(c);
            }
            System.out.println();
        }
    }

        /*  String Long_Text = "  <1> PENJUMLAHAN\n" +
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
                     */

}
