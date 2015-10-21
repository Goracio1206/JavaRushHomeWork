package com.javarush.test.level08.lesson11.bonus01;

import java.io.*;
import java.util.*;

/* Номер месяца
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: «May is 5 month».May is 5 month
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<String> dateSet = new ArrayList<>();
        dateSet.add("January");
        dateSet.add("February");
        dateSet.add("March");
        dateSet.add("April");
        dateSet.add("May");
        dateSet.add("Jun");
        dateSet.add("July");
        dateSet.add("August");
        dateSet.add("September");
        dateSet.add("October");
        dateSet.add("November");
        dateSet.add("December");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String month = reader.readLine();

        for (int i = 0; i < dateSet.size(); i++) {
            if(dateSet.get(i).equals(month)){
                System.out.println(dateSet.get(i) + " is " + (i+1) + " month");
            }
        }



        //add your code here - напиши код тут
    }


}
