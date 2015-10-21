package com.javarush.test.level09.lesson11.home08;

import java.util.ArrayList;
import java.util.List;

/* Список из массивов чисел
Создать список, элементами которого будут массивы чисел. Добавить в список пять объектов–массивов длиной 5, 2, 4, 7, 0 соответственно. Заполнить массивы любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList()
    {
        ArrayList<int[]> list = new ArrayList<>();
        int[] one =  {1,2,3,2,2};
        int[] two = {1,5};
        int[] three = {1,5,7,8};
        int[] four = {4,8,7,5,9,4,5};
        int[] five = {};

        list.add(one);
        list.add(two);
        list.add(three);
        list.add(four);
        list.add(five);

        return list;
    }

    public static void printList(ArrayList<int[]> list)
    {
        for (int[] array: list )
        {
            for (int x: array)
            {
                System.out.print(x);
            }
            System.out.println("");
        }

    }
}
