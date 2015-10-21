package com.javarush.test.level05.lesson12.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Date;



/* Задача по алгоритмам
Написать программу, которая:
1. вводит с консоли число N > 0
2. потом вводит N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = Integer.MIN_VALUE;

        int colvo = Integer.parseInt(reader.readLine());
        for (int i = 0; i < colvo ; i++) {
            int num = Integer.parseInt(reader.readLine());
            if (num > maximum) {
                maximum = num;
            }

        }
        System.out.println(maximum);
        Man man1 = new Man("Vasya");

    }
    private static class Man{
        String name;
        public Man(String name){
            this.name = name;
        }
        @Override
        public String toString(){
            return name;
        }
    }
}