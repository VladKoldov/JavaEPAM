package com.vlad.ts;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Books {
    private Book[] books = new Book[] {
//            new Book(1, "Идиот", "Dostoevkiy", "Kyiv", 2008, 453, 200),
//            new Book(2, "Преступление и наказание", "Chehov", "Moskva", 2015, 233, 120),
//            new Book(3, "Бесы", "Dostoevkiy", "Odesa", 2009, 600, 360),
//            new Book(4, "Игрок", "Gogol", "Kharkiv", 2011, 344, 110),
//            new Book(5, "Двойник", "Dostoevkiy", "Kyiv", 1999, 78, 180),
    };

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public void addBook(Book book)
    {
        List<Book> arrlist = new ArrayList<>(Arrays.asList(this.getBooks()));
        arrlist.add(book);
        setBooks( arrlist.toArray(this.getBooks()));
    }

    public Book[] searchBooksByAuthor(String author) {
        Book[] booksUn = new Book[books.length];
        int count = 0;
        for (Book elem : books) {
            if (elem.getAuthor().equals(author)) {
                booksUn[count] = elem;
                count++;
            }
        }
        return Arrays.copyOf(booksUn, count);
    }

    public Book[] searchBooksByYear(int year) {
        Book[] booksUn = new Book[books.length];
        int count = 0;
        for (Book elem : books) {
            if (elem.getDate() > year) {
                booksUn[count] = elem;
                count++;
            }
        }
        return Arrays.copyOf(booksUn, count);
    }

    public void changePriceByPercent(int percent) {
        for (Book elem : books) {
            elem.setPrice(elem.getPrice() * (percent/100 + 1));
        }
    }

    public void printBooks() {
        for (Book elem : books) {
            System.out.println(elem.toString());
        }
    }

}
