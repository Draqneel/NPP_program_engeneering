package ru.ivmiit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        System.out.println("Recursion value: " + main.recursion(value));
    }


    public int sum(int a, int b) {
        return a + b;
    }

    private void printHello(String name) {
        System.out.println("Hello, " + name);
    }

    int recursion(int value) {
        if (value == 0 || value == 1) {
            return 1;
        }
        return value * recursion(value - 1);
    }
}

