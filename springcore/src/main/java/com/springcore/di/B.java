package com.springcore.di;

public class B {
    private int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public B(int x) {
        this.x = x;
    }

    public B() {
    }

    @Override
    public String toString() {
        return "A{" +
                "x=" + x +
                '}';
    }
}
