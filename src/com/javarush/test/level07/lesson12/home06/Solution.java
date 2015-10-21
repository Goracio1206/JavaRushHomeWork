package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        Human ded1 = new Human("BoBa", true, 78 , null , null);
        System.out.println(ded1);

        Human ded2 = new Human("Petro", true, 80 , null , null);
        System.out.println(ded2);

        Human baba1 = new Human("Sveta", false, 82 , null , null);
        System.out.println(baba1);

        Human baba2 = new Human("Kris", false, 69 , null , null);
        System.out.println(baba2);

        Human dad = new Human("BoBa", true, 45 , ded1 , baba1);
        System.out.println(dad);

        Human mom = new Human("Katya", false, 44 , ded2 , baba2);
        System.out.println(mom);

        Human kid1 = new Human("Nazar", true, 20 , dad , mom);
        System.out.println(kid1);

        Human kid2 = new Human("Vika", false, 18 , dad , mom);
        System.out.println(kid2);

        Human kid3 = new Human("BoBa", true, 14 , dad , mom);
        System.out.println(kid3);

        //Написать тут ваш код
    }

    public static class Human
    {
        private String name;
        private static boolean sex;
        private static int age;
        private static Human father;
        private static Human mother;

        public Human(){}
        public Human(String name, boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }
        //Написать тут ваш код
        @Override
        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}
