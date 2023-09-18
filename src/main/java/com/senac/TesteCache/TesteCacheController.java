package com.senac.TesteCache;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class TesteCacheController {


    private final TesteCacheService testeCacheService;

    public TesteCacheController(){
        testeCacheService = null;
    }
}
