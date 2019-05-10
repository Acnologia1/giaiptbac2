package com.company;

import java.util.Scanner;

public class GiaiPTBac2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập a:");
        int a = scanner.nextInt();
        System.out.println("Nhập b:");
        int b = scanner.nextInt();
        System.out.println("Nhập c:");
        int c = scanner.nextInt();
        if (a == 0) {
            //Áp dụng giải pt bậc 1
            /*
            if (b != 0) {
                double solution = -c / b;
                System.out.printf("The solution is: %f!", solution);
            } else {
                if (c == 0) {
                    System.out.print("The solution is all x!");
                } else {
                    System.out.print("No solution!");
                }
            }*/
        } else {
         float delta = b*b-4*a*c;
         if(delta >0){
             System.out.println("Phương trình có 2 nghiệm phân biệt");
         }
        }
    }
}
