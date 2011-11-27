package esk.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2011-11-27T03:41:47.895+0200")
@StaticMetamodel(VoimalikAlluvus.class)
public class VoimalikAlluvus_ {
	public static volatile SingularAttribute<VoimalikAlluvus, Integer> voimalikAlluvusId;
	public static volatile SingularAttribute<VoimalikAlluvus, String> avaja;
	public static volatile SingularAttribute<VoimalikAlluvus, Date> avatud;
	public static volatile SingularAttribute<VoimalikAlluvus, String> kommentaar;
	public static volatile SingularAttribute<VoimalikAlluvus, Date> muudetud;
	public static volatile SingularAttribute<VoimalikAlluvus, String> muutja;
	public static volatile SingularAttribute<VoimalikAlluvus, Date> suletud;
	public static volatile SingularAttribute<VoimalikAlluvus, String> sulgeja;
	public static volatile SingularAttribute<VoimalikAlluvus, RiigiAdminYksuseLiik> riigiAdminYksuseLiik1;
	public static volatile SingularAttribute<VoimalikAlluvus, RiigiAdminYksuseLiik> riigiAdminYksuseLiik2;
}
