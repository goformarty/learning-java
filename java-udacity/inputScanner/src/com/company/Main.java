package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        try {

            File file = new File("book.txt");
            Scanner scanner = new Scanner(file);
            int words = 0;

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                words += line.split(" ").length;
            }
            System.out.printf("This book contains %d words.", words);
        } catch(FileNotFoundException e) {
            System.out.println("Book missing!");
        }
    }
}
