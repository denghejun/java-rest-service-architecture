package rest.service.architecture.domain.user.service;

import rest.service.architecture.domain.core.Service;
import rest.service.architecture.domain.user.model.UserModel;
import rest.service.architecture.domain.user.persistence.UserPersistence;

@org.springframework.stereotype.Service
public class UserService extends Service<UserPersistence> {
    public UserModel getAdmin() {
        return this.persistence.getAdmin();
    }
}
