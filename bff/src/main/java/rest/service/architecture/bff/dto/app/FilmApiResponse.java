package rest.service.architecture.bff.dto.app;

import rest.service.architecture.domain.film.model.Film;

public class FilmApiResponse {
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Film getModel() {
        return model;
    }

    public void setModel(Film model) {
        this.model = model;
    }

    private Film model;
}
