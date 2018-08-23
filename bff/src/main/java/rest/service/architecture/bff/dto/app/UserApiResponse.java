package rest.service.architecture.bff.dto.app;

import rest.service.architecture.domain.user.model.UserModel;

public class UserApiResponse {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public UserModel getModel() {
        return model;
    }

    public void setModel(UserModel model) {
        this.model = model;
    }

    private UserModel model;
}
