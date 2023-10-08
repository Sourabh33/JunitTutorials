package org.example.service.voidtest;

import org.example.dao.BookDao;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockedStatic;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.anyString;

public class BookDaoVoidExample {

    @Mock
    BookDao bookDao;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testVoidMethod_withDoNothing() {
        Mockito.doNothing()
                .when(bookDao).saveBook(anyString(), anyInt());

        bookDao.saveBook("book", 1);
        Mockito.verify(bookDao).saveBook(anyString(), anyInt());
    }

    @Test
    public void testVoidMethod_withDoThrow() {
        Mockito.doThrow(NullPointerException.class)
                .when(bookDao).saveBook(anyString(), anyInt());

        Assertions.assertThrows(NullPointerException.class, () -> {
            bookDao.saveBook("book", 1);
        });
    }

    @Test
    public void testVoidMethod_withDoAnswer() {
        Mockito.doAnswer(invocation -> {
            String bookName = invocation.getArgument(0);
            Integer index = invocation.getArgument(1);

            Assertions.assertEquals(bookName, "book");
            Assertions.assertEquals(index, 1);
            return null;
        }).when(bookDao).saveBook(anyString(), anyInt());

        bookDao.saveBook("book", 1);
    }

    @Test
    public void testVoidMethod_withDoCallRealMethod() {
        Mockito.doCallRealMethod()
                .when(bookDao).saveBook(anyString(), anyInt());

        bookDao.saveBook("book", 1);
        Mockito.verify(bookDao).saveBook(anyString(), anyInt());
    }

    @Test
    public void testBookNameStaticMethod() {
        Assertions.assertEquals(BookDao.bookName(), "book");

        try(MockedStatic<BookDao> bookDaoMockedStatic = Mockito.mockStatic(BookDao.class)) {
            bookDaoMockedStatic.when(BookDao::bookName).thenReturn("Another book");
            Assertions.assertEquals(BookDao.bookName(), "Another book");
        }

        Assertions.assertEquals(BookDao.bookName(), "book");

    }
}
