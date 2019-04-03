package albasr.movierecord.api.db;
import java.util.ArrayList;

import albasr.movierecord.*;


public interface MovieDAO {
	public void add(Movie m);
	public ArrayList<Movie> viewAll();
	public void delete(int id);
	public Movie search(int id);
	public void update(int id,Movie mov);

}
