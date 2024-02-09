package PRUEBAS;

import DAOS.SubjectDao;
import DAOS.SubjectDaoImpl;
import MODEL.Subject;

public class registrar {
	
	public static void main(String[] args) {
		SubjectDao subjectDao = new SubjectDaoImpl();
		
		Subject subject = new Subject();
		subject.setIdSubject(4);
		subject.setSubject("Neumatica e Hidraulica");
		subject.setCredits("05");
		
		subjectDao.create(subject);
		
		for( Subject s: subjectDao.findAll()) {
			System.out.println(s.getIdSubject());
			System.out.println(s.getSubject());
			System.out.println(s.getCredits());
		}
		
	}

}
