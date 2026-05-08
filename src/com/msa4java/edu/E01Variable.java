package com.msa4java.edu;

public class E01Variable {
    public static void main(String[] args) {
        // 변수 선언
        int age;
        age = 1;
        String name = "홍길동";
        char ch = 'a';

        // 상수
        final String USER_NAME;
        USER_NAME = "둘리";

        // underscore 표기법
//        int num2 = 200_000_000;

        int swap1 = 1;
        int swap2 = 2;
        int tmp;

        tmp = swap2;
        swap2 = swap1;
        swap1 = tmp;

        // 데이터 타입
        boolean boo = true;
        byte bt = -128;
        short st = 32767;
        int integer = 2147483647;
        long longer = 1L;

        double db = 3.141592;
        float ft = 3.141592f;

        char ch2 = 'a';

        // 스트링의 비교
//        String str1 = "홍길동";
//        String str2 = "홍길동";
//        System.out.println(str1.equals(str2));
//
//        int age5 = 20;
//
//        System.out.printf("나이는 %d살입니다.%n", age5);
//
//        boolean isLogin = true;
//        System.out.printf("로그인 여부 : %b%n", isLogin);
//
//        int num = 10;
//        System.out.printf("숫자 : %d살%n", num);
//
//        double height = 175.5;
//        System.out.printf("키: %.1f%n", height);
//
//        char grade = 'A';
//        System.out.printf("등급: %c%n", grade);
//
//        String name3 = "홍길동";
//        System.out.printf("이름: %s%n",name3);
//
//        String name1 = "조은혜";
//        int age1 = 255;
//        double weight = 742.5;
//        char grade = 'S';
//        boolean pass = false;
//
//        System.out.printf("이름 : %s%n",name1);
//        System.out.printf("나이 : %d%n",age1);
//        System.out.printf("몸무게 : %f%n",weight);
//        System.out.printf("성적 : %c%n",grade);
//        System.out.printf("SQLD 합격여부 : %b%n",pass);
//
//        int number1 = 10;
//        int number2 = 5;
//
//        int sum = number1 + number2;
//        System.out.println(sum);
//
//        int minus = number1 - number2;
//        System.out.println(minus);
//
//        int multiply = number1 * number2;
//        System.out.println(multiply);
//
//        int divide = number1 / number2;
//        System.out.println(divide);
//
//        int mod = number1 % number2;
//        System.out.println(mod);

//        int num = 0;
//
//        System.out.println(num++);
//        System.out.println(num);
//
//        num = 0;
//        System.out.println(num--);
//        System.out.println(num);
//
//        num = 0;
//        System.out.println(++num);
//        System.out.println(num);
//
//        num = 0;
//        System.out.println(--num);
//        System.out.println(num);

//        int num1 = 1;
//        int num2 = 2;
//
//        System.out.println(num1 > num2);
//        System.out.println(num1 < num2);
//        System.out.println(num1 >= num2);
//        System.out.println(num1 <= num2);
//
//          String str = "JAVA";
//          System.out.println(str.equals("JAVA"));
//          System.out.println(str.equals("JAV"));
        // 문자열 비교는 비교연산자가 아닌 String Class의 equals()메소드를 사용

//        int num1 = 1;
//        int num2 = 5;
//        System.out.println(num1 == 1 && num2 ==2);
//        System.out.println(num1 == 1 && num2 ==1);

//        System.out.println(num1 == 1 || num2 ==2);
//        System.out.println(num1 == 1 || num2 ==1);
//        System.out.println(num1 == 2 || num2 ==1);
//        System.out.println(!(num1 ==1));
//        System.out.println(!(num1 ==2));

//        int result = num1 > num2 ? num1 : num2;
//        System.out.println(result);

//        int height = -155;
//        boolean pass = false;
//        if(height <0){
//            System.out.println("에러입니다.");
//        }else
//        {
//            if(height >= 150){
//                pass = true;
//            }else{
//                pass = false;
//            }
//            System.out.println("당신의 키는 : " +height + "cm 이므로 탑승여부는 : " + pass + "입니다." );
//        }

//        // 2번
//        for (int i = 1; i < 11; i++) {
//            System.out.println(i);
//        }
//
//        // 3번
//        for (int i = 5; i > 0; i--) {
//            System.out.println(i);
//        }

//        // 4번
//        for (int i = 1; i < 11; i++) {
//            if(i % 2 == 0) {
//                System.out.println(i);
//            }
//        }
//
//        // 5번
//        for (int i = 1; i < 11; i++) {
//            if(i % 2 == 1) {
//                System.out.println(i);
//            }
//        }

        // 6번
//        int sum = 0;
//        for (int i = 1; i < 6; i++) {
//            sum += i;
//        }             System.out.println(sum);

        // 7번
//        int sum = 0;
//        for(int i = 0; i < 11; i++) {
//            sum += i;
//        }
//        System.out.println(sum);

        // 8번
//        int count = 0;
//        for(int i = 1; i <= 20; i++) {
//            if (i % 2 == 0) {
//                count++;
//            }
//        }
//        System.out.println("짝수의 개수: " + count);

        // 13번
//        int count = 0;
//
//        for(int i = 1; i <= 20; i++) {
//            if(i % 2 == 1) {
//                count++;
//            }
//        } System.out.println("홀수의 개수 :" + count);

        // 14번 문제

//        for (int i = 1; i <= 30; i++) {
//            if(i % 3 == 0 && i % 2 == 0) {
//                System.out.println(i);
//            }
//        }
//
//        // 15번 문제
//
//        int sum = 0;
//
//        for(int i = 1; i <= 30; i++) {
//            if (i % 3 == 0 && i % 2 == 0) {
//                sum += i;
//            }
//        } System.out.println(sum);
//
//        // 16번 문제
//
//        String star = "*****";
//
//        for(int i =5; i >= 1; i--) {
//            System.out.println(star);
//            star = star.substring(0,star.length() -1);
//        }

        for(int i = 5; i >= 1; i--) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }





    }
}
