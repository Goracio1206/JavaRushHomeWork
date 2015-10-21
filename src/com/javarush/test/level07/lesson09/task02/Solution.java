package com.javarush.test.level07.lesson09.task02;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 5 слов в обратном порядке
Введи с клавиатуры 5 слов в список строк. Выведи их в обратном порядке.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> stringList = new ArrayList<String>();

        for (int i = 0; i < 5; i++) {
            stringList.add(reader.readLine());
        }

        for (int i = stringList.size()-1; i >=0 ; i--) {
            System.out.println(stringList.get(i));
        }
        //Напишите тут ваш код

    }
}
