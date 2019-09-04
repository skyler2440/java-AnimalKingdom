package com.skyler;


public class Mammals extends AbstractAnimal {


    public Mammals(String name, int yearNamed) {
        super(name, yearNamed);
        reproduce = "Live Birth";
        move = "Walk";
        breathe = "Lungs";
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
    public String getMove() {
        return "Walk";
    }

    @Override
    public String getBreathe() {
        return "Lungs";
    }

    @Override
    public String getReproduce() {
        return "Live Birth";
    }

    @Override
    public String toString() {
        return "\n Mammals{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", yearNamed=" + yearNamed +
                ", move='" + move + '\'' +
                ", breathe='" + breathe + '\'' +
                ", reproduce='" + reproduce + '\'' +
                '}';
    }
}
