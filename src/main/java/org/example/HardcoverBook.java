package org.example;

public class HardcoverBook extends Book{

    private int numberOfPages;

    public HardcoverBook(String title, String author, String genre, int numberOfPages) throws InvalidBookException {
        super(title, author, genre);
        if (numberOfPages < 1) {
            throw new InvalidBookException();
        }
        this.numberOfPages = numberOfPages;
    }
    public int getNumberOfPages() {
        return numberOfPages;
    }
    public void setNumberOfPages(int numberOfPages) {
        try {
            if (numberOfPages < 1){
                throw new InvalidBookException();
            }
            this.numberOfPages = numberOfPages;
        } catch (InvalidBookException e){
            System.out.println(e);
        }
    }

    public String toString() {
        return super.toString()+"\nNumber of pages: "+numberOfPages;
    }

    //Test Harness
    public static void main(String[] args) {
        HardcoverBook hcb;
        try {
            hcb = new HardcoverBook("Harry Potter and the Pot", "JK Rolfing", "Fantasy", 100);
            System.out.println(hcb.toString());
        } catch(InvalidBookException e){
            System.out.println("Hardcover book has caused an error: "+e);
        }
    }
}
