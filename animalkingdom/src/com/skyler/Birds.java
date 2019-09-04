package com.skyler;

public class Birds implements Animal {
    private static int maxId;
    private int id;
    private int yearNamed;
    private String name;

    public Birds(String name, int yearNamed) {
        maxId++;
        id = maxId;
        this.yearNamed = yearNamed;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYearNamed(int yearNamed) {
        this.yearNamed = yearNamed;
    }

    public int getYearNamed() {
        return yearNamed;
    }
    @Override
    public String move() {
        return "Fly";
    }

    @Override
    public String breathe() {
        return "Lungs";
    }

    @Override
    public String reproduce() {
        return "Eggs";
    }
}
