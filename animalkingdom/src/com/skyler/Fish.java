package com.skyler;

public class Fish extends AbstractAnimal
{

    public Fish(String name, int yearNamed) {
        super(name, yearNamed);
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public int getYearNamed() {
        return 0;
    }

    @Override
    public int getId() {
        return 0;
    }

    @Override
    public String toString() {
        return "\n Fish{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", yearNamed=" + yearNamed +
                '}';
    }
}
