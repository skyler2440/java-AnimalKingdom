package com.skyler;

public class Fish extends AbstractAnimal
{

    public Fish(String name, int yearNamed) {
        super(name, yearNamed);
        move = "Swim";
        breathe = "Gills";
        reproduce = "Eggs";
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
        return move;
    }

    @Override
    public String getBreathe() {
        return breathe;
    }

    @Override
    public String getReproduce() {
        return reproduce;
    }

    @Override
    public String toString() {
        return "\n Fish{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", yearNamed=" + yearNamed +
                ", move='" + move + '\'' +
                ", breathe='" + breathe + '\'' +
                ", reproduce='" + reproduce + '\'' +
                '}';
    }
}
