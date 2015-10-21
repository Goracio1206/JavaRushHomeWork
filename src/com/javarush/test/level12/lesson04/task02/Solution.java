package com.javarush.test.level12.lesson04.task02;

/* print(int) и print(Integer)
Написать два метода: print(int) и print(Integer).
Написать такой код в методе main, чтобы вызвались они оба.
*/

public class Solution
{
    public static void main(String[] args)
    {
        System.out.println(print(4));
        System.out.println(print((Integer)7));
    }

    public static int print(int i)  {
        return i+2;
    }
     public static int print(Integer y){
         return y*2;
     }
}
