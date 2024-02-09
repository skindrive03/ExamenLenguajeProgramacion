package DAOS;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import MODEL.Subject;

public class SubjectDaoImpl implements SubjectDao {
	
	EntityManagerFactory factory;
	EntityManager em;
	
	public SubjectDaoImpl() {
		factory = Persistence.createEntityManagerFactory("Actividad_01");
		em = factory.createEntityManager();
	}

	@Override
	public void create(Subject subject) {
		em.getTransaction().begin();
		em.persist(subject);
		em.getTransaction().commit();
		
	}

	@Override
	public void update(Subject subject) {
		try {
			em.getTransaction().begin();
			em.merge(subject);
			em.getTransaction().commit();
		} catch (Exception e) {
			em.getTransaction().rollback();
		}
		
	}

	@Override
	public void delete(Integer id) {
		em.getTransaction().begin();
		em.remove(find(id));
		em.getTransaction().commit();
		
	}

	@Override
	public Subject find(Integer id) {
		return em.find(Subject.class, id);
	}

	@Override
	public List<Subject> findAll() {
		Query query = em.createNamedQuery("Subject.findAll");
		return (List <Subject>) query.getResultList();
	}

}
