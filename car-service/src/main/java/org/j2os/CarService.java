package org.j2os;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class CarService {
    private static List<String> bookList = Arrays.asList("BMW","BENZ","KIA");

    public static List<String> getCarList() {
        return bookList;
    }

}
