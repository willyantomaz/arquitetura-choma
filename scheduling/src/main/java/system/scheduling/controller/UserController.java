package system.scheduling.controller;

import system.scheduling.model.domain.User;
import system.scheduling.model.service.UserService;
import system.scheduling.model.util.CrudController;

public class UserController extends CrudController<User, Long, UserService> {
    public UserController(UserService service) {
        super(service);
    }
}
