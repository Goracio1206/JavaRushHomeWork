package com.javarush.test.level08.lesson08.task05;

import java.util.*;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution
{
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<>();
        map.put("1", "2");
        map.put("2", "2");
        map.put("3", "3");
        map.put("4", "4");
        map.put("5", "5");
        map.put("6", "7");
        map.put("7", "8");
        map.put("8", "8");
        map.put("9", "23");
        map.put("10", "1");
        return map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {

        int count;
       HashMap<String, String> copy = new HashMap<>(map);
        for (Iterator<Map.Entry<String, String>> i = copy.entrySet().iterator(); i.hasNext();){
            count = 0;
            String value = i.next().getValue();
            for(Iterator<Map.Entry<String, String>> j = copy.entrySet().iterator(); j.hasNext();){
                if (j.next().getValue().equals(value)){
                    count++;
                    if (count > 1){
                        removeItemFromMapByValue(map, value);
                    }
                }

            }
        }
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        int count = 0;
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {

            if (pair.getValue().equals(value))
                count++;
                 if (count > 1) {
                    map.remove(pair.getKey());
                     count = 0;
            }
        }
    }

    public static void main(String[] args) {
        HashMap<String, String> map = createMap();
        for (Map.Entry<String, String> elem : map.entrySet()) {
            System.out.println(elem.getKey() + " - " + elem.getValue());
        }
        System.out.println("------------------");
        removeTheFirstNameDuplicates(map);
        for (Map.Entry<String, String> elem : map.entrySet()) {
            System.out.println(elem.getKey() + " - " + elem.getValue());
        }


    }

}
