package system.scheduling.model.service;

import system.scheduling.model.domain.User;
import system.scheduling.model.repository.UserRepository;
import system.scheduling.model.util.CrudService;

public class UserService extends CrudService<User, Long> {
    public UserService(UserRepository repository) {
        super(repository);
    }
}
