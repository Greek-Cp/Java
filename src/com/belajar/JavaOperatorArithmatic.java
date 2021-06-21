package com.belajar;

import java.util.Scanner;

public class JavaOperatorArithmatic {
    static double FungsiPenjumlahan(double x , double y){
        return x + y; // sum
    }
    static double FungsiPerkalian(double x , double y){
        return x * y; //multiple
    }
    static double FungsiPembagian(double x, double y){
        return x / y; // divided
    }

    static double FungsiPengurangan(double x , double y){
        return x - y; // subtracion
    }
    static double FungsiModulus(double x , double y ){
        return x % y;
    }
    static double FungsiGanjilgenap(double x){
        double two = 2;
        if(x % 2 == 0){
            //is even;
            System.out.printf("x = %d is Even" , x);
        } else {
            System.out.printf("x = %d is Odd" , x);
        }
        return x;
    }
    public static void main(String[]args){
        System.out.println("hello world");
        int opsi;
        double x , y ,hasil;
        System.out.println("PROGRAM KALKULATOR");
        Scanner GetInputFromUser = new Scanner(System.in);
        String perkalian, penjumlahan , pembagian , modulus , pengurangan ,cekGanjilGenap;
        perkalian = "1.Perkalian";
        penjumlahan = "2.Penjumlahan";
        pembagian = "3.Pembagian";
        modulus = "4.Modulus Operator Aritmatika";
        pengurangan = "5.Pengurangan";
        cekGanjilGenap = "6.Cek Ganjil Genap";
        System.out.println(perkalian);
        System.out.println(penjumlahan);
        System.out.println(pembagian);
        System.out.println(modulus);
        System.out.println(pengurangan);
        System.out.println(cekGanjilGenap);
        opsi = GetInputFromUser.nextInt();
        System.out.println("Input X Number: ");
        x = GetInputFromUser.nextInt();
        System.out.println("Input Y Number: ");
        y = GetInputFromUser.nextInt();

        if(opsi == 1){
            System.out.println(FungsiPerkalian(x,y));
        } else if (opsi == 2){
            System.out.println(FungsiPenjumlahan(x,y));

        }else if(opsi == 3){
            System.out.println(FungsiPembagian(x,y));
        } else if(opsi == 4){
            System.out.println(FungsiModulus(x,y));
        } else if(opsi == 5){
            System.out.println(FungsiPengurangan(x,y));
        } else if(opsi == 6){
            System.out.println(FungsiGanjilgenap(x));
        }
    }
}
