package esk.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2011-11-27T03:41:46.545+0200")
@StaticMetamodel(AdminAlluvus.class)
public class AdminAlluvus_ {
	public static volatile SingularAttribute<AdminAlluvus, Integer> adminAlluvusId;
	public static volatile SingularAttribute<AdminAlluvus, String> alates;
	public static volatile SingularAttribute<AdminAlluvus, String> avaja;
	public static volatile SingularAttribute<AdminAlluvus, Date> avatud;
	public static volatile SingularAttribute<AdminAlluvus, String> kommentaar;
	public static volatile SingularAttribute<AdminAlluvus, String> kuni;
	public static volatile SingularAttribute<AdminAlluvus, Date> muudetud;
	public static volatile SingularAttribute<AdminAlluvus, String> muutja;
	public static volatile SingularAttribute<AdminAlluvus, Date> suletud;
	public static volatile SingularAttribute<AdminAlluvus, String> sulgeja;
	public static volatile SingularAttribute<AdminAlluvus, RiigiAdminYksus> riigiAdminYksus1;
	public static volatile SingularAttribute<AdminAlluvus, RiigiAdminYksus> riigiAdminYksus2;
}
