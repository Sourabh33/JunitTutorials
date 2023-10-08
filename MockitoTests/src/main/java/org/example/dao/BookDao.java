package org.example.dao;

import java.util.ArrayList;
import java.util.List;

public class BookDao {
    List<String> bookLibrary = new ArrayList<>();

    public void saveBook(String bookName, Integer index) {
        bookLibrary.add(index, bookName);
    }

    public static String bookName() {
        return "book";
    }
}
