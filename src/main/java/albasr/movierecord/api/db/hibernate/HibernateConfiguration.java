package albasr.movierecord.api.db.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class HibernateConfiguration {
	private static HibernateConfiguration hb;
	
	private Configuration con;
	private ServiceRegistry reg;
	private SessionFactory sf;
	private HibernateConfiguration() {}
	
	public static HibernateConfiguration getInstance() {
		if(hb==null) {
			hb=new HibernateConfiguration();
		}
		return hb;
	}
	public Session configure(Class c) {
		this.con = new Configuration().configure().addAnnotatedClass(c);
		this.reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
		this.sf = con.buildSessionFactory(reg);
		System.out.println("Session Created");
		return this.sf.openSession();
		
	}
}
