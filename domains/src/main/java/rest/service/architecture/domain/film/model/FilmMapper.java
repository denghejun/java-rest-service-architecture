package rest.service.architecture.domain.film.model;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import rest.service.architecture.domain.film.model.Film;
import rest.service.architecture.domain.film.model.FilmExample;

import java.util.List;

public interface FilmMapper {
    long countByExample(FilmExample example);

    int deleteByExample(FilmExample example);

    int insert(Film record);

    int insertSelective(Film record);

    List<Film> selectByExample(FilmExample example);

    int updateByExampleSelective(@Param("record") Film record, @Param("example") FilmExample example);

    int updateByExample(@Param("record") Film record, @Param("example") FilmExample example);
}