package com.senac.TesteCache;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TesteCacheController {
    private final TesteCacheService testeCacheService;

    @Autowired
    public TesteCacheController(TesteCacheController testeCacheService){
        this.testeCacheService = testeCacheService;
    }

    @GetMapping("/getCacheValor"){
        public String getCacheValor(@RequestParam String key){
            return testeCacheService.getValor(key);
        }
    }
    @PostMapping("/limparCache"){
        public void clearCache();
    }


}
