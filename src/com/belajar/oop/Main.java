package com.belajar.oop;

public class Main {
    public int getRand(int p){
        return (int) (Math.random() * p);
    }
    static void calculateTrianglePatternLeft(int y){
        int j = 0;
        int p = 0;
        int row = y;
        for(j = 0; j<=row; j++){
            for(p = row-j;p>=0;p--){
                System.out.print(" ");
            }
            for(p = 0; p <= j; p++){
                System.out.print(p);
            }
            System.out.println();
        }
    }
    public static void main(String[]args) {
        MathClass MyMath = new MathClass();
        MyMath.trianglePatterRight(5); // dari modifier static dirubah ke public
        calculateTrianglePatternLeft(5);

        Bicycle myBicycle = new Bicycle(3,30,4,400,4);
        Bicycle myBicylce_2 = new Bicycle(2,3,4,400,4);
        System.out.println(myBicycle.getID());
        System.out.println(myBicylce_2.getID());
        System.out.println("velocity (m/s) = " + myBicycle.getVelocity());
        System.out.println(myBicylce_2.getGear());
    }
}
