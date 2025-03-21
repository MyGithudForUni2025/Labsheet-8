package org.example;

public class HardcoverBook extends Book{

    private int numberOfPages;

    public HardcoverBook(String title, String author, String genre, int numberOfPages){
        super(title, author, genre);
        try {
            if (numberOfPages < 1) {
                throw new InvalidBookException();
            }
            this.numberOfPages = numberOfPages;
        } catch (InvalidBookException e){
            System.out.println("Hardcover book has caused an error: "+e);
        }
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }
    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }
}
