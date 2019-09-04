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
