package system.scheduling.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import system.scheduling.model.domain.Provider;

public interface ProviderRepository extends JpaRepository<Provider, Long> {
}
