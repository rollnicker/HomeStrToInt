package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите числовую строку: ");
        String S = scan.nextLine();
        int X = Integer.parseInt(S);
        double Y = X;
        System.out.println(S);
        System.out.println(X);
        System.out.println(Y);
    }
}