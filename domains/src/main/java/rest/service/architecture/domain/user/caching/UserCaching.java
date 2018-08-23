package rest.service.architecture.domain.user.caching;

import rest.service.architecture.domain.core.Caching;
import org.springframework.stereotype.Component;

@Component
public class UserCaching extends Caching<UserCacheKeyEnum> {
}
