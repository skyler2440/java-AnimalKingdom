package com.skyler;

import java.util.*;

public class Main
{
    public static void printAnimals(ArrayList<AbstractAnimal> animals, CheckAnimal tester)
    {
        for (AbstractAnimal a: animals)
        {
            if (tester.test(a))
            {
                System.out.println("The " + a.getName()+" breathes with "+a.getBreathe()+", reproduces using "+a.getReproduce()+", and was named in the year "+a.getYearNamed() + ".");
            }
        }
    }

    public static void main(String[] args)
    {
        //Create mammals
        Mammals panda = new Mammals("Panda", 1869);
        Mammals zebra = new Mammals("Zebra", 1778);
        Mammals koala = new Mammals("Koala", 1816);
        Mammals sloth = new Mammals("Sloth", 1804);
        Mammals armadillo = new Mammals("Armadillo", 1758);
        Mammals raccoon = new Mammals("Raccoon", 1758);
        Mammals bigfoot = new Mammals("Bigfoot", 2021);

        //Create Birds
        Birds pigeon = new Birds("Pigeon", 1837);
        Birds peacock = new Birds("Peacock", 1821);
        Birds toucan = new Birds("Toucan", 1758);
        Birds parrot = new Birds("Parrot", 1824);
        Birds swan = new Birds("Swan", 1758);

        //Create Fish
        Fish salmon = new Fish("Salmon", 1758);
        Fish catfish = new Fish("Catfish", 1817);
        Fish perch = new Fish("Perch", 1758);

        //Create Array List and Add Animals
        ArrayList<AbstractAnimal> myList = new ArrayList<>();
        myList.add(panda);
        myList.add(zebra);
        myList.add(koala);
        myList.add(sloth);
        myList.add(armadillo);
        myList.add(raccoon);
        myList.add(bigfoot);
        myList.add(pigeon);
        myList.add(peacock);
        myList.add(toucan);
        myList.add(parrot);
        myList.add(swan);
        myList.add(salmon);
        myList.add(catfish);
        myList.add(perch);
        //Print Array List to test
        System.out.println("*** Full Array List ***");
        System.out.println(myList.toString());
        System.out.println();
        //List animals by year named
        System.out.println("\n*** Animals by year named ***");
        myList.sort((y1,y2) -> y2.getYearNamed() - y1.getYearNamed());
        myList.forEach((a) -> System.out.println(a));
        //Alphabetical
        System.out.println("\n*** Animals by ABC ***");
        myList.sort((y1, y2) -> y1.getName().compareToIgnoreCase(y2.getName()));
        myList.forEach((a) -> System.out.println(a));
        //Movement
        System.out.println("\n*** Animals by Movement ***");
        myList.sort((y1, y2) -> y1.getMove().compareToIgnoreCase(y2.getMove()));
        myList.forEach((a) -> System.out.println(a));
        //Breathe With Lungs
        System.out.println("\n*** Animals that breathe with lungs ***");
        printAnimals(myList, a -> a.getBreathe() == "Lungs");
        //breathe with lungs and named in 1758
        System.out.println("\n*** Animals that breathe with lungs and named in 1758 ***");
        printAnimals(myList, a -> a.getBreathe() == "Lungs" && a.getYearNamed() == 1758);
        //breathe with lungs and lay eggs
        System.out.println("\n*** Animals that breathe with lungs and lay eggs ***");
        printAnimals(myList, a -> a.getBreathe() == "Lungs" && a.getReproduce() == "Eggs");
        //named in 1758
        System.out.println("\n*** Alphabetical named in 1758 ***");
        myList.sort((y1, y2) -> y1.getName().compareToIgnoreCase(y2.getName()));
        printAnimals(myList, a -> a.getYearNamed() == 1758);
        //STRETCH
        System.out.println("\n*** STRETCH ***");
        myList.sort((y1, y2) -> y1.getName().compareToIgnoreCase(y2.getName()));
        printAnimals(myList, a -> a.getReproduce() == "Live Births");


    }
}
