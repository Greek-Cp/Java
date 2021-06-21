package com.belajar;

public class JavaBoolean {

    static void Jawaban(){
        System.out.println("Java Tidak Sulit Kawan");
    }
    static void TrianglePatternSamaKaki(){
        int p , j , row;
        row = 10;
        for(p = 0; p <= row; p++){
            for(j = row-p; j>=0 ; j--){
                System.out.print(" ");
            }
            for(j = 0; j<=p ; j++){
                System.out.printf("%d ",p);
            }
            System.out.println("");
        }
    }
    static void JawabanMotivasi(){
        System.out.println("Ayo Kawan Belajar Java Karena Java Itu");
        System.out.print("Asik , Jadi Ayo Belajar , kalo nemu kesulitan di selesaikan permasalahanya oke");
        System.out.println(":Semangat Ngoding 24 jam !") ;
        TrianglePatternSamaKaki();

    }

    public static void main(String[]args){
        //BOOLEAN
        System.out.println("BOOLEAN JAVA");
        boolean Sulit = true;
        String JavaAsk = "Apakah Java Sulit? ";
        if(Sulit == false){
            Jawaban();
        } else{ //true
            JawabanMotivasi();

        }

    }
}
