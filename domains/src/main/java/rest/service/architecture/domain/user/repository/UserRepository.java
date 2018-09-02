package rest.service.architecture.domain.user.repository;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import rest.service.architecture.domain.user.model.UserModel;

@Component
public class UserRepository {
    @Value("${spring.user.name}")
    private String name;

    public UserModel getAdmin() {
        UserModel model = new UserModel();
        model.setName(this.name);
        return model;
    }
}
