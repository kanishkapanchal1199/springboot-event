package com.example.springboot_event.handler;

import com.example.springboot_event.event.PatientDischargeEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class MedicalRecordsServiceHandler {

    @Async
    @EventListener
    public void updatePatientHistory(PatientDischargeEvent event) {
        // Update medical records
        System.out.println("Medical Records Service: Updating records for patient "
                +event.getPatientId()+" : "+Thread.currentThread().getName());
    }
}
