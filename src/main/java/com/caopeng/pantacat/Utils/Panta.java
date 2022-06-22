package com.caopeng.pantacat.Utils;

public class Panta {
    private String name;

    public Panta(String name) {
        this.name = name;
    }

    public Panta getPanta() {
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.getName();
    }
}
