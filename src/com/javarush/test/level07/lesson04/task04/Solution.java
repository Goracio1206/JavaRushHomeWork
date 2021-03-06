package com.javarush.test.level07.lesson04.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Массив из чисел в обратном порядке
1. Создать массив на 10 чисел.
2. Ввести с клавиатуры 10 чисел и записать их в массив.
3. Расположить элементы массива в обратном порядке.
4. Вывести результат на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static int[] initialize() throws Exception{
        int[] array = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }
        return array;
    }
    public static void main(String[] args) throws Exception
    {
        int[] array = initialize();

        for (int i = 0; i < array.length/2 ; i++) {
            int tmp = array[i];
            array[i] = array[array.length - i -1];
            array[array.length -i -1] = tmp;
        }

        for (int i = 0; i <array.length ; i++) {
            System.out.println(array[i]);
        }
        //Напишите тут ваш код

    }
}
