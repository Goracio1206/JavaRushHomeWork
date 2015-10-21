package com.javarush.test.level09.lesson11.home05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Гласные и согласные буквы
Написать программу, которая вводит с клавиатуры строку текста.
Программа должна вывести на экран две строки:
1. первая строка содержит только гласные буквы
2. вторая - только согласные буквы и знаки препинания из введённой строки.
Буквы соединять пробелом.

Пример ввода:
Мама мыла раму.
Пример вывода:
а а ы а а у
М м м л р м .
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        char space = ' ';
        List<Character> list2 = new ArrayList<>();
        List<Character> list = new ArrayList<>();

        for (int i = 0; i <str.length() ; i++) {
            if (isVowel(str.charAt(i))){
                list.add(str.charAt(i));
                list.add(space);
            }
            else {
                list2.add(str.charAt(i));
                list2.add(space);
            }
        }

        for (int i = 0; i <list.size() ; i++) {
            System.out.print(list.get(i));
        }
        System.out.println("");
        for (int i = 0; i <list2.size() ; i++) {
            System.out.print(list2.get(i));
        }

    }


    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    //метод проверяет, гласная ли буква
    public static boolean isVowel(char c)
{
    c = Character.toLowerCase(c);  //приводим символ в нижний регистр - от заглавных к строчным буквам

    for (char d : vowels)   //ищем среди массива гласных
    {
        if (c == d)
            return true;
    }
    return false;
}
}
