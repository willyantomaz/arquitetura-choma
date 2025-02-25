package system.scheduling.controller;

import system.scheduling.model.domain.Job;
import system.scheduling.model.service.JobService;
import system.scheduling.model.util.CrudController;

public class JobController extends CrudController<Job, Long, JobService> {
    public JobController(JobService service) {
        super(service, Job.class);
    }
}
