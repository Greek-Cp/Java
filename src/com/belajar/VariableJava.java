package com.belajar;

import java.util.Scanner;

public class VariableJava {
    public static void main(String[]args){
        String text;
        text = "Hello World";
        String firstName , lastName;
        firstName = "Alice";
        lastName = "X";
        Scanner Keyboard = new Scanner(System.in);

        String Tanya;
        Tanya = Keyboard.nextLine();
        if(Tanya == "Hallo ALice"){
            System.out.println("Hai Denis");
        } else if(Tanya == "Hei") {
            System.out.println("iya?");
        }
        String example;
        example = "test";
        if(example == "test"){
            System.out.println("test");
        } else{
            System.out.println("not work");
        }
    }
}
