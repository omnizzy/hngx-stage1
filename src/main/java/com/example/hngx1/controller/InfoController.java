package com.example.hngx1.controller;

import com.example.hngx1.service.InfoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequiredArgsConstructor
public class InfoController {
    private final InfoService infoService;

    @GetMapping("/api")
    public Map<String, Object> getInfo(
            @RequestParam String slackName,
            @RequestParam String track
    ) {
        return infoService.getInfo(slackName, track);
    }
}
