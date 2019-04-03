package albasr.movierecord.api.db.hibernate;

import java.util.ArrayList;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import albasr.movierecord.Genre;
import albasr.movierecord.Movie;
import albasr.movierecord.api.db.GenreDAO;

public class HibernateGenreDAO extends HibernateDAO implements GenreDAO {
	private Session session=this.hc.configure(Genre.class);

	@Override
	public void add(Genre g) {
		Transaction transaction= session.beginTransaction();
		session.save(g);
		transaction.commit();
	}

	@Override
	public ArrayList<Genre> viewAll() {
		Transaction transaction= session.beginTransaction();
		Query query = session.createQuery("from albasr.movierecord.Genre"); 
		ArrayList<Genre> list = new ArrayList<Genre>(query.list());
		transaction.commit();	
		return list;
	}

	@Override
	public Genre search(int id) {
		Transaction transaction= session.beginTransaction();
		Genre m=(Genre) session.get(Genre.class, id);
		transaction.commit();
		return m;
	}

	@Override
	public void update(int id, Genre g) {
		Transaction transaction = session.beginTransaction();
		Genre gstr=(Genre)session.get(Genre.class, id);
		gstr.setGenre(g.getGenre());
		session.update(gstr);
		transaction.commit();		
	}
	
//	@Override
//	public void delete(int id) {
//		Transaction transaction= session.beginTransaction();
//		session.delete(session.get(Genre.class, id));
//		transaction.commit();
//	}
	
}
