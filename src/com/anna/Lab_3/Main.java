package com.anna.Lab_3;

import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        ArrayList<Square> squares = new ArrayList<>();
        ArrayList<Prism> prisms = new ArrayList<>();

        squares.add(new Square(5));
        squares.add(new Square(10));
        squares.add(new Square(6));
        squares.add(new Square(8));

        prisms.add(new Prism(squares.get(0).getLength(), 5));
        prisms.add(new Prism(squares.get(1).getLength(), 22));
        prisms.add(new Prism(squares.get(2).getLength(), 12));
        prisms.add(new Prism(squares.get(3).getLength(), 4));

        FileWorker fileWorker = new FileWorker();
        fileWorker.save("savefile.txt", squares, prisms);

        squares.clear();
        prisms.clear();

        fileWorker.read("savefile.txt", squares, prisms);

        System.out.println(squares.toString().replace("[", "").replace("]", ""));
        System.out.println(prisms.toString().replace("[", "").replace("]", ""));

        System.out.println(maxSquare(squares));
        System.out.println(maxDiag(prisms));
    }

    public static String maxSquare(final ArrayList<Square> squares)
    {
        int index = 0;
        double sq = 0;
        for(int i = 0;i<squares.size();++i){
            if(sq<squares.get(i).getS()){
                sq = squares.get(i).getS();
                index = i;
            }
        }
        return "\nMax square of a squares: " + squares.get(index);
    }


    public static String maxDiag(ArrayList<Prism> prisms)
    {
        double diag = 0;
        int index = 0;
        for(int i = 0;i<prisms.size();++i){
            if(diag<prisms.get(i).getDiagonal()){
                diag = prisms.get(i).getDiagonal();
                index = i;
            }
        }
        return "\nAverage diagonal of a prisms = " + prisms.get(index);
    }

}