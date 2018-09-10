package rest.service.architecture.domain.film;

import org.springframework.stereotype.Component;
import rest.service.architecture.domain.core.Domain;
import rest.service.architecture.domain.film.caching.FilmCacheKeyEnum;
import rest.service.architecture.domain.film.caching.FilmCaching;
import rest.service.architecture.domain.film.model.Film;
import rest.service.architecture.domain.film.service.FilmService;

@Component
public class FiveFilm extends Domain<FilmService, FilmCaching> {
    public Film getFilm(Integer id) {
        if (this.caching.has(FilmCacheKeyEnum.Admin)) {
            return this.caching.get(FilmCacheKeyEnum.Admin);
        } else {
            Film film = this.service.getFilm(id);
            return this.caching.set(FilmCacheKeyEnum.Admin, film);
        }
    }
}
