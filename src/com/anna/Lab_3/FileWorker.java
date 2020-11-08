package com.anna.Lab_3;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class FileWorker {

    public void save(String filename, ArrayList<Square> squares, ArrayList<Prism> prisms) throws IOException {
        FileWriter fw = new FileWriter(filename);
        BufferedWriter bw = new BufferedWriter(fw);
        for (Square square : squares) {
            try {
                bw.write("Square " + String.valueOf(square.getLength()));
                bw.write(System.lineSeparator());

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        for (Prism prism : prisms) {
            try {
                bw.write("Prism " + String.valueOf(prism.getLength()) + " " + String.valueOf(prism.getHeight()));
                bw.write(System.lineSeparator());

            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        bw.close();
        fw.close();
    }

    public void read(String filename, ArrayList<Square> circles, ArrayList<Prism> prisms) throws FileNotFoundException {
        Scanner scanner = new Scanner(new FileReader(filename));
        while (scanner.hasNextLine())
        {
            String[] line = scanner.nextLine().split(" ");
            if(line[0].matches("Square"))
            {
                circles.add(new Square(Double.valueOf(line[1])));
            }
            else if(line[0] .matches("Prism") )
            {
             prisms.add(new Prism(Double.valueOf(line[1]),Double.valueOf(line[2])));
            }
            else
                System.out.println("ERROR");

        }
    }



}
