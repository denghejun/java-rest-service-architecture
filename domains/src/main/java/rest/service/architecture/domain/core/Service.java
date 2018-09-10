package rest.service.architecture.domain.core;

import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public abstract class Service<TRepository> {

    @Autowired
    protected TRepository repository;
}
