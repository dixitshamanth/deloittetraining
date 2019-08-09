package com.movie.deloitte.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



import com.movie.deloitte.model.Movie;
@Repository
public interface MovieDAO extends CrudRepository<Movie, Integer>{

}
