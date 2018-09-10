package rest.service.architecture.bff.api.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import rest.service.architecture.bff.core.RestApiResponse;
import rest.service.architecture.bff.dto.app.FilmApiRequest;
import rest.service.architecture.bff.dto.app.FilmApiResponse;
import rest.service.architecture.domain.film.FiveFilm;
import rest.service.architecture.domain.film.model.Film;

@Component
public class FiveFilmApiFacade {
    @Autowired
    private FiveFilm fiveFilm;

    public RestApiResponse getFilm(FilmApiRequest request) {
        // 1. call domain
        Film model = this.fiveFilm.getFilm(request.getId());

        // 2. return rest api response.
        FilmApiResponse response = new FilmApiResponse();
        response.setId(request.getId());
        response.setModel(model);
        return RestApiResponse.success(response);
    }
}
