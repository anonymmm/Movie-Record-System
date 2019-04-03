package albasr.movierecord.api.db.hibernate;

import java.util.ArrayList;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import albasr.movierecord.Movie;
import albasr.movierecord.api.db.MovieDAO;

public class HibernateMovieDAO extends HibernateDAO implements MovieDAO{
	
	private Session session=this.hc.configure(Movie.class);
	
	@Override
	public void add(Movie m) {
		Transaction transaction= session.beginTransaction();
		session.save(m);
		transaction.commit();	
	}
	

	@Override
	public ArrayList<Movie> viewAll() {
		Transaction transaction= session.beginTransaction();
		Query query = session.createQuery("from albasr.movierecord.Movie"); 
		ArrayList<Movie> list = new ArrayList<Movie>(query.list());
		transaction.commit();	
		return list;
	}

	@Override
	public void delete(int id) {
		Transaction transaction= session.beginTransaction();
		session.delete(session.get(Movie.class, id));
//		Query query = session.createQuery("delete from movierecord where id=:theid"); 
//		query.setParameter("theid", id);
//		System.out.println(query.executeUpdate());
		transaction.commit();
	}

	@Override
	public Movie search(int id) {
		Transaction transaction= session.beginTransaction();
		Movie m=(Movie) session.get(Movie.class, id);
		transaction.commit();
		return m;
	}

	@Override
	public void update(int id, Movie mov) {
		Transaction transaction= session.beginTransaction();
		
		Query query = session.createSQLQuery("update movie set name=:n, description=:d, rating=:r, year=:y, genre_id=:g where id=:theid");
		query.setParameter("n", mov.getName());
		query.setParameter("d", mov.getDescription());
		query.setParameter("r", mov.getRating());
		query.setParameter("y", mov.getLaunchYear());
		query.setParameter("g", mov.getGenre());
		
		query.setParameter("theid", id);
		System.out.println(query.executeUpdate());
		transaction.commit();		
	}

}
