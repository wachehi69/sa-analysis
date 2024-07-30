package com.madjikha.fr.sa;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "sa", produces = MediaType.APPLICATION_JSON_VALUE)
public class SaController {

    @GetMapping
    List<Object> search(){
    return List.of(new sa(1, "Belle formation", 1));
    }
}
