package com.javarush.test.level08.lesson08.task02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* Удалить все числа больше 10
Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
Удалить из множества все числа больше 10.
*/

public class Solution
{
    public static HashSet<Integer> createSet()
    {
        HashSet<Integer> numberSet = new HashSet<>();
        numberSet.add(1);
        numberSet.add(2);
        numberSet.add(3);
        numberSet.add(4);
        numberSet.add(5);
        numberSet.add(6);
        numberSet.add(7);
        numberSet.add(8);
        numberSet.add(9);
        numberSet.add(10);//10
        numberSet.add(11);
        numberSet.add(12);
        numberSet.add(13);
        numberSet.add(14);
        numberSet.add(15);
        numberSet.add(16);
        numberSet.add(17);
        numberSet.add(18);
        numberSet.add(19);
        numberSet.add(20);
        //Напишите тут ваш код

        return numberSet;
    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set)
    {
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()){
            if(iterator.next() > 10 ){
                iterator.remove();
            }

        }
        return set;
    }

}
