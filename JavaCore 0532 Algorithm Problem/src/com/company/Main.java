package com.company;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Scanner;

/*

0532  Задача по алгоритмам

Написать программу, которая:
1. вводит с консоли число N, которое должно быть больше 0
2. потом вводит N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.

Требования:
1. Программа должна считывать числа с клавиатуры.
2. В классе должен быть метод public static void main.
3. Нельзя добавлять новые методы в класс Solution.
4. Программа должна выводить на экран максимальное из введенных N чисел.

*/

// public class Solution
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); // введення даних із клавіатури
        int n = Integer.parseInt(reader.readLine()); // введення числа n
        int a = 0; // оголошення змінної a, присвоєння їй значення 0
        for (int i = 0; i != n ; i++) { // включити счотчик
            int m = Integer.parseInt(reader.readLine()); // внесення із клавіатури числа m
            if (i == 1) // якщо по счотчику є значення 1, тоді a присвоїти значення m
                a = m;
            a = Math.max(a, m); // математична функція
        }
        int maximum = a;
        System.out.println(maximum);
    }
}







