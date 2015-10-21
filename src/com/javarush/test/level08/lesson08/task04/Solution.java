package com.javarush.test.level08.lesson08.task04;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/
public class Solution{
     public static void main(String[] args)
    {
    HashMap<String,Date> map=createMap();
    removeAllSummerPeople(map);
    for(Map.Entry<String,Date> pair : map.entrySet())
    System.out.println(pair);
    }
    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Сталлоне", new Date("JUN 1 1980"));
        map.put("Несталлоне",new Date("OCT 11 1975"));
        map.put("ОтецСталлоне",new Date("DEC 05 1939"));
        map.put("Лундгрен",new Date("APR 11 1970"));
        map.put("БрюсВылез",new Date("JUL 21 1970"));
        map.put("БрюсЗалез",new Date("NOV 30 2000"));
        map.put("ЧерныйНегр",new Date("FEB 11 2000"));
        map.put("ДжекиКотел",new Date("JUN 11 2000"));
        map.put("Стетхем",new Date("AUG 11 1990"));
        map.put("БрюсЛи",new Date("JUL 11 1974"));
        //Напишите тут ваш код
        return map;
    }
    public static void  removeAllSummerPeople(HashMap<String, Date> map)
    {
        //Нпишите тут ваш код
        Iterator<Map.Entry<String,Date>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String,Date> pair=iterator.next();
            String value = String.valueOf(pair.getValue());
            if(value.contains("Jun")||value.contains("Jul")||value.contains("Aug")){
                System.out.println(value);
                iterator.remove();

            }
        }

    }
}