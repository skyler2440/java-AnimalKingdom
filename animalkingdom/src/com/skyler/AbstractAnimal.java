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

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getyearNamed() {
        return yearNamed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setyearNamed(int yearNamed) {
        this.yearNamed = yearNamed;
    }
}
