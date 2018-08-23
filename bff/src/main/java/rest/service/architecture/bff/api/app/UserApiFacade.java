package rest.service.architecture.bff.api.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import rest.service.architecture.bff.core.RestApiResponse;
import rest.service.architecture.bff.dto.app.UserApiRequest;
import rest.service.architecture.bff.dto.app.UserApiResponse;
import rest.service.architecture.domain.user.User;
import rest.service.architecture.domain.user.model.UserModel;

@Component
public class UserApiFacade {

    @Autowired
    private User user;

    public RestApiResponse getAdmin(UserApiRequest request) {
        // 1. call domain
        UserModel model = this.user.getAdmin();

        // 2. return rest api response.
        UserApiResponse response = new UserApiResponse();
        response.setId(request.getId());
        response.setModel(model);
        return RestApiResponse.success(model);
    }
}
