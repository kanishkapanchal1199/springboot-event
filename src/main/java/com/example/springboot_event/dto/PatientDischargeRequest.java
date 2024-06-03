package com.example.springboot_event.dto;

import lombok.Data;

@Data
public class PatientDischargeRequest {

    private String patientId;
    private String patientName;
}
