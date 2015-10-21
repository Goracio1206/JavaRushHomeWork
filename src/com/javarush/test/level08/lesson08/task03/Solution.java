package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        HashMap<String, String> person = new HashMap<>();
        person.put("Vitalik1" , "ASDF");
        person.put("Vasya" , "ASDFG");
        person.put("Petro1" , "ASDF");
        person.put("Nazar" , "ASDFGH");
        person.put("Oleh" , "ASDFSDFAS");
        person.put("Petro" , "GHGF");
        person.put("Vitalik2" , "ASDF");
        person.put("Vitalik3" , "ASDF");
        person.put("Vitalik4" , "ASDF");
        person.put("Vitalik5" , "ASDF");

        return person;
        //Напишите тут ваш код

    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        int counter = 0;
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            if (iterator.next().getValue().equals(name)){
               counter++;
            }
        }
        return counter;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String familiya)
    {
        int count = 0;
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            if (iterator.next().getKey().equals(familiya)){
                count++;
            }
        }
        //Напишите тут ваш код
        return count;
    }


}
