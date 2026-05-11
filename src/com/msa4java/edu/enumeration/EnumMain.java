package com.msa4java.edu.enumeration;

public class EnumMain {
    public static void main(String[] args) {
        Week day = Week.MONDAY;
        System.out.println(day); //toString() 메소드가 자동으로 실행
        System.out.println(day.name());
        System.out.println(day.getKrDay());
    }
}
