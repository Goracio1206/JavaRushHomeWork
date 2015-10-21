package com.javarush.test.level04.lesson16.home03;

/* Посчитать сумму чисел
Вводить с клавиатуры числа и считать их сумму. Если пользователь ввел -1, вывести на экран сумму и завершить программу.  -1 должно учитываться в сумме.
*/
import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.*;
public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Boolean num = false;
        int result= 0;
        while (!num){
            String s = reader.readLine();
            int i = Integer.parseInt(s);
            result = result + i;
            num = s.equals("-1");

        }
        System.out.println(result);
        //Напишите тут ваш код
    }
}
