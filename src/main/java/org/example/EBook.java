package org.example;

public class EBook extends Book{
    private double fileSizeMB;

    public EBook(String title, String author, String genre, double fileSizeMB) {
        super(title, author, genre);
        try {
            if (fileSizeMB < 1) {
                throw new InvalidBookException();
            }
            this.fileSizeMB = fileSizeMB;
        } catch (InvalidBookException e) {
            System.out.println("EBook has caused an error: " + e);
        }
    }

    public double getFileSizeMB() {
        return fileSizeMB;
    }
    public void setFileSizeMB(double fileSizeMB) {
        this.fileSizeMB = fileSizeMB;
    }
}
