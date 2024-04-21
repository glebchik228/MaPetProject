package com.example.authregserv.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/party")
@RequiredArgsConstructor
public class DemoController {
    @GetMapping("/club")
    public ResponseEntity<String> welcome() {
        return ResponseEntity.ok("WELCOME TO THE CLUB, BODY");
    }
}
