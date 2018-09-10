package rest.service.architecture.domain.film.service;

import rest.service.architecture.domain.core.Service;
import rest.service.architecture.domain.film.model.Film;
import rest.service.architecture.domain.film.repository.FilmRepository;

@org.springframework.stereotype.Service
public class FilmService extends Service<FilmRepository> {
    public Film getFilm(Integer id) {
        return this.repository.getFilm(id);
    }
}
