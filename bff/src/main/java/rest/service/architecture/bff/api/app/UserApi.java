package rest.service.architecture.bff.api.app;

import org.springframework.web.bind.annotation.*;
import rest.service.architecture.bff.core.RestApi;
import rest.service.architecture.bff.core.RestApiResponse;
import rest.service.architecture.bff.dto.app.UserApiRequest;


@RestController
@RequestMapping(value = "/app/user")
public class UserApi extends RestApi<UserApiFacade> {

    @GetMapping("/{userId}")
    public RestApiResponse getUser(UserApiRequest request) {
        return this.facade.getAdmin(request);
    }
}
