package system.scheduling.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import system.scheduling.model.domain.Schedule;
import system.scheduling.model.service.ScheduleService;
import system.scheduling.model.util.CrudController;

@RestController
@RequestMapping("/schedules")
public class ScheduleController extends CrudController<Schedule, Long, ScheduleService> {
    public ScheduleController(ScheduleService service) {
        super(service, Schedule.class);
    }
}
