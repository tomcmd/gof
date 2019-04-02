package com.cmd.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: tomcmd
 * @create: 2019/4/2 8:55 PM
 */
public class BookShelf implements Aggregate{
    private List<Book> books;
    private int last = 0;

    public BookShelf() {
        this.books = new ArrayList<>();
    }

    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }

    public void addBook(Book book){
        books.add(book);
        last++;
    }
     public Book getBookAt(int index){
        return books.get(index);
     }

    public int getLength() {
        return last;
    }
}
