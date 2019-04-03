package albasr.movierecord.api;

import java.util.ArrayList;

import albasr.movierecord.Genre;
import albasr.movierecord.Movie;

public interface MovieRecordService {

	
	public void addGenre(Genre g);
	public ArrayList<Genre> viewAllGenre();
	public Genre searchGenre(int id);
	public void updateGenre(int id,Genre mov);
	
	public void addMovie(Movie m);
	public ArrayList<Movie> viewAllMovie();
	public void deleteMovie(int id);
	public Movie searchMovie(int id);
	public void updateMovie(int id,Movie mov);
}
