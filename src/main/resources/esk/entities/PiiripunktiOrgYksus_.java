package esk.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2011-11-27T03:41:47.118+0200")
@StaticMetamodel(PiiripunktiOrgYksus.class)
public class PiiripunktiOrgYksus_ {
	public static volatile SingularAttribute<PiiripunktiOrgYksus, Integer> piiripunktiOrgYksusId;
	public static volatile SingularAttribute<PiiripunktiOrgYksus, Date> alates;
	public static volatile SingularAttribute<PiiripunktiOrgYksus, String> avaja;
	public static volatile SingularAttribute<PiiripunktiOrgYksus, Date> avatud;
	public static volatile SingularAttribute<PiiripunktiOrgYksus, String> kommentaar;
	public static volatile SingularAttribute<PiiripunktiOrgYksus, String> kood;
	public static volatile SingularAttribute<PiiripunktiOrgYksus, Date> kuni;
	public static volatile SingularAttribute<PiiripunktiOrgYksus, Date> muudetud;
	public static volatile SingularAttribute<PiiripunktiOrgYksus, String> muutja;
	public static volatile SingularAttribute<PiiripunktiOrgYksus, String> nimetus;
	public static volatile SingularAttribute<PiiripunktiOrgYksus, Date> suletud;
	public static volatile SingularAttribute<PiiripunktiOrgYksus, String> sulgeja;
	public static volatile SingularAttribute<PiiripunktiOrgYksus, Integer> vaeosaIdId;
	public static volatile SingularAttribute<PiiripunktiOrgYksus, Piiripunkt> piiripunkt;
	public static volatile SingularAttribute<PiiripunktiOrgYksus, PiiripunktiOrgYksus> piiripunktiOrgYksus;
	public static volatile SetAttribute<PiiripunktiOrgYksus, PiiripunktiOrgYksus> piiripunktiOrgYksuses;
}
