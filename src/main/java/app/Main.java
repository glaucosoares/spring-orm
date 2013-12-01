package app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Contato;
import beans.GenericDao;


public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		GenericDao dao = (GenericDao) context.getBean("dao");
		
		Contato c = new Contato();
		c.setId(1);
		c.setNome("Glauco Soares");
		c.setEmail("glauco.vsoares@gmail.com");
		dao.saveOrUpdate(c);
	}
}
