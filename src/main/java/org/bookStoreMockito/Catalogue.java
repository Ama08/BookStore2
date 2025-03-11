package org.bookStoreMockito;

import java.util.ArrayList;
import java.util.List;

public class Catalogue {
    private final ReadItemCommand readItemCommand;
    List<Book> bookList = new ArrayList<>();

    public Catalogue(ReadItemCommand readItemCommand) {
        this.readItemCommand = readItemCommand;
    }

    public List<Book> getAllBooks() {
        return readItemCommand.readAll();
    }
}
