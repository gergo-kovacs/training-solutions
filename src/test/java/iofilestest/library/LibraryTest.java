package iofilestest.library;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.File;
import java.nio.file.Path;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest<TemporaryFolder> {


    @Test
    public void incorrectTitleOrAuthor() throws IllegalArgumentException{
        Exception ex = assertThrows(IllegalArgumentException.class, () -> new Book("",""));
        Assertions.assertEquals("author or title is invalid",ex.getMessage());
    }


    @TempDir
    public File file;
    private Library library = new Library();

    @BeforeEach
    public void init(){

        library.add(new Book("X. N.","AZ"),new Book("H. T.","EZ"));
    }

    @Test
    void addTest() throws IllegalArgumentException {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> library.add(new Book("X. N.","AZ")));
        Assertions.assertEquals("Book is already in list",ex.getMessage());
    }

    @Test
    public void readTestIfNullPath() throws NullPointerException{
        Exception ex = assertThrows(NullPointerException.class, () -> library.loadBooks(null));
        Assertions.assertEquals("Path is null!",ex.getMessage());
    }

    @Test
    public void readTestIfWrongPath() throws IllegalStateException{
        Exception ex = assertThrows(IllegalStateException.class, () -> library.loadBooks(Path.of("false.txt")));
        Assertions.assertEquals("Can not read file",ex.getMessage());
    }


}