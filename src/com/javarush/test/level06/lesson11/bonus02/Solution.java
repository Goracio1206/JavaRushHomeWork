package com.javarush.test.level06.lesson11.bonus02;

import java.io.*;
//import java.io.InputStreamReader;

/* Нужно добавить в программу новую функциональность
Задача: У каждой кошки есть имя и кошка-мама. Создать класс, который бы описывал данную ситуацию. Создать два объекта: кошку-дочь и кошку-маму. Вывести их на экран.
Новая задача: У каждой кошки есть имя, кошка-папа и кошка-мама. Изменить класс Cat так, чтобы он мог описать данную ситуацию.
Создать 6 объектов: маму, папу, сына, дочь, бабушку(мамина мама) и дедушку(папин папа).
Вывести их всех на экран в порядке: дедушка, бабушка, папа, мама, сын, дочь.

Пример ввода:
дедушка Вася
бабушка Мурка
папа Котофей
мама Василиса
сын Мурчик
дочь Пушинка

Пример вывода:
Cat name is дедушка Вася, no mother, no father
Cat name is бабушка Мурка, no mother, no father
Cat name is папа Котофей, no mother, father is дедушка Вася
Cat name is мама Василиса, mother is бабушка Мурка, no father
Cat name is сын Мурчик, mother is мама Василиса, father is папа Котофей
Cat name is дочь Пушинка, mother is мама Василиса, father is папа Котофей
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String ded = reader.readLine();
        Cat ded1 = new Cat(ded);

        String baba = reader.readLine();
        Cat baba1 = new Cat(baba);

        String tato = reader.readLine();
        Cat tato1 = new Cat(tato, ded1, null);

        String mama = reader.readLine();
        Cat mama1 = new Cat(mama, null, baba1);

        String son = reader.readLine();
        Cat son1 = new Cat(son, tato1, mama1);

        String dother = reader.readLine();
        Cat dother1 = new Cat(dother, tato1, mama1);

        System.out.println(ded1);
        System.out.println(baba1);
        System.out.println(tato1);
        System.out.println(mama1);
        System.out.println(son1);
        System.out.println(dother1);
    }

    public static class Cat
    {
        private String name;
        private Cat father;
        private Cat mother;

        Cat(String name)
        {
            this.name = name;
        }

        Cat(String name, Cat father, Cat mother)
        {
            this.name = name;
            this.father = father;
            this.mother = mother;
        }

        @Override
        public String toString()
        {
            if (mother == null & father == null)
                return "Cat name is " + name + ", no mother, no father";
            else if(mother == null)
                return "Cat name is " + name + ", no mother, father is " +  father.name;
            else if(father == null)
                return "Cat name is " + name + ", mother is " + mother.name + ", no father";
            else
                return "Cat name is " + name + ", mother is " + mother.name + ", father is " + father.name;
        }
    }

}
