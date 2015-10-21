package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        Human child1 = new Human("Vova", true, 17, null);
        Human child2 = new Human("Sveta", false, 15, null);
        Human child3 = new Human("Taras", true, 11, null);
        Human tato = new Human("Petro", true, 45, child1);
        tato.children.add(child2);
        tato.children.add(child3);
        Human mama = new Human("Oksana", false, 44, child1);
        mama.children.add(child2);
        mama.children.add(child3);
        Human ded1 = new Human("Oleg", true, 68, tato);
        Human baba1 = new Human("Frosya", false, 66, tato);
        Human ded2 = new Human("Igor", true, 68, mama);
        Human baba2 = new Human("Petronela", false, 69, mama);

        System.out.println(ded1);
        System.out.println(ded2);

        System.out.println(baba1);
        System.out.println(baba2);

        System.out.println(tato);
        System.out.println(mama);

        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);
    }

    public static class Human
    {
        private String name;
        private boolean sex;
        private int age;
        private ArrayList<Human> children  = new ArrayList<>();

        public Human(String name, boolean sex, int age, Human children) {
            this.name = name;
            this.sex = sex;
            this.age = age;

            if (children  != null) {
                this.children.add(children);
            }
        }
        public Human(){}

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
