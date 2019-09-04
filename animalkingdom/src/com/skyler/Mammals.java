package com.skyler;


public class Mammals extends AbstractAnimal {


    public Mammals(String name, int yearNamed) {
        super(name, yearNamed);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getYearNamed() {
        return yearNamed;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "\n Mammals{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", yearNamed=" + yearNamed +
                '}';
    }
}
