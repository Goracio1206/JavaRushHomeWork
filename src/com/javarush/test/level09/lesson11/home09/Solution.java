package com.javarush.test.level09.lesson11.home09;

import java.util.*;

/* Десять котов
Создать класс кот – Cat, с полем «имя» (String).
Создать словарь Map(<String, Cat>) и добавить туда 10 котов в виде «Имя»-«Кот».
Получить из Map множество(Set) всех имен и вывести его на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap()
    {
        Map<String, Cat> cat = new HashMap<String, Cat>();
        cat.put("1", new Cat("Petya"));
        cat.put("2", new Cat("Petya1"));
        cat.put("3", new Cat("Petya2"));
        cat.put("4", new Cat("Petya3"));
        cat.put("5", new Cat("Petya4"));
        cat.put("6", new Cat("Petya5"));
        cat.put("7", new Cat("Petya6"));
        cat.put("8", new Cat("Petya7"));
        cat.put("9", new Cat("Petya8"));
        cat.put("10", new Cat("Petya9"));
        return cat;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map)
    {
        Set<Cat> catSet = new HashSet<>();

        Iterator<Map.Entry<String, Cat>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, Cat> pair = iterator.next();
            catSet.add(pair.getValue());
        }
        return catSet;
    }

    public static void printCatSet(Set<Cat> set)
    {
        for (Cat cat:set)
        {
            System.out.println(cat);
        }
    }

    public static class Cat
    {
        private String name;

        public Cat(String name)
        {
            this.name = name;
        }

        public String toString()
        {
            return "Cat "+this.name;
        }
    }


}
