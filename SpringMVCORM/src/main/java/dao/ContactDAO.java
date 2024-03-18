package dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;

import dto.Contact;

@Transactional
public class ContactDAO {
	@Autowired
	HibernateTemplate template;

	public List<Contact> getAll() {
		return template.loadAll(Contact.class);
	}

	public Integer saveContact(Contact contact) {
		return (Integer) template.save(contact);
	}

	public Contact getOneContact(int cid) {
		return template.get(Contact.class, cid);
	}

	public void update(Contact contact) {
	 template.update(contact);
	
	}
	public void deleteContact(Contact  contact) {
		template.delete(contact);
	}
}
