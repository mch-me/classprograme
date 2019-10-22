package com.apple.book;

import com.apple.book.Dictionary;

public class Bookmanager {
    public static void main(String[] args){
//        Dictionary dictionary = new Dictionary();
//        dictionary.getBookId();
//        int pages = dictionary.pages;
        Book book = new Book("IBN001","test",90);
        System.out.println(book.toString());
        Dictionary dictionary = new Dictionary("IBN001","test",90,6);
        System.out.println(dictionary.toString());
        System.out.println(dictionary.getBookId());
        System.out.println(book.getBookId());

    }
}
