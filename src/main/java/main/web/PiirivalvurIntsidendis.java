package main.web;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.roo.addon.javabean.RooJavaBean;

@Configurable
@RooJavaBean
public class PiirivalvurIntsidendis {
	@PersistenceContext
	EntityManager entityManager;

	public static final EntityManager entityManager() {
		EntityManager em = new PiirivalvuriIntsidendid().entityManager;
		if (em == null)
			throw new IllegalStateException(
					"Entity manager has not been injected");
		return em;
	}
	
	
	
	
	
	

}
