package com.anna.Lab_3;

public class Square implements IFigure {

    private double length;



    public Square(){

    }

    public Square(double length)
    {
        this.length = length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public double getDiagonal(){
        return this.length * Math.sqrt(2);
    }

    public double getPerim(){
        return this.length * 4;
    }

    public double getS(){
        return this.length * this.length;
    }

    public String toString(){
        return "\nSquare length = " + this.length+'\n'
                + "  Square diagonal = " + this.getDiagonal()+'\n'
                + "  Square Perim = " + this.getPerim()+'\n'
                + "  Square S = " + this.getS();
    }
}
