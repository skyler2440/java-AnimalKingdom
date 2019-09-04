package com.skyler;

public class Birds extends AbstractAnimal {

    public Birds(String name, int yearNamed) {
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
        return "\n Birds{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", yearNamed=" + yearNamed +
                '}';
    }
}
