package com.skyler;

public abstract class AbstractAnimal
{
    //Create Fields
    static int maxId = 0;
    int id;
    String name;
    int yearNamed;
    String move;
    String breathe;
    String reproduce;

    //Constructor
    public AbstractAnimal(String name, int yearNamed) {

        maxId++;
        id = maxId;
        this.name = name;
        this.yearNamed = yearNamed;

    }

    //Getters for fields
    public abstract String getName();
    public abstract int getYearNamed();
    public abstract int getId();
    public abstract String getMove();
    public abstract String getBreathe();
    public abstract String getReproduce();

}
