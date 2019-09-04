package com.skyler;

public abstract class AbstractAnimal
{
    static int maxId = 0;
    int id;
    String name;
    int yearNamed;


    public AbstractAnimal(String name, int yearNamed) {

        maxId++;
        id = maxId;
        this.name = name;
        this.yearNamed = yearNamed;

    }


    public abstract String getName();
    public abstract int getYearNamed();
    public abstract int getId();

}
