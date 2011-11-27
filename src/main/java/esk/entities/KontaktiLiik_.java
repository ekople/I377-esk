package esk.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2011-11-27T03:37:56.837+0200")
@StaticMetamodel(KontaktiLiik.class)
public class KontaktiLiik_ {
	public static volatile SingularAttribute<KontaktiLiik, Integer> kontaktiLiikId;
	public static volatile SingularAttribute<KontaktiLiik, String> avaja;
	public static volatile SingularAttribute<KontaktiLiik, Date> avatud;
	public static volatile SingularAttribute<KontaktiLiik, String> kommentaar;
	public static volatile SingularAttribute<KontaktiLiik, Date> muudetud;
	public static volatile SingularAttribute<KontaktiLiik, String> muutja;
	public static volatile SingularAttribute<KontaktiLiik, String> nimetus;
	public static volatile SingularAttribute<KontaktiLiik, Date> suletud;
	public static volatile SingularAttribute<KontaktiLiik, String> sulgeja;
	public static volatile SingularAttribute<KontaktiLiik, String> xmlKirjeldus;
	public static volatile SetAttribute<KontaktiLiik, PiirivalvuriKontakt> piirivalvuriKontakts;
}
