package com.robencosta.app.rest.api.domain.lead.mock;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import com.robencosta.app.rest.api.domain.lead.model.Lead;

public final class LeadMock {
    
    private static final LocalDateTime NOW = LocalDateTime.now();
    private static final LeadMock INSTANCE = new LeadMock();

    private LeadMock() {
    }

    public List<Lead> getLeads() {
        
        return Arrays.asList(
                
                Lead.builder()
                    .name("Ana Maria de Souza Lima")
                    .email("ana.souza@gmail.com")
                    .id(1001L)
                    .createdAt(NOW)
                    .build()
        );
    }

    public static LeadMock getInstance() {
        return INSTANCE;
    }
}
