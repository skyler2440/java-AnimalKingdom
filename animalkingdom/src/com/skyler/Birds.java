package com.skyler;

public class Birds extends AbstractAnimal {

    public Birds(String name, int yearNamed) {
        super(name, yearNamed);
        move = "Fly";
        breathe = "Lungs";
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
        return "Fly";
    }

    @Override
    public String getBreathe() {
        return "Lungs";
    }

    @Override
    public String getReproduce() {
        return "Eggs";
    }

    @Override
    public String toString() {
        return "\n Birds{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", yearNamed=" + yearNamed +
                ", move='" + move + '\'' +
                ", breathe='" + breathe + '\'' +
                ", reproduce='" + reproduce + '\'' +
                '}';
    }
}
