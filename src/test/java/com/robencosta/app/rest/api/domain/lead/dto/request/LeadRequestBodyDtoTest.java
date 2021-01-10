package com.robencosta.app.rest.api.domain.lead.dto.request;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.robencosta.app.rest.api.domain.lead.dto.mock.LeadRequestBodyDtoMock;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class LeadRequestBodyDtoTest {
    
    @Test
    public void shouldReturnsALeadObject() {
        
        LeadRequestBodyDto leadRequestBodyDto = LeadRequestBodyDtoMock
            .getInstance()
            .getOneLead(); 
        
        assertNotNull(leadRequestBodyDto);
    }
}
