package org.example;

public abstract class Book {
    public enum Genre {NON_FICTION, FANTASY, SCIENCE_FICTION, MYSTERY};

    protected String title, author;
    protected Genre genre;

    public Book(String title, String author, String genre){
        this.title = title;
        this.author = author;
        this.genre = Genre.valueOf(genre.toUpperCase());
    }

    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public Genre getGenre() {
        return genre;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public String toString() {
        return "\nTitle: "+title+"\nAuthor: "+author+"\nGenre"+genre;
    }
}