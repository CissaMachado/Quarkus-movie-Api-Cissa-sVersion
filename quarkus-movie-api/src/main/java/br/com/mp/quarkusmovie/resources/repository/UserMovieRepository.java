package br.com.mp.quarkusmovie.resources.repository;


import br.com.mp.quarkusmovie.resources.model.UserMovie;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class UserMovieRepository implements PanacheRepository<UserMovie> {
}