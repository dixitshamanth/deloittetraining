package com.mms.deloitte.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pms.deloitte.dao.MovieDAO;
import com.pms.deloitte.model.Movie;
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
	MovieDAO.save(movie);
	return "Saved Movie Successfully";
}

}


