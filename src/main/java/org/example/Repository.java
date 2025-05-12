package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Repository {
    Entity book = new Entity();
    List<Entity> books = new ArrayList<Entity>();

    void addBooks (Entity book){
        books.add(book);
    }

    void printBooks() {
        System.out.println(Arrays.toString(books.toArray()));
    }
}
