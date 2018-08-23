package rest.service.architecture.domain.user;

import rest.service.architecture.domain.core.Domain;
import org.springframework.stereotype.Component;
import rest.service.architecture.domain.user.caching.UserCacheKeyEnum;
import rest.service.architecture.domain.user.caching.UserCaching;
import rest.service.architecture.domain.user.model.UserModel;
import rest.service.architecture.domain.user.service.UserService;

@Component
public class User extends Domain<UserService, UserCaching> {
    public UserModel getAdmin() {
        if (this.caching.has(UserCacheKeyEnum.Admin)) {
            return this.caching.get(UserCacheKeyEnum.Admin);
        } else {
            UserModel model = this.service.getAdmin();
            return this.caching.set(UserCacheKeyEnum.Admin, model);
        }
    }
}
