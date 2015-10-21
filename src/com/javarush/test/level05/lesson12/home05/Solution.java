package com.javarush.test.level05.lesson12.home05;

/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь оне введёт слов «сумма». Вывести на экран полученную сумму.
*/



import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int i =0;
        Boolean exit = false;
        while (!exit){
            String input = reader.readLine();
            if (input.equals("сумма")){
                exit = true;
            }else {
                int test = Integer.parseInt(input);
                i += test;
            }

        }
        System.out.println(i);
        //Напишите тут ваш код
    }
}
