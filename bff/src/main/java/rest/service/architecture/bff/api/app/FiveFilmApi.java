package rest.service.architecture.bff.api.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rest.service.architecture.bff.core.RestApi;
import rest.service.architecture.bff.core.RestApiResponse;
import rest.service.architecture.bff.dto.app.FilmApiRequest;


@RestController
@RequestMapping(value = "/app/film")
public class FiveFilmApi extends RestApi<FiveFilmApiFacade> {

    @GetMapping("/{id}")
    public RestApiResponse getFilm(FilmApiRequest request) {
        return this.facade.getFilm(request);
    }
}
