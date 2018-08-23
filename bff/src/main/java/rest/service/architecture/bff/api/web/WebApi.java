package rest.service.architecture.bff.api.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rest.service.architecture.bff.api.app.UserApiFacade;
import rest.service.architecture.bff.core.RestApi;
import rest.service.architecture.bff.core.RestApiResponse;
import rest.service.architecture.bff.dto.app.UserApiRequest;

@RestController
@RequestMapping(value = "/web/user")
public class WebApi extends RestApi<UserApiFacade> {

    @GetMapping("/{id}")
    public RestApiResponse getUser(UserApiRequest request) {
        return this.facade.getAdmin(request);
    }
}
