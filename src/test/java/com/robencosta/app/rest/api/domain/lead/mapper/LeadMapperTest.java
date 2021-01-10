package com.robencosta.app.rest.api.domain.lead.mapper;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import com.robencosta.app.rest.api.domain.lead.dto.response.LeadResponseBodyDto;
import com.robencosta.app.rest.api.domain.lead.mock.LeadMock;
import com.robencosta.app.rest.api.domain.lead.model.Lead;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT, classes = LeadMapperTest.class)
public class LeadMapperTest {
    
    @Test
    public void shouldReturnsLeadsDtoListFromLeadsList() {
        
        List<Lead> leads = LeadMock.getInstance().getLeads();

        List<LeadResponseBodyDto> leadsDto = LeadMapper.INSTANCE.leadsToLeadsDto(leads);
        
        assertNotNull(leadsDto);
        assertEquals(10, leadsDto.size());
        
        for (int i = 0; i < leads.size(); i++) {
            
            assertEquals(leads.get(i).getId(), leadsDto.get(i).getId());
            assertEquals(leads.get(i).getName(), leadsDto.get(i).getName());
            assertEquals(leads.get(i).getCreatedAt(), leadsDto.get(i).getCreatedAt());   
        }
    }
}
