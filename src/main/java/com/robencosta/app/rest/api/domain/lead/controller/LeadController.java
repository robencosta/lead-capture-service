package com.robencosta.app.rest.api.domain.lead.controller;

import java.util.List;

import javax.validation.Valid;

import com.robencosta.app.rest.api.domain.lead.dto.request.LeadRequestBodyDto;
import com.robencosta.app.rest.api.domain.lead.dto.response.LeadResponseBodyDto;
import com.robencosta.app.rest.api.domain.lead.service.LeadService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@RequestMapping("leads")
@Log4j2
@AllArgsConstructor
public class LeadController {

    private final LeadService animeService;

    @GetMapping
    public ResponseEntity<List<LeadResponseBodyDto>> getLeads() {

        List<LeadResponseBodyDto> leadsDto = animeService.getLeads(null);

        if (leadsDto.isEmpty()) {
            log.debug("LeadsDto list is empty: {}", leadsDto);
            return ResponseEntity.notFound().build();
        }
        
        return ResponseEntity.ok(animeService.getLeads(null));
    }
    
    @PostMapping
    public ResponseEntity<LeadRequestBodyDto> 
    createLead(@Valid @RequestBody LeadRequestBodyDto leadDto) {
        
        return ResponseEntity.status(HttpStatus.CREATED)
                             .body(leadDto);
    }
}
