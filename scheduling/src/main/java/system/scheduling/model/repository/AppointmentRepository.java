package system.scheduling.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import system.scheduling.model.domain.Appointment;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
}
