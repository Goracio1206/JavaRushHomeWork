package com.javarush.test.level09.lesson11.bonus01;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/* Нужно исправить программу, чтобы компилировалась и работала
Задача: Программа вводит два имени файла. И копирует первый файл на место заданное вторым именем.
*/

public class Solution1
{
    public static void main(String[] args) {
     int[] array = {1,3,5,1,11,32,100,101,79};
        bubleSort(array);
        System.out.println(Arrays.toString(array));
        System.out.println(array.toString());
    }

    public static void swap() {

    }

    public static int[] bubleSort(int[] a){

                for (int k = 0; k < a.length; k++) {
                    if (a[k] > a[k+1]){
                      int tmp = a[k];
                      a[k] = a[k+1];
                      a[k+1] = tmp;
                     }

            }
        return a;

    }
}
