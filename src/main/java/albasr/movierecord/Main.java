package albasr.movierecord;
import albasr.movierecord.api.MovieRecordService;
import albasr.movierecord.api.db.hibernate.HibernateGenreDAO;
import albasr.movierecord.api.db.hibernate.HibernateMovieDAO;
import albasr.movierecord.api.impl.MovieRecordServiceImpl;
public class Main {

	public static void main(String[] args) {
		MovieRecordService mrs=new MovieRecordServiceImpl();
		
		Genre g=new Genre();
//		g.setGenre("update");
//		g.setId(10);
//		g2.setGenre("Suspense");
		mrs.addGenre(g);
		HibernateGenreDAO hgdao=new HibernateGenreDAO();
		g=hgdao.search(5);
		
		Movie m=new Movie();
		m.setName("The Mummy");
		m.setDescription("horror type movie");
		m.setRating(7);
		m.setLaunchYear(2004);
		m.setGenre(g);
		
		HibernateMovieDAO hdao=new HibernateMovieDAO();
		
//		System.out.println(m.getName());
//		System.out.println(m.getDescription());
//		System.out.println(m.getRating());
//		System.out.println(m.getLaunchYear());
//		System.out.println(m.getGenre().getGenre());
//		System.out.println("");
		hdao.update(7,m);

		
//		hdao.add(m);
		
//		
//		Movie m2=new Movie();
//		m2.setName("hulk");
//		m2.setDescription("great movie");
//		m2.setRating(9);
//		m2.setLaunchYear(2008);
//		m2.setGenre(g2);
		
//		ArrayList<Movie> list=hdao.viewAll();
//		for(Iterator<Movie> iterator=list.iterator();iterator.hasNext();) {
//			Movie m=iterator.next();
//			
//			System.out.println(m.getName());
//			System.out.println(m.getDescription());
//			System.out.println(m.getRating());
//			System.out.println(m.getLaunchYear());
//			System.out.println(m.getGenre().getGenre());
//			System.out.println("");
//		}
//		hdao.add(m2);
		
	}

}
