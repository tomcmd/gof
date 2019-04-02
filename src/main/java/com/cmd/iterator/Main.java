package com.cmd.iterator;


public class Main {
    public static void main(String[] args){
        BookShelf bookShelf = new BookShelf();
        bookShelf.addBook(new Book("鲁豫01"));
        bookShelf.addBook(new Book("鲁豫02"));
        bookShelf.addBook(new Book("鲁豫03"));
        Iterator iterator = bookShelf.iterator();
        while (iterator.hashNext()){
            Book next = (Book) iterator.next();
            System.out.println(next.getName());
        }
    }


}
