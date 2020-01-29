package com.vlad.ts;

public class task6 {
    public static void main(String[] args) {
        Books books = new Books();
        System.out.println("BOOKS:");
        books.printBooks();
        System.out.println("---------------------------");

        Book otherBook = new Book(6, "Vlad", "Koldov", "EPAM", 2000, 19, 21);
        books.addBook(otherBook);
        System.out.println("BOOKS WITH NEW ELEMENT:");
        books.printBooks();
        System.out.println("---------------------------");

        books.changePriceByPercent(200);
        System.out.println("BOOKS WITH NEW PRICE:");
        books.printBooks();
        System.out.println("---------------------------");

        System.out.println("BOOKS BY Koldov:");
        for (Book elem : books.searchBooksByAuthor("Koldov")) {
            elem.view();
        }
        System.out.println("---------------------------");
        System.out.println("BOOKS BY 2010:");
        for (Book elem : books.searchBooksByYear(2010)) {
            elem.view();
        }
        System.out.println("---------------------------");



    }
}
