package com.belajar;

import java.util.Locale;

public class StringMethod {
    public static void main(String[]args){
        String example = "lorem ipsum doloream";

        int getLenghtString = example.length();
        System.out.println(getLenghtString); // method length
        System.out.println(example.indexOf("e")); // indexOf
        System.out.println(example.toUpperCase());
        System.out.println(example.toLowerCase());

    }
}
