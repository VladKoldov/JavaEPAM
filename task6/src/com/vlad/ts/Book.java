package com.vlad.ts;

public class Book {
    private int id;
    private String name;
    private String author;
    private String publisher;
    private int date;
    private int pages;
    private int price;

    Book(int id, String name, String author, String publisher, int date, int pages, int price){
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.date = date;
        this.pages = pages;
        this.price = price;
    }

    public void view(){
        System.out.println("id= " + id
                + ", name= " + name
                + ", author= " + author
                + ", publisher= " + publisher
                + ", date= " + date
                + ", pages= " + pages
                + ", price= " + price
        );
    }
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
