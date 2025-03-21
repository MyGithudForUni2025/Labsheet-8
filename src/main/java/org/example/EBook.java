package org.example;

public class EBook extends Book{
    private double fileSizeMB;

    public EBook(String title, String author, String genre, double fileSizeMB) throws InvalidBookException{
        super(title, author, genre);
        if (fileSizeMB < 1) {
            throw new InvalidBookException();
        }
        this.fileSizeMB = fileSizeMB;
    }

    public double getFileSizeMB() {
        return fileSizeMB;
    }
    public void setFileSizeMB(double fileSizeMB) {
        this.fileSizeMB = fileSizeMB;
    }

    public String toString() {
        return super.toString()+"\nFile size of E-Book: "+fileSizeMB+"MB";
    }

    // Test Harness
    public static void main(String[] args) {
        EBook eb;
        try {
            eb = new EBook("Parry Hotter and the Hot", "RK Jolfing", "Science_fiction", 100);
            System.out.println(eb.toString());
        } catch (InvalidBookException e) {
            System.out.println("EBook has caused an error: " + e);
        }
    }
}
