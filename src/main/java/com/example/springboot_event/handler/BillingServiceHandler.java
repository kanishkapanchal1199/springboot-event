package com.example.springboot_event.handler;



import com.example.springboot_event.event.PatientDischargeEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class BillingServiceHandler {

    @EventListener
    @Async
    public void processBill(PatientDischargeEvent patientDischargeEvent) {
        // Finalize billing details
        System.out.println("Billing Service: Finalizing bill for patient "
                +patientDischargeEvent.getPatientId()+" : "+Thread.currentThread().getName());
    }
}