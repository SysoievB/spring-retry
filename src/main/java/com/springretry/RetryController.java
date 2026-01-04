package com.springretry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RetryController {

    private final ExternalApiService externalApiService;

    @Autowired
    public RetryController(ExternalApiService externalApiService) {
        this.externalApiService = externalApiService;
    }

    @GetMapping("/retry-test")
    public String retryTest() {
        return externalApiService.callExternalApi();
    }
}
