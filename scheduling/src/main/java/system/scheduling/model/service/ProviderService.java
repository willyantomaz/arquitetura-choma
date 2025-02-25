package system.scheduling.model.service;

import org.springframework.stereotype.Service;
import system.scheduling.model.domain.Provider;
import system.scheduling.model.repository.ProviderRepository;
import system.scheduling.model.util.CrudService;

@Service
public class ProviderService extends CrudService<Provider, Long> {
    public ProviderService(ProviderRepository repository) {
        super(repository);
    }
}
