package com.skyler;

//Create Mammal Class
public class Mammals extends AbstractAnimal {

//Constructor
    public Mammals(String name, int yearNamed) {
        super(name, yearNamed);
        reproduce = "Live Births";
        move = "Walk";
        breathe = "Lungs";
    }
//Needed getters for mammal classes
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
