package rest.service.architecture.domain.user.service;

import rest.service.architecture.domain.core.Service;
import rest.service.architecture.domain.user.model.UserModel;
import rest.service.architecture.domain.user.repository.UserRepository;

@org.springframework.stereotype.Service
public class UserService extends Service<UserRepository> {
    public UserModel getAdmin() {
        return this.repository.getAdmin();
    }
}
