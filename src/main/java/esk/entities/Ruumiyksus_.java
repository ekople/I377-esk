package esk.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2011-11-27T03:37:57.167+0200")
@StaticMetamodel(Ruumiyksus.class)
public class Ruumiyksus_ {
	public static volatile SingularAttribute<Ruumiyksus, Integer> ruumiyksusId;
	public static volatile SingularAttribute<Ruumiyksus, String> aadress;
	public static volatile SingularAttribute<Ruumiyksus, String> avaja;
	public static volatile SingularAttribute<Ruumiyksus, Date> avatud;
	public static volatile SingularAttribute<Ruumiyksus, String> kommentaar;
	public static volatile SingularAttribute<Ruumiyksus, String> kood;
	public static volatile SingularAttribute<Ruumiyksus, Date> muudetud;
	public static volatile SingularAttribute<Ruumiyksus, String> muutja;
	public static volatile SingularAttribute<Ruumiyksus, String> nimetus;
	public static volatile SingularAttribute<Ruumiyksus, Date> suletud;
	public static volatile SingularAttribute<Ruumiyksus, String> sulgeja;
	public static volatile SingularAttribute<Ruumiyksus, RiigiAdminYksus> riigiAdminYksus;
	public static volatile SingularAttribute<Ruumiyksus, Ruumiyksus> ruumiyksus;
	public static volatile SetAttribute<Ruumiyksus, Ruumiyksus> ruumiyksuses;
	public static volatile SingularAttribute<Ruumiyksus, RuumiyksuseLiik> ruumiyksuseLiik;
	public static volatile SetAttribute<Ruumiyksus, Voodikoht> voodikohts;
}
