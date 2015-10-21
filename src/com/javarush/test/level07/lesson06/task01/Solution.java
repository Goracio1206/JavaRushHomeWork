package com.javarush.test.level07.lesson06.task01;

/* 5 различных строчек в списке
1. Создай список строк.
2. Добавь в него 5 различных строчек.
3. Выведи его размер на экран.
4. Используя цикл выведи его содержимое на экран, каждое значение с новой строки.
*/

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayList;
import java.io.*;

public class Solution {

    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        list.add("asdasdasdas");
        list.add("asdfasdfaczxczx");
        list.add("asdasdasdaqwerqwers");
        list.add("asdasdasda34sdass");
        list.add("asdasdsdfasdfasdfasdfasdas");
        System.out.println(list.size());
        for (String elem : list) {
            System.out.println(elem);
        }

        //Напишите тут ваш код

    }
}
