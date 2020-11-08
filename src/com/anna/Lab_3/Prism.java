package com.anna.Lab_3;

public class Prism extends Square {

    private double height;

    public Prism()
    {
    }

    public Prism(double length, double height)
    {
        super.setLength(length);
        this.height = height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

//    @Override
    public void setLength(int length) {
        super.setLength(length);
    }

    @Override
    public double getLength() {
        return super.getLength();
    }

    public double getHeight() {
        return height;
    }

    public double getV(){
        return super.getS() * this.height;
    }

    @Override
    public double getS() {
        return (super.getS() * 2) + this.height * this.getLength();
    }

    @Override
    public double getDiagonal() {
        return super.getDiagonal();
    }

    @Override
    public String toString(){
        return "\nPrism length = " + this.getLength()+'\n'
                + "  Prism height = " + this.getHeight()+'\n'
                + "  Prism S = " + this.getS()+'\n'
                + "  Prism V = " + this.getV();
    }
}
