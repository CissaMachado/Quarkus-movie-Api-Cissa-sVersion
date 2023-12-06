package br.com.mp.quarkusmovie.resources.repository;

import br.com.mp.quarkusmovie.resources.model.Movie;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.quarkus.panache.common.Parameters;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.List;

@ApplicationScoped
public class MovieRepository implements PanacheRepository<Movie> {

    public List<Movie> list(){
        return listAll();
    }

    public Movie findyIMDBID(String imdbId) {
        return find( "imdbId", imdbId).firstResult();
    }

    public List<Movie> listBestRated() {
        Long value = 4000L;
        return find("rank < :value", Parameters.with("value",value)).list();
    }
}
