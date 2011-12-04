package main.web;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.persistence.INTSIDENT;
import org.persistence.ISIK_INTSIDENDIS;
import org.persistence.OBJEKT;
import org.persistence.OBJEKT_INTSIDENDIS;
import org.persistence.PIIRIRIKKUJA;
import org.persistence.PIIRIVALVUR_INTSIDENDIS;
import org.persistence.VAHTKOND;
import org.persistence.VAHTKOND_INTSIDENDIS;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.roo.addon.javabean.RooJavaBean;

@Configurable
@RooJavaBean
public class IntsidendigaSeotudElem {
	@PersistenceContext
	EntityManager entityManager;

	public static final EntityManager entityManager() {
		EntityManager em = new PiirivalvuriIntsidendid().entityManager;
		if (em == null)
			throw new IllegalStateException(
					"Entity manager has not been injected");
		return em;
	}

    @SuppressWarnings("unchecked")
	public static List<PIIRIRIKKUJA>GetIntsidendigaSeotudAktivPiiririkkujad(INTSIDENT intsident)
    {
    	Query query = entityManager().createNativeQuery(
        	    "SELECT * from T_ISIK_INTSIDENDIS where T_INTSIDENT.INTSIDENT_ID = " + intsident.getIntsidentId());       
        List<ISIK_INTSIDENDIS> isikudIntsidendis =  query.getResultList();
        if(isikudIntsidendis == null || isikudIntsidendis.isEmpty())
        { return null; }
		Calendar cal = Calendar.getInstance();
		cal.set(9999, 12, 31);
		java.util.Date termKP = cal.getTime(); 
		List<PIIRIRIKKUJA> tulemList = new ArrayList<PIIRIRIKKUJA>();
        for(ISIK_INTSIDENDIS isin : isikudIntsidendis)
        {
        	if(isin.getSuletud() != termKP)
        	{ continue; }
        	PIIRIRIKKUJA rikkuja = isin.getPIIRIRIKKUJA_ID();
        	if(rikkuja != null && rikkuja.getSuletud() == termKP)
        	{ tulemList.add(rikkuja); }
        }
    	return tulemList;
    }
	
    @SuppressWarnings("unchecked")
	public static List<VAHTKOND>GetIntsidendigaSeotudAktivVahtkonnad(INTSIDENT intsident)
    {
    	Query query = entityManager().createNativeQuery(
        	    "SELECT * from T_VAHTKOND_INTSIDENDIS where T_VAHTKOND_INTSIDENDIS.iNTSIDENT_ID = " + intsident.getIntsidentId());       
        List<VAHTKOND_INTSIDENDIS> vahtkonnnadIntsidendis =  query.getResultList();
        if(vahtkonnnadIntsidendis == null || vahtkonnnadIntsidendis.isEmpty())
        { return null; }
		Calendar cal = Calendar.getInstance();
		cal.set(9999, 12, 31);
		java.util.Date termKP = cal.getTime(); 
		List<VAHTKOND> tulemList = new ArrayList<VAHTKOND>();
        for(VAHTKOND_INTSIDENDIS vahin : vahtkonnnadIntsidendis)
        {
        	if(vahin.getSuletud() != termKP)
        	{ continue; }
        	VAHTKOND vahtkond = vahin.getVAHTKOND_ID();
        	if(vahtkond != null && vahtkond.getSuletud() == termKP)
        	{ tulemList.add(vahtkond); }
        }
    	return tulemList;
    }
	
    @SuppressWarnings("unchecked")
	public static List<OBJEKT>GetIntsidendigaSeotudAktivObjektid(INTSIDENT intsident)
    {
    	Query query = entityManager().createNativeQuery(
        	    "SELECT * from T_OBJEKT_INTSIDENDIS where T_OBJEKT_INTSIDENDIS.iNTSIDENT_ID = " + intsident.getIntsidentId());       
        List<OBJEKT_INTSIDENDIS> objektidIntsidendis =  query.getResultList();
        if(objektidIntsidendis == null || objektidIntsidendis.isEmpty())
        { return null; }
		Calendar cal = Calendar.getInstance();
		cal.set(9999, 12, 31);
		java.util.Date termKP = cal.getTime(); 
		List<OBJEKT> tulemList = new ArrayList<OBJEKT>();
        for(OBJEKT_INTSIDENDIS obin : objektidIntsidendis)
        {
        	if(obin.getSuletud() != termKP)
        	{ continue; }
        	OBJEKT objekt = obin.getOBJEKT_ID();
        	if(objekt != null && objekt.getSuletud() == termKP)
        	{ tulemList.add(objekt); }
        }
    	return tulemList;
    }
	
    @SuppressWarnings("unchecked")
	public static List<PIIRIVALVUR_INTSIDENDIS>GetIntsidendigaSeotudAktivPiirivalvuriIntsidendid(INTSIDENT intsident)
    {
    	Query query = entityManager().createNativeQuery(
        	    "SELECT * from T_PIIRIVALVUR_INTSIDENDIS where T_PIIRIVALVUR_INTSIDENDIS.iNTSIDENT_ID = " + intsident.getIntsidentId());       
		List<PIIRIVALVUR_INTSIDENDIS> piirivalvuridIntsidendis =  query.getResultList();
        if(piirivalvuridIntsidendis == null || piirivalvuridIntsidendis.isEmpty())
        { return null; }
		Calendar cal = Calendar.getInstance();
		cal.set(9999, 12, 31);
		java.util.Date termKP = cal.getTime(); 
		List<PIIRIVALVUR_INTSIDENDIS> tulemList = new ArrayList<PIIRIVALVUR_INTSIDENDIS>();
        for(PIIRIVALVUR_INTSIDENDIS piin : piirivalvuridIntsidendis)
        {
        	if(piin.getSuletud() != termKP)
        	{ continue; }
        	tulemList.add(piin);
        }
    	return tulemList;
    }
}
