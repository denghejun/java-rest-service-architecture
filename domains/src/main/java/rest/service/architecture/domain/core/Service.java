package rest.service.architecture.domain.core;

import org.springframework.beans.factory.annotation.Autowired;

public abstract class Service<TPersistence> {

    @Autowired
    protected TPersistence persistence;
}
