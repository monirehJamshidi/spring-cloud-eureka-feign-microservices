package org.j2os;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class BookService {
    private static List<String> bookList = Arrays.asList("Book11","Book22","Book33");

    public static List<String> getBookList() {
        return bookList;
    }
}
