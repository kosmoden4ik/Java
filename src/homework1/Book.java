package homework1;

import java.util.Scanner;

/*
Используя IDEA, создайте проект c пакетом.
Требуется: Создать класс Book(Main). Создать классы Title, Author и Content, каждый из которых должен
содержать одно строковое поле и метод void show (). Реализуйте возможность добавления в книгу
названия книги, имени автора и содержания. Выведите на экран при помощи метода show() название
книги, имя автора и Содержание.
 */
public class Book {
Author authorBook;
Title titleBook;
Content contentBook;
Book(){}
    void AddTitle(){
    titleBook=new Title();
        HelperWrite title=new HelperWrite();
        System.out.println("Введите название книги: ");
        titleBook.setTitle(title.setValuesString());
    }
    void AddAuthor(){

authorBook=new Author();
        System.out.println("Введите Автора книги: ");
        HelperWrite title=new HelperWrite();
        authorBook.setNameAuthor(title.setValuesString());
    }
    void AddContentBook(){
    contentBook=new Content();
        HelperWrite title=new HelperWrite();
        System.out.println("Введите содержание книги: ");
        contentBook.setTextContent(title.setValuesString());
    }
    void show(){
        System.out.print("Название книги: ");
        titleBook.show();
        System.out.print("Автор книги: ");
        authorBook.show();
        System.out.print("Текст книги: ");
        contentBook.show();
    }
}

