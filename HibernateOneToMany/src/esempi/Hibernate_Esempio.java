package esempi;

import hibernateUtil.HibernateUtil;
import model.Computer;
import model.Persona;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class Hibernate_Esempio {

	public static void main(String[] args) {
		
		Persona p1 = new Persona();
		Computer c1 = new Computer();
		Computer c2 = new Computer();
		c1.setModello("HP");
		c2.setModello("Asus");
		p1.setNome("AAA");
		p1.setCognome("BBB");
		p1.addComputers(c1);
		p1.addComputers(c2);
		
		c1.setPersona(p1);
		c2.setPersona(p1);
		
		
		Session session = HibernateUtil.openSession();
		Transaction tx = null;
		try {
			tx = session.getTransaction();
			tx.begin();
			// lavori da fare
			
			session.save(c1);
			session.save(c2);
			session.save(p1);
			
			
			tx.commit();
		} catch (Exception ex) {
			tx.rollback();

		} finally {
			session.close();
		}

		
	}
}
