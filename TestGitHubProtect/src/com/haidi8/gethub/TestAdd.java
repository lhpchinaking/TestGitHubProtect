package com.haidi8.gethub;

import java.util.Scanner;

public class TestAdd {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("请输入第一个要相加的整数");
        int num1=input.nextInt();
        System.out.println("请输入第二个人要相加的整数" );
        int num2=input.nextInt();
        int getSum=getAdd(num2,num1);
        System.out.println(getSum);
    }

    private static int getAdd(int num2, int num1) {
        return num1+num2;
    }
}
