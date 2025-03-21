package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestHardcoverBook {

    private HardcoverBook testHCD;

    @BeforeEach
    public void setUp(){
        try {
            testHCD = new HardcoverBook("Harry Potter and the Pot", "JK Rolfing", "Fantasy", 100);
        } catch (InvalidBookException e){
            System.out.println(e);
        }
    }

    @Test
    @DisplayName("Make sure the book has valid amount of pages")
    public void settingPages(){
        Assertions.assertEquals("\n\nTitle: Harry Potter and the Pot\nAuthor: JK Rolfing\nGenre: FANTASY\nNumber of pages: 100",testHCD.toString());
    }
}
