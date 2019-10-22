package com.apple.book;

public class Dictionary extends Book{
    private int bushouPages;

    public Dictionary(String bookId, String bookname, int pages, int bushouPages) {
        super(bookId, bookname, pages);
        this.bushouPages = bushouPages;
    }

    //id=D001+INB001
    @Override
    public String getBookId() {
        return "D001"+super.getBookId();
    }

    public int getBushouPages() {
        return bushouPages;
    }

    public void setBushouPages(int bushouPages) {
        this.bushouPages = bushouPages;
    }

    public String toString(){
        return  super.toString() + "," + this.bushouPages;
    }
}
