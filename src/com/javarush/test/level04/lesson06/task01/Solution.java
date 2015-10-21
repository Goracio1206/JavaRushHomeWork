package com.javarush.test.level04.lesson06.task01;

/* Минимум двух чисел
Ввести с клавиатуры два числа, и вывести на экран минимальное из них.
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
  /*  public static int min(int a, int b){
        int min;
        if (a<b){
            min = a;
        }
        else {
            min = b;
        }
        return min;
    }*/
    public static void main(String[] args) throws Exception
    {
        int min;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       // System.out.println("Input value 1: ");
        int val1 = Integer.parseInt(reader.readLine());
       // System.out.println("Input value 2: ");
        int val2 = Integer.parseInt(reader.readLine());
        if (val1 < val2){
            System.out.println(val1);
        }else {
            System.out.println(val2);
        }



        //Напишите тут ваш код

        /* данные для тестирования:
        введите 1 и 2, минимум =  1
        введите 2 и 1, минимум =  1
        введите 1 и 1, минимум =  1
        введите -1 и -2, минимум =  -2
         */
    }
}