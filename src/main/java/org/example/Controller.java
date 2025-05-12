package org.example;

import java.util.Scanner;

public class Controller {
    public static void main(String[] args) {
        Entity entity = new Entity();
//        Repository repository = new Repository();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите название книги: ");
        String title = scanner.nextLine();
        entity.setBookName(title);
        entity.getBookName();

        System.out.println("Введите имя автора: ");
        String author = scanner.nextLine();
        entity.setAuthor(author);
        entity.getAuthor();

        System.out.println("Введите свою субъективную, глубоко обдуманную оценку книги: ");
        double rate = scanner.nextDouble();
        entity.setRate(rate);
        entity.getRate();
        entity.setDate();
        entity.getDate();

        System.out.println(entity);
//        repository.addBooks();
//        repository.printBooks();
//        System.out.println("Введите название автора: ");
//        String write = scanner.nextLine();
//        entity.setAuthor(write);
    }
}
