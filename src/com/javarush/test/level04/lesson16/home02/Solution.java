package com.javarush.test.level04.lesson16.home02;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/
import java.io.*;

public class Solution
{
    public static int min(int a, int b){
        int min;
        if (a<b){
            min = a;
        }else {
            min = b;
        }
        return min;
    }
    public static int max(int a, int b){
        int max;
        if (a>b){
            max = a;
        }else {
            max = b;
        }
        return max;
    }

    public static void main(String[] args)   throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(reader.readLine());
        int num2 = Integer.parseInt(reader.readLine());
        int num3 = Integer.parseInt(reader.readLine());

        System.out.println((num1 + num2 + num3) - (max(max(num2 , num1), num3)) - (min(min(num1, num2),num3)));
        //Напишите тут ваш код
    }
}
