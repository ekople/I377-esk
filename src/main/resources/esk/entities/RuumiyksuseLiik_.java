package esk.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2011-11-27T03:41:47.578+0200")
@StaticMetamodel(RuumiyksuseLiik.class)
public class RuumiyksuseLiik_ {
	public static volatile SingularAttribute<RuumiyksuseLiik, Integer> ruumiyksuseLiikId;
	public static volatile SingularAttribute<RuumiyksuseLiik, String> avaja;
	public static volatile SingularAttribute<RuumiyksuseLiik, Date> avatud;
	public static volatile SingularAttribute<RuumiyksuseLiik, String> kommentaar;
	public static volatile SingularAttribute<RuumiyksuseLiik, String> kood;
	public static volatile SingularAttribute<RuumiyksuseLiik, Date> muudetud;
	public static volatile SingularAttribute<RuumiyksuseLiik, String> muutja;
	public static volatile SingularAttribute<RuumiyksuseLiik, String> nimetus;
	public static volatile SingularAttribute<RuumiyksuseLiik, Date> suletud;
	public static volatile SingularAttribute<RuumiyksuseLiik, String> sulgeja;
	public static volatile SetAttribute<RuumiyksuseLiik, Ruumiyksus> ruumiyksuses;
}
