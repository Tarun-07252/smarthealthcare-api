package com.example.newprg1.controller;

import com.example.newprg1.model.Appointment;
import com.example.newprg1.service.AppointmentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/appointments")
public class AppointmentController {

    private final AppointmentService service;

    public AppointmentController(AppointmentService service) {
        this.service = service;
    }

    @PostMapping
    public Appointment addAppointment(@RequestBody Appointment appointment) {
        return service.saveAppointment(appointment);
    }

    @GetMapping
    public List<Appointment> getAppointments() {
        return service.getAllAppointments();
    }
}
