package rest.service.architecture.bff.core;

import org.springframework.beans.factory.annotation.Autowired;

public abstract class RestApi<TFacade> {

    @Autowired
    protected TFacade facade;
}
