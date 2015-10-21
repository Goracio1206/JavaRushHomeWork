package com.javarush.test.level08.lesson11.home02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* Множество всех животных
1. Внутри класса Solution создать public static классы Cat, Dog.
2. Реализовать метод createCats, котороый должен возвращать множество с 4 котами.
3. Реализовать метод createDogs, котороый должен возвращать множество с 3 собаками.
4. Реализовать метод join, котороый должен возвращать объединенное множество всех животных - всех котов и собак.
5. Реализовать метод removeCats, котороый должен удалять из множества pets всех котов, которые есть в множестве cats.
6. Реализовать метод printPets, котороый должен выводить на экран всех животных, которые в нем есть. Каждое животное с новой строки
*/

public class Solution
{
    public static class Cat{}
    public static class Dog{}
    static Cat cat1 = new Cat();
    static Cat cat2 = new Cat();
    static Cat cat3 = new Cat();
    static Cat cat4 = new Cat();
    static Dog dog1 = new Dog();
    static Dog dog2 = new Dog();
    static Dog dog3 = new Dog();
    public static void main(String[] args)
    {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats()
    {
        HashSet<Cat> result = new HashSet<Cat>();

        result.add(cat1);
        result.add(cat2);
        result.add(cat3);
        result.add(cat4);

        return result;
    }

    public static Set<Dog> createDogs()
    {
        HashSet<Dog> dog = new HashSet<>();
        dog.add(dog1);
        dog.add(dog2);
        dog.add(dog3);

        return dog;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs)
    {
        Set<Object> pets = new HashSet<>();
        Iterator<Dog> iterator = dogs.iterator();
        for(Iterator<Dog> i = dogs.iterator(); i.hasNext();){
            pets.add(i.next());
        }
        Iterator<Cat> iterator1 = cats.iterator();
        for(Iterator<Cat> i = cats.iterator(); i.hasNext();){
            pets.add(i.next());
        }
        return pets;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats)
    {
        Iterator<Cat> iterator = cats.iterator();
        for (Iterator<Cat> i = cats.iterator(); i.hasNext();){
            pets.remove(i.next());
        }
    }

    public static void printPets(Set<Object> pets)
    {
        Iterator<Object> iterator = pets.iterator();
        for (Iterator<Object> i = pets.iterator(); i.hasNext();){
            System.out.println(i.next());
        }
    }

    //Написать тут ваш код
}
