package esk.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2011-11-27T03:37:57.084+0200")
@StaticMetamodel(RiigiAdminYksus.class)
public class RiigiAdminYksus_ {
	public static volatile SingularAttribute<RiigiAdminYksus, Integer> riigiAdminYksusId;
	public static volatile SingularAttribute<RiigiAdminYksus, Date> alates;
	public static volatile SingularAttribute<RiigiAdminYksus, String> avaja;
	public static volatile SingularAttribute<RiigiAdminYksus, Date> avatud;
	public static volatile SingularAttribute<RiigiAdminYksus, String> kommentaar;
	public static volatile SingularAttribute<RiigiAdminYksus, String> kood;
	public static volatile SingularAttribute<RiigiAdminYksus, Date> kuni;
	public static volatile SingularAttribute<RiigiAdminYksus, Date> muudetud;
	public static volatile SingularAttribute<RiigiAdminYksus, String> muutja;
	public static volatile SingularAttribute<RiigiAdminYksus, String> nimetus;
	public static volatile SingularAttribute<RiigiAdminYksus, Date> suletud;
	public static volatile SingularAttribute<RiigiAdminYksus, String> sulgeja;
	public static volatile SetAttribute<RiigiAdminYksus, AdminAlluvus> adminAlluvuses1;
	public static volatile SetAttribute<RiigiAdminYksus, AdminAlluvus> adminAlluvuses2;
	public static volatile SingularAttribute<RiigiAdminYksus, RiigiAdminYksuseLiik> riigiAdminYksuseLiik;
	public static volatile SetAttribute<RiigiAdminYksus, Ruumiyksus> ruumiyksuses;
	public static volatile SetAttribute<RiigiAdminYksus, Vaeosa> vaeosas;
}
