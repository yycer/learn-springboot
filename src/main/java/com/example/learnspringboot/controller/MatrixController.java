package com.example.learnspringboot.controller;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Frankie
 * @since 2022-01-24 9:02 AM
 */
@RestController
public class MatrixController {

    @GetMapping("v1/matrix/{path}")
    public String testMatrixVariable(@PathVariable("path") String path,
                                     @MatrixVariable("height") double height,
                                     @MatrixVariable("weight") int weight) {
        Map<String, Object> map = new HashMap<>();
        map.put("path", path);
        map.put("height", height);
        map.put("weight", weight);
        return map.toString(); // {path=path, weight=115, height=170.5}
    }
}
