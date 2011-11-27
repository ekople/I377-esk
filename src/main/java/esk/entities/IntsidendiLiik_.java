package esk.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2011-11-27T03:37:56.777+0200")
@StaticMetamodel(IntsidendiLiik.class)
public class IntsidendiLiik_ {
	public static volatile SingularAttribute<IntsidendiLiik, Integer> intsidendiLiikId;
	public static volatile SingularAttribute<IntsidendiLiik, String> avaja;
	public static volatile SingularAttribute<IntsidendiLiik, Date> avatud;
	public static volatile SingularAttribute<IntsidendiLiik, String> kommentaar;
	public static volatile SingularAttribute<IntsidendiLiik, String> kood;
	public static volatile SingularAttribute<IntsidendiLiik, Date> muudetud;
	public static volatile SingularAttribute<IntsidendiLiik, String> muutja;
	public static volatile SingularAttribute<IntsidendiLiik, String> nimetus;
	public static volatile SingularAttribute<IntsidendiLiik, Date> suletud;
	public static volatile SingularAttribute<IntsidendiLiik, String> sulgeja;
	public static volatile SetAttribute<IntsidendiLiik, Intsident> intsidents;
}
