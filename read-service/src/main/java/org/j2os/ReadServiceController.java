package org.j2os;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequiredArgsConstructor
@Slf4j
public class ReadServiceController {

    private final BookClient bookClient;
    private final CarClient carClient;

    @GetMapping("/execute")
    public ResponseEntity<List<String>> getBookCarList() {
        log.info("-- start execute --");

        List<String> list = new ArrayList<>();
        list.addAll(bookClient.getBookList());
        list.addAll(carClient.getCars());

        log.info("-- execute successful done --");

        return ResponseEntity.ok(list);
    }
}
