package albasr.movierecord.api.impl;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import albasr.movierecord.Genre;
import albasr.movierecord.Movie;
import albasr.movierecord.api.MovieRecordService;
import albasr.movierecord.api.db.hibernate.HibernateGenreDAO;
import albasr.movierecord.api.db.hibernate.HibernateMovieDAO;

@Path("mrs")
public class MovieRecordServiceImpl implements MovieRecordService {
	HibernateGenreDAO hbGD=new HibernateGenreDAO();
	HibernateMovieDAO hbMD=new HibernateMovieDAO();
	
	@Override
	public void addGenre(Genre g) {
		hbGD.add(g);
	}

	@Override
	public ArrayList<Genre> viewAllGenre() {
		return hbGD.viewAll();
	}

	@Override
	public Genre searchGenre(int id) {
		return hbGD.search(id);
	}

	@Override
	public void updateGenre(int id, Genre mov) {
		hbGD.update(id, mov);		
	}

	@Override
	public void addMovie(Movie m) {
		hbMD.add(m);
	}

	@Override
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public ArrayList<Movie> viewAllMovie() {
		return hbMD.viewAll();
	}

	@Override
	public void deleteMovie(int id) {
		hbMD.delete(id);
	}

	@Override
	public Movie searchMovie(int id) {
		return hbMD.search(id);
	}

	@Override
	public void updateMovie(int id, Movie mov) {
		hbMD.update(id, mov);
	}
	
}
