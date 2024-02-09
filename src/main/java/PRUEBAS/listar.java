package PRUEBAS;

import DAOS.SubjectDao;
import DAOS.SubjectDaoImpl;
import MODEL.Subject;

public class listar {
	public static void main(String[] args) {
		SubjectDao subjectDao = new SubjectDaoImpl();
		
		for( Subject s: subjectDao.findAll()) {
			System.out.println(s.getIdSubject());
			System.out.println(s.getSubject());
			System.out.println(s.getCredits());
		}
		
	}
}
