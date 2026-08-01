package com.sagar.transalert.dto.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CustomerResponse {

    private Long id;

    private String customerNumber;

    private String firstName;

    private String lastName;

    private String email;

    private String phoneNumber;

    private Integer riskScore;
}