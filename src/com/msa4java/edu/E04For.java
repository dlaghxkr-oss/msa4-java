package com.msa4java.edu;

public class E04For {
    public static void main(String[] args) {
        for (int i = 2; i <= 12; i++) {
            System.out.println(i + "단");
            for(int b= 1; b<= 12; b++) {
                System.out.println(i +" X " + b + " = " + (i * b));
            }
        }
        int dan = 2;

        for(int i = dan; i <= 9; i++) {
            String strDan = String.format("** %d단 **", i);
            System.out.println(strDan);
            for(int z = 1; z <= 9; z++) {
                String strMulti = String.format("%d X %d = %d", i, z, i*z);
                System.out.println(strMulti);
            }
        }

    }
}
