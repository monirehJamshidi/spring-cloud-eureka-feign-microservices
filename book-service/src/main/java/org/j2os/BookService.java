package org.j2os;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class BookService {
    private static List<String> bookList = Arrays.asList("Book1", "Book2", "Book3");

    public static List<String> getBookList() {
        return bookList;
    }
}
