package com.javarush.test.level06.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.
Пример ввода:
3
2
15
6
17
Пример вывода:
2
3
6
15
17
*/

public class Solution {


    public static void main(String[] args) throws Exception
    {
        List<Integer> test = new ArrayList<>();

        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i<5; i++) {
            int num = Integer.parseInt(reader.readLine());
            test.add(num);
        }

        Collections.sort(test);
            for (Integer elem: test) {
                System.out.println(elem);
            }

        //Напишите тут ваш код
    }
}
