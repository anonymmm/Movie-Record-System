package albasr.movierecord.api.db;

import java.util.ArrayList;

import albasr.movierecord.Genre;

public interface GenreDAO {
	public void add(Genre m);
	public ArrayList<Genre> viewAll();
	public Genre search(int id);
	public void update(int id,Genre mov);
//	public void delete(int id);

}
