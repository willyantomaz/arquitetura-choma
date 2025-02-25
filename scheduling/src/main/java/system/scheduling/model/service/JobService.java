package system.scheduling.model.service;

import system.scheduling.model.domain.Job;
import system.scheduling.model.repository.JobRepository;
import system.scheduling.model.util.CrudService;

public class JobService extends CrudService<Job, Long> {
    public JobService(JobRepository repository) {
        super(repository);
    }
}
