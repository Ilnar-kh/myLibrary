package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class Repository {
    Entity book = new Entity();
    ArrayList books = new ArrayList<>();

    void addBooks (Entity book){
        books.add(book);
    }

    void printBooks () {
        System.out.println(Arrays.toString(books.toArray()));
    }
}
