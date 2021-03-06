package com.javarush.test.level05.lesson12.home02;

/* Man and Woman
1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name(String), age(int), address(String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате [name + " " + age + " " + address].
*/

public class Solution
{
    public static void main(String[] args){

        Man man1 = new Man("Vova", 56, "blabla");
        Man man2 = new Man("Nazar", 25, "Chornovola");
        Woman wom1 = new Woman("Kris", 26, "asdfadsf");
        Woman wom2 = new Woman("Katya", 29, "sdfasfas");
        System.out.println(man1);
        System.out.println(man2);
        System.out.println(wom1);
        System.out.println(wom2);

        // Создай по два объекта каждого класса тут

        // Выведи их на экран тут
    }

    public static class Man{
        String name;
        int age;
        String address;

        public Man(String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }
        @Override
        public String toString(){
            return name + " " + age + " " + address;
        }
    }
    public static class Woman{
        String name;
        int age;
        String address;

        public Woman(String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }
        public String toString(){
            return name + " " + age + " " + address;
        }
    }
    // Напиши тут свои классы
}
