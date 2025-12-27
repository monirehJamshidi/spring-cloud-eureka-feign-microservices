package org.j2os;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
public class BookController {

    @GetMapping("/books")
    public ResponseEntity<List<String>> getBookList(){
        return ResponseEntity.ok(BookService.getBookList());
    }

    public ResponseEntity<List<String>> getBooksList1(@RequestParam Long num){
        log.info("num: " + num);
        return ResponseEntity.ok(BookService.getBookList());
    }

}
