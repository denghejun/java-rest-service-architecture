package rest.service.architecture.domain.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public abstract class Domain<TService extends Service, TCaching extends Caching> {

    @Autowired
    protected TCaching caching;

    @Autowired
    protected TService service;
}
