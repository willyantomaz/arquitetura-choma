package system.scheduling.model.service;

import org.springframework.stereotype.Service;
import system.scheduling.model.domain.Appointment;
import system.scheduling.model.repository.AppointmentRepository;
import system.scheduling.model.util.CrudService;

@Service
public class AppointmentService extends CrudService<Appointment, Long> {
    public AppointmentService(AppointmentRepository repository) {
        super(repository);
    }
}
