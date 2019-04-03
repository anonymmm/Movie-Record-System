package albasr.movierecord;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
@Table(name="movie")
public class Movie {
	
	@Id
	private int id;
	
	private String name;	
	private String description;
	private int rating;
	private int launchyear;
	
	@ManyToOne
	private Genre genre;
	
	
	
	public int getId() {return id;	}
	public void setId(int id) {this.id = id;}
	
	public String getName() {return name;}
	public void setName(String name) {	this.name=name;	}
	
	public Genre getGenre() {return this.genre;}
	public void setGenre(Genre genre) {	
		this.genre=genre;	
		}
	
	public String getDescription() {return description;	}
	public void setDescription(String desription) {this.description=desription;	}
	
	public int getRating() {return rating;	}
	public void setRating(int rating) {this.rating=rating;	}
	
	public int getLaunchYear() {return launchyear;	}
	public void setLaunchYear(int launchyear) {this.launchyear=launchyear;	}
}
