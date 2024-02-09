package MODEL;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table (name = "Subject")
@NamedQuery (name = "Subject.findAll" , query = "SELECT s FROM Subject s")

public class Subject {
	@Id
	@Column(name = "idSubject")
	private int idSubject;
	
	@Column(name = "subject")
	private String subject;
	
	@Column(name = "credits")
	private String credits;

	public Subject() {
	}

	public int getIdSubject() {
		return idSubject;
	}

	public void setIdSubject(int idSubject) {
		this.idSubject = idSubject;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getCredits() {
		return credits;
	}

	public void setCredits(String credits) {
		this.credits = credits;
	}
	
}
