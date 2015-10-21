package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Human man1 = new Human("Lviv");
        Human man2 = new Human(2);
        Human man3 = new Human(65, "Lviv");
        Human man4 = new Human(2.0);
        Human man5 = new Human(true);
        Human man6 = new Human("Blaa", false, 2.0);
        Human man7 = new Human("Lviv", 3, "asdfa", true);
        Human man8 = new Human("Lviv");
        Human man9 = new Human("Lviv");
        Human man10 = new Human("Lviv");
    }

    public static class Human
    {
        String fName;
        String city;
        String pet;
        int age;
        double weight;
        boolean male;

        public Human(){}

        public Human(String city) {
            this.city = city;
        }

        public Human(int age) {
            this.age = age;
        }

        public Human(int age, String city) {
            this.age = age;
            this.city = city;
        }

        public Human(double weight) {
            this.weight = weight;
        }

        public Human(boolean male) {
            this.male = male;
        }

        public Human(String fName, boolean male, double weight) {
            this.fName = fName;
            this.male = male;
            this.weight = weight;
        }

        public Human(String fName, int age, String city, boolean male) {
            this.fName = fName;
            this.age = age;
            this.city = city;
            this.male = male;
        }

        public Human(float weight, String pet, boolean male, String fName, String city, int age) {
            this.weight = weight;
            this.pet = pet;
            this.male = male;
            this.fName = fName;
            this.city = city;
            this.age = age;
        }

        public Human(String pet, boolean male, String fName) {
            this.pet = pet;
            this.male = male;
            this.fName = fName;
        }

        public Human(String pet, float weight) {
            this.pet = pet;
            this.weight = weight;
        }

        @Override
        public String toString() {
            return "Human{" +
                    "age=" + age +
                    ", fName='" + fName + '\'' +
                    ", city='" + city + '\'' +
                    ", pet='" + pet + '\'' +
                    ", weight=" + weight +
                    ", male=" + male +
                    '}';
        }
    }
}
