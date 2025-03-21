package org.example;
import java.util.ArrayList;

public class Library {
    private String libraryName;
    private ArrayList<Book> books;

    //constructor
    public Library(String libraryName){
        this.libraryName = libraryName;
    }

    //accessor methods
    public String getLibraryName() {
        return libraryName;
    }
    public void setLibraryName(String libraryName) {
        this.libraryName = libraryName;
    }

    //additional methods
    public void addBook(Book book){
        books.add(book);
    }
    public Book findBook(String title){
        for (int i = 0; i<books.size(); i++){
            if (books.get(i).getTitle().equalsIgnoreCase(title)){
                return books.get(i);
            }
        }
        return null;
    }

}
