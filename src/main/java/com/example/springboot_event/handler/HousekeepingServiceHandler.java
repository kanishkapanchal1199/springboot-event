package com.example.springboot_event.handler;

import com.example.springboot_event.event.PatientDischargeEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class HousekeepingServiceHandler {

    @Async
    @EventListener
    public void cleanAndAssign(PatientDischargeEvent event) {
        // Prepare the room for the next patient
        System.out.println("Housekeeping Service: Preparing room for next patient after discharge of "
                +event.getPatientName()+" : "+Thread.currentThread().getName());
    }
}
