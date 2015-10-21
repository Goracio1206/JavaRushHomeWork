package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
   /* public boolean min1(int a, int b){
        boolean min;
        if (a > b){
            min = true;
        }else{
            min = false;
        }
        return min;
    }*/
   public static int max(int a, int b, int c, int d){
       int max =0;
       if (a==b && a ==c && a==d){
           max = a;
       }
       if (a > b && a > c && a > d){
           max = a;
       }
       if (b > a && b > c && b > d){
           max = b;
       }
       if (c > b && c > a && c > d){
           max = c;
       }
       if (d > b && d > a && d > c){
           max = d;
       }
       return max;
   }


    public static void main(String[] args) throws Exception
    {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(reader.readLine());
        int num2 = Integer.parseInt(reader.readLine());
        int num3 = Integer.parseInt(reader.readLine());
        int num4 = Integer.parseInt(reader.readLine());

        System.out.println(max(num1, num2, num3, num4));


    }
}
