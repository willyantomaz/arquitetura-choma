package system.scheduling.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import system.scheduling.model.domain.Appointment;
import system.scheduling.model.domain.Provider;
import system.scheduling.model.domain.User;
import system.scheduling.model.repository.AppointmentRepository;
import system.scheduling.model.repository.ProviderRepository;
import system.scheduling.model.repository.UserRepository;
import system.scheduling.model.util.CrudService;

@Service
public class AppointmentService extends CrudService<Appointment, Long> {

    private final UserRepository userRepository;
    private final ProviderRepository providerRepository;

    public AppointmentService(AppointmentRepository repository,
                              UserRepository userRepository,
                              ProviderRepository providerRepository) {
        super(repository);
        this.userRepository = userRepository;
        this.providerRepository = providerRepository;
    }

    @Override
    public void beforeSave(Appointment entity) {

        entity.setUser(findEntity(userRepository,
                entity.getUser().getId()));
        entity.setProvider(findEntity(providerRepository,
                entity.getProvider().getId()));

    }

    private <T> T findEntity(JpaRepository<T, Long> repository,
                             Long id) {

        return repository.findById(id).orElseThrow();

    }

}
