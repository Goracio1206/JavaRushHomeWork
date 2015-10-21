package com.javarush.test.level11.lesson11.home05;

/* От школьника к рабству
Написать четыре класса: Schoolboy(школьник), Student(студент), Worker(Сотрудник), Slave (Раб)
Унаследовать студента от школьника, сотрудника от студента, раба от сотрудника.
*/

public class Solution
{
    public static void main(String[] args)
    {
    }

    public class Schoolboy
    {
        private String name;
        private String lName;

        public Schoolboy(int age, String lName, String name) {
            this.age = age;
            this.lName = lName;
            this.name = name;
        }

        private int age;

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getlName() {
            return lName;
        }

        public void setlName(String lName) {
            this.lName = lName;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public class Student extends Schoolboy
    {
        public Student(int age, String lName, String name) {
            super(age, lName, name);
        }
    }

    public class Worker extends Student
    {
        public Worker(int age, String lName, String name) {
            super(age, lName, name);
        }
    }

    public class Slave extends Worker
    {

        public Slave(int age, String lName, String name) {
            super(age, lName, name);
        }
    }

}
