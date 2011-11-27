package esk.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2011-11-27T03:37:57.134+0200")
@StaticMetamodel(RiigiAdminYksuseLiik.class)
public class RiigiAdminYksuseLiik_ {
	public static volatile SingularAttribute<RiigiAdminYksuseLiik, Integer> riigiAdminYksuseLikId;
	public static volatile SingularAttribute<RiigiAdminYksuseLiik, Date> alates;
	public static volatile SingularAttribute<RiigiAdminYksuseLiik, String> avaja;
	public static volatile SingularAttribute<RiigiAdminYksuseLiik, Date> avatud;
	public static volatile SingularAttribute<RiigiAdminYksuseLiik, String> kommentaar;
	public static volatile SingularAttribute<RiigiAdminYksuseLiik, String> kood;
	public static volatile SingularAttribute<RiigiAdminYksuseLiik, Date> kuni;
	public static volatile SingularAttribute<RiigiAdminYksuseLiik, Date> muudetud;
	public static volatile SingularAttribute<RiigiAdminYksuseLiik, String> muutja;
	public static volatile SingularAttribute<RiigiAdminYksuseLiik, String> nimetus;
	public static volatile SingularAttribute<RiigiAdminYksuseLiik, Date> suletud;
	public static volatile SingularAttribute<RiigiAdminYksuseLiik, String> sulgeja;
	public static volatile SetAttribute<RiigiAdminYksuseLiik, RiigiAdminYksus> riigiAdminYksuses;
	public static volatile SetAttribute<RiigiAdminYksuseLiik, VoimalikAlluvus> voimalikAlluvuses1;
	public static volatile SetAttribute<RiigiAdminYksuseLiik, VoimalikAlluvus> voimalikAlluvuses2;
}
