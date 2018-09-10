package rest.service.architecture.domain.film.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import rest.service.architecture.domain.film.model.Film;
import rest.service.architecture.domain.film.model.FilmExample;
import rest.service.architecture.domain.film.model.FilmMapper;

import java.util.List;

@Component
public class FilmRepository {

    private FilmMapper filmMapper;

    @Autowired
    public FilmRepository(FilmMapper filmMapper) {
        this.filmMapper = filmMapper;
    }

    public Film getFilm(Integer id) {
        FilmExample example = new FilmExample();
        example.createCriteria().andIdEqualTo(id);
        List<Film> filmList = this.filmMapper.selectByExample(example);
        return filmList.isEmpty() ? null : filmList.get(0);
    }
}
