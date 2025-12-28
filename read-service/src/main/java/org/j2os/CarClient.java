package org.j2os;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient("car-service")
public interface CarClient {

    @GetMapping("/cars")
    List<String> getCars();
}
