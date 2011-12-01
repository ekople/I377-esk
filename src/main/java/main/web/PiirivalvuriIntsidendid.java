package main.web;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.persistence.INTSIDENT;
import org.persistence.PIIRIVALVUR;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.roo.addon.javabean.RooJavaBean;
@Configurable
@RooJavaBean
public class PiirivalvuriIntsidendid
{
	@PersistenceContext
	EntityManager entityManager;
	
	public PiirivalvuriIntsidendid()
	{
		
	}
	
	public PiirivalvuriIntsidendid(PIIRIVALVUR piirivalvur, List<INTSIDENT> intsidendid, int intsidenteKokku)
	{
		this.Piirivalvur = piirivalvur;
		this.Intsidendid = intsidendid;
		this.IntsidenteKokku = intsidenteKokku;
	}
	
	PIIRIVALVUR Piirivalvur;
	List<INTSIDENT> Intsidendid;
	int IntsidenteKokku;
	
    @SuppressWarnings("unchecked")
	public static PiirivalvuriIntsidendid leiaPiirivalvurigaSeotudIntsidendid(PIIRIVALVUR piirivalvur) {
    	Query q = entityManager().createNativeQuery(
    	    "SELECT * from T_INTSIDENT, T_PIIRIVALVUR_INTSIDENDIS "+
    	    		"where T_INTSIDENT.INTSIDENT_ID = T_PIIRIVALVUR_INTSIDENDIS.iNTSIDENT_ID " +
    					"and T_PIIRIVALVUR_INTSIDENDIS.pIIRIVALVUR_ID = "+ piirivalvur.getPiirivalvurId());       
        List<INTSIDENT> resultList =  q.getResultList();
        if(resultList != null && !resultList.isEmpty())
        { return new PiirivalvuriIntsidendid(piirivalvur,resultList,resultList.size()); }      
        else
        { return new PiirivalvuriIntsidendid(piirivalvur,new ArrayList<INTSIDENT>(),0); }
    }
    
    public static final EntityManager entityManager() {
        EntityManager em = new PiirivalvuriIntsidendid().entityManager;
        if (em == null) throw new IllegalStateException("Entity manager has not been injected");
        return em;
    }

}
