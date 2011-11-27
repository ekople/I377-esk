package esk.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2011-11-27T03:41:46.955+0200")
@StaticMetamodel(OrgYksus.class)
public class OrgYksus_ {
	public static volatile SingularAttribute<OrgYksus, Integer> orgYksusId;
	public static volatile SingularAttribute<OrgYksus, Date> alates;
	public static volatile SingularAttribute<OrgYksus, String> avaja;
	public static volatile SingularAttribute<OrgYksus, Date> avatud;
	public static volatile SingularAttribute<OrgYksus, String> kommentaar;
	public static volatile SingularAttribute<OrgYksus, String> kood;
	public static volatile SingularAttribute<OrgYksus, Date> kuni;
	public static volatile SingularAttribute<OrgYksus, Date> muudetud;
	public static volatile SingularAttribute<OrgYksus, String> muutja;
	public static volatile SingularAttribute<OrgYksus, String> nimetus;
	public static volatile SingularAttribute<OrgYksus, Date> suletud;
	public static volatile SingularAttribute<OrgYksus, String> sulgeja;
	public static volatile SingularAttribute<OrgYksus, OrgYksus> orgYksus;
	public static volatile SetAttribute<OrgYksus, OrgYksus> orgYksuses;
	public static volatile SingularAttribute<OrgYksus, Vaeosa> vaeosa;
}
