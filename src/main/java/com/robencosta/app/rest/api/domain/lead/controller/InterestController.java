package com.robencosta.app.rest.api.domain.lead.controller;

import java.util.List;

import com.robencosta.app.rest.api.domain.lead.model.Interest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("interests")
public class InterestController {
    
    @GetMapping
    public ResponseEntity<List<Interest>> getInterests() {
        return ResponseEntity.ok().build();
    }
}
