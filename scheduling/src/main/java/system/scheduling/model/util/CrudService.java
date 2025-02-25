package system.scheduling.model.util;

import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;


public abstract class CrudService<T, ID> {

    protected final JpaRepository<T, ID> repository;

    public CrudService(JpaRepository<T, ID> repository) {
        this.repository = repository;
    }

    public T save(T entity) {
        return repository.save(entity);
    }

    public Optional<T> findById(ID id) {
        return repository.findById(id);
    }

    public List<T> findAll() {
        return repository.findAll();
    }

    public T update(ID id, T entity) {
        if (!repository.existsById(id)) {
            throw new RuntimeException("Registro não encontrado");
        }
        return repository.save(entity);
    }

    public void delete(ID id) {
        if (!repository.existsById(id)) {
            throw new RuntimeException("Registro não encontrado");
        }
        repository.deleteById(id);
    }
}
