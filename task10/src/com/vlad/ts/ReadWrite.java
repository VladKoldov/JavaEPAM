package com.vlad.ts;

import java.io.*;

public class ReadWrite {
    public static void writeTxt(Book[] books) {
        try {
            FileOutputStream f = new FileOutputStream(new File("myObjects.txt"));
            ObjectOutputStream o = new ObjectOutputStream(f);
            for (Book book : books) {
                o.writeObject(book);
            }
            o.close();
            f.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Error initializing stream");
        }
    }

    public static void readTxt(Books books) {
        try {
            FileInputStream fi = new FileInputStream(new File("myObjects.txt"));
            ObjectInputStream oi = new ObjectInputStream(fi);
            while (true) {
                try {
                    books.addBook((Book) oi.readObject());
                } catch (ClassNotFoundException e) {
                    System.out.println("Class not found");
                } catch (EOFException e) {
                    break;
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Error initializing stream");
        }

    }
}
