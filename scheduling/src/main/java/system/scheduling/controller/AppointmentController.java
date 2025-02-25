package system.scheduling.controller;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import system.scheduling.model.domain.Appointment;
import system.scheduling.model.service.AppointmentService;
import system.scheduling.model.util.CrudController;

@RestController
@RequestMapping("/appointments")
public class AppointmentController extends CrudController<Appointment, Long, AppointmentService> {
    public AppointmentController(AppointmentService service) {
        super(service, Appointment.class);
    }
}
