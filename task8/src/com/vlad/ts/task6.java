package com.vlad.ts;

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        int id = 7;
        String name;
        String author;
        String publisher;
        int date;
        int pages;
        int price;
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
            System.out.println(elem.toString());
        }
        System.out.println("---------------------------");
        System.out.println("BOOKS BY 2010:");
        for (Book elem : books.searchBooksByYear(2010)) {
            System.out.println(elem.toString());
        }
        System.out.println("---------------------------");

        System.out.println("Want to input new book ? 1 to yes, 0 to no");
        Scanner scanner = new Scanner(System.in);
        int retry = GetValues.input(scanner);
        while ( retry == 1){
            System.out.println("Input name of book in format [А-Я][а-я] :");
            name=GetValues.inputName(scanner);
            System.out.println("Input surname of Author in format [A-Z][a-z] :");
            author=GetValues.inputLatina(scanner);
            System.out.println("Input publisher in format [A-Z][a-z] :");
            publisher=GetValues.inputLatina(scanner);
            System.out.println("Input year :");
            date=GetValues.inputYear(scanner);
            System.out.println("Input number of pages :");
            pages=GetValues.inputInt(scanner);
            System.out.println("Input price of book :");
            price=GetValues.inputInt(scanner);

            Book anotherBook = new Book(id,name,author,publisher,date,pages,price);
            books.addBook(anotherBook);
            id++;
            System.out.println("Want to input another book ? 1 to yes, 0 to no");
            retry = GetValues.input(scanner);
        }
        books.printBooks();


    }
}
