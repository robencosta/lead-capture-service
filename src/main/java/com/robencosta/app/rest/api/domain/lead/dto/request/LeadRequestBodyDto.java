package com.robencosta.app.rest.api.domain.lead.dto.request;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class LeadRequestBodyDto {
    
    @NotBlank(message = "The lead name is required.")
    @JsonProperty("name")
    private String name;

    @Email(message = "This is not valid email address.")
    @NotBlank(message = "The field lead email is required.")
    @JsonProperty("email")
    private String email;
}
