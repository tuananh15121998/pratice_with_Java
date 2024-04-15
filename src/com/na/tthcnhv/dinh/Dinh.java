package com.na.tthcnhv.dinh;

public class Dinh {
    private double x,y;

    public void nhapXY(double giaTriX, double giaTriY){
        x = giaTriX;
        y = giaTriY;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void inXY() {
        System.out.println("X = " + x + ", Y = " + y);
    }
}
