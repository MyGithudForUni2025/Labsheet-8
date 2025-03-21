package org.example;
import java.util.ArrayList;

public class Library {
    private String libraryName;
    private ArrayList<Book> books = new ArrayList<Book>();
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
        try {
            books.add(book);
        }catch(Exception ex) {
            System.out.println(ex);
        }
    }
    public Book findBook(String title){
        for (int i = 0; i<books.size(); i++){
            if (books.get(i).getTitle().equalsIgnoreCase(title)){
                return books.get(i);
            }
        }
        return null;
    }
    public void removeBook(String title){
        for (int i = 0; i<books.size(); i++){
            if (books.get(i).getTitle().equalsIgnoreCase(title)){
                books.remove(i);
            }
        }
    }

    public String toString() {
        String message = libraryName+"\n\nBook Collection:";
        for (int i = 0; i<books.size();i++){
            message += books.get(i).toString();
        }
        return message;
    }

    // Test Harness
    public static void main(String[] args) {
        HardcoverBook hcb;
        EBook eb;
        Library library;
        try {
            hcb = new HardcoverBook("Harry Potter and the Pot", "JK Rolfing", "Fantasy", 100);
            eb = new EBook("Parry Hotter and the Hot", "RK Jolfing", "Science_fiction", 100);

            library = new Library("Norwich Library");
            library.addBook(hcb);
            library.addBook(eb);

            System.out.println(library.toString());
        } catch(InvalidBookException e){
            System.out.println("A Book has caused an error: "+e);
        }
    }
}
