package com.javarush.test.level12.lesson12.home05;

/* Что это? «Кот», «Тигр», «Лев», «Бык», «Корова», «Животное»
Напиши метод, который определяет, какой объект передали в него.
Программа должна выводить на экран одну из надписей:
«Кот», «Тигр», «Лев», «Бык», «Корова», «Животное».
Замечание: постарайся определять тип животного как можно более точно.
*/

public class Solution
{
    public static void main(String[] args)
    {
        System.out.println(getObjectType(new Cat()));
        System.out.println(getObjectType(new Tiger()));
        System.out.println(getObjectType(new Lion()));
        System.out.println(getObjectType(new Bull()));
        System.out.println(getObjectType(new Cow()));
        System.out.println(getObjectType(new Animal()));

    }

    public static String getObjectType(Object o)
    {
        String type = "";
        if (o.getClass().getSimpleName().equals("Cat")){
            type = "Кот";
        }else if (o.getClass().getSimpleName().equals("Tiger")){
            type = "Тигр";
        } else if (o.getClass().getSimpleName().equals("Lion")){
            type = "Лев";
        } else if (o.getClass().getSimpleName().equals("Bull")){
            type = "Бык";
        } else if (o.getClass().getSimpleName().equals("Cow")){
            type = "Корова";
        } else if (o.getClass().getSimpleName().equals("Animal")){
            type = "Животное";
        }

        return type;
    }

    public static class Cat  extends Animal   //<--Классы наследуются!!
    {
    }

    public static class Tiger  extends Cat
    {
    }

    public static class Lion  extends Cat
    {
    }

    public static class Bull  extends Animal
    {
    }

    public static class Cow  extends Animal
    {
    }

    public static class Animal
    {
    }
}
