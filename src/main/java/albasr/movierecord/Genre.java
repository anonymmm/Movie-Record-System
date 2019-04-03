package albasr.movierecord;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="genre")
public class Genre {
	@Id
	private int id;
	private String genre;
	private Set movies;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
		
	
	public void setGenre(String genre) {
		this.genre=genre;
	}
	
	public String getGenre() {
		return this.genre;
	}
	
	public Set getMovies() {
		return movies;
	}
	
	public void setMovies(Set movies) {
		this.movies = movies;
	}

}
	 