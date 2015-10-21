package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Map;

public class Solution {
    public static int min(int a, int b) {
        return (a < b) ? a : b;
    }

    public static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    public static void main(String[] args) throws IOException {
        ArrayList<Integer> listOfNumber = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        while (true) {
            String st = reader.readLine();
            if (reader.readLine().isEmpty()){
                break;
            }
            listOfNumber.add(Integer.parseInt(st));

        }

        for (Integer  elem: listOfNumber) {
            System.out.println(elem);
        }


    }
}
