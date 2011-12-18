package main.web;

import java.util.ArrayList;
import java.util.Date;
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
	
	public static PiirivalvuriIntsidendid leiaPiirivalvurigaSeotudIntsidendid(PIIRIVALVUR piirivalvur) {
        List<INTSIDENT> resultList =  leiaPiirivalvurigaSeotIntsidendid(piirivalvur);
        if(resultList != null && resultList.size() > 0)
        { return new PiirivalvuriIntsidendid(piirivalvur,resultList,resultList.size()); }      
        else
        { return new PiirivalvuriIntsidendid(piirivalvur,new ArrayList<INTSIDENT>(),0); }
    }
    
	public static PiirivalvuriIntsidendid leiaPiirivalvurigaSeotudIntsidendid(
			PIIRIVALVUR piirivalvur,Date algus,Date lopp,Long piiriloik) {
    	if(algus== null && lopp == null && piiriloik == null)
    	{ return leiaPiirivalvurigaSeotudIntsidendid(piirivalvur); }
        List<INTSIDENT> resultList =  leiaPiirivalvurigaSeotIntsidendid(piirivalvur);
        List<INTSIDENT> resultListClone = new ArrayList<INTSIDENT>(resultList);
        for(INTSIDENT intsident:resultList)
        {
        	if(algus != null && lopp != null && intsident.getToimumiseAlgus() != null)
        	{
        		if(intsident.getToimumiseAlgus().before(algus) || intsident.getToimumiseAlgus().after(lopp))  
        		{ 
        			resultListClone.remove(intsident);
        			continue;
        		}
        	}
        	else if(algus != null && lopp != null && intsident.getToimumiseAlgus() == null)
        	{
        		resultListClone.remove(intsident);
    			continue;
        	}
    		if(piiriloik != null)
    		{
    			if(intsident.getPIIRILOIK_ID().getPiiriloikId() != piiriloik)
    			{ resultListClone.remove(intsident); }
    		}
        }
        if(resultListClone != null && resultListClone.size() > 0)
        { return new PiirivalvuriIntsidendid(piirivalvur,resultListClone,resultListClone.size()); }      
        else
        { return new PiirivalvuriIntsidendid(piirivalvur,new ArrayList<INTSIDENT>(),0); }
    }
    
    @SuppressWarnings("unchecked")
	private static List<INTSIDENT>leiaPiirivalvurigaSeotIntsidendid(PIIRIVALVUR piirivalvur)
    {
    	Query q = entityManager().createNativeQuery(
        	    "SELECT * from T_INTSIDENT, T_PIIRIVALVUR_INTSIDENDIS "+
        	    		"where T_INTSIDENT.suletud > CURRENT_DATE "+
        	    		"and T_INTSIDENT.INTSIDENT_ID = T_PIIRIVALVUR_INTSIDENDIS.iNTSIDENT_ID " +
        	    		"and T_PIIRIVALVUR_INTSIDENDIS.suletud > CURRENT_DATE "+
        					"and T_PIIRIVALVUR_INTSIDENDIS.pIIRIVALVUR_ID = "+ piirivalvur.getPiirivalvurId().toString(),
        					INTSIDENT.class);       
            List<INTSIDENT> resultList =  q.getResultList();
            return resultList;
    }
    
    public static final EntityManager entityManager() {
        EntityManager em = new PiirivalvuriIntsidendid().entityManager;
        if (em == null) throw new IllegalStateException("Entity manager has not been injected");
        return em;
    }

}
