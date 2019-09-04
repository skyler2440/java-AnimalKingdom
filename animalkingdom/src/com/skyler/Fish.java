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
    public String getMove() {
        return "Swims";
    }

    @Override
    public String getBreathe() {
        return "Gills";
    }

    @Override
    public String getReproduce() {
        return "Eggs";
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
