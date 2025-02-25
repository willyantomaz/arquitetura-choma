package system.scheduling.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import system.scheduling.model.domain.Provider;
import system.scheduling.model.service.ProviderService;
import system.scheduling.model.util.CrudController;

@RestController
@RequestMapping("/providers")
public class ProviderController extends CrudController<Provider, Long, ProviderService> {

    public ProviderController(ProviderService service) {
        super(service, Provider.class);
    }
}
