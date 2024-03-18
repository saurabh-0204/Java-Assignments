package controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import dao.ContactDAO;
import dto.Contact;

@Controller
public class ContactController {

	@Autowired
	ContactDAO cDao;

	@RequestMapping("/all")
	public ModelAndView getAllContacts() {
		List<Contact> list = cDao.getAll();
		return new ModelAndView("all", "clist", list);
	}

	@RequestMapping("/create")
	public ModelAndView createContact() {
		return new ModelAndView("create", "save", new Contact());
	}

	@RequestMapping("/save")
	public ModelAndView saveContact(@ModelAttribute("save") Contact contact) {
		System.out.println(contact);
		int cid = cDao.saveContact(contact);
		return new ModelAndView("success", "cid", cid);

	}
	@RequestMapping("edit")
	public ModelAndView editContact(@RequestParam("cid") int id) {
		Contact contact=cDao.getOneContact(id);
		return new ModelAndView("editContact","edit",contact);
	}

	 @RequestMapping("/update")
	 public String update(@ModelAttribute("edit") Contact contact) {
		 
		 System.out.println(contact);
		 cDao.update(contact);
		 return "success";
		 
	 }
	 @RequestMapping("/delete")
	 public void delete(@RequestParam("cid") int id) {
		 Contact contact=cDao.getOneContact(id);
		 System.out.println(contact);
		 cDao.deleteContact(contact);
	 }
}
