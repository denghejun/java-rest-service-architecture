package rest.service.architecture.domain.film.caching;

import org.springframework.stereotype.Component;
import rest.service.architecture.domain.core.Caching;

@Component
public class FilmCaching extends Caching<FilmCacheKeyEnum> {
}
