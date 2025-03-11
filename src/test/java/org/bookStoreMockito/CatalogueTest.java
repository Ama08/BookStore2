package org.bookStoreMockito;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class CatalogueTest {
    private Catalogue catalogue;
    private List<Book> books;

    @Mock
    private ReadItemCommand readItemCommand;


    @Mock
    private Book book1;

    @Mock
    private Book book2;


    @BeforeEach
    void setUp(){
       catalogue = new Catalogue(readItemCommand);
    }

    @Test
    public void getAllBooks_ReturnsEmptyBookList_IfNoBooksAreInTheCatalogue(){
        List<Book> books = catalogue.getAllBooks();
        assertEquals(0, books.size());
    }

    @Test
    public void getAllBooks_CallsReadAllMethodOfReadItemCommand_WhenCalled(){
        catalogue.getAllBooks();

        verify(readItemCommand, times(1)).readAll();
    }

    

}
