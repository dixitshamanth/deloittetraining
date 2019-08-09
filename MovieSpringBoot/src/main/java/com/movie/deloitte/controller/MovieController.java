package com.movie.deloitte.controller;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movie.deloitte.dao.MovieDAO;
import com.movie.deloitte.model.Movie;
@RestController
public class MovieController {
	
@Autowired
MovieDAO movieDAO;
@RequestMapping("/getMovie")
	public String getMovie() {
		return "Getting Movie";
	}
@RequestMapping("/saveMovie")
public String saveMovie() {
	Movie movie=new Movie(1,"ZNMD","Farhan",250000);
	movieDAO.save(movie);
	
	return "Saved Movie Successfully";
}

}


