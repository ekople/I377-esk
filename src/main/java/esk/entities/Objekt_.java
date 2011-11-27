package esk.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2011-11-27T03:37:56.849+0200")
@StaticMetamodel(Objekt.class)
public class Objekt_ {
	public static volatile SingularAttribute<Objekt, Integer> objektId;
	public static volatile SingularAttribute<Objekt, String> avaja;
	public static volatile SingularAttribute<Objekt, Date> avatud;
	public static volatile SingularAttribute<Objekt, byte[]> kommentaar;
	public static volatile SingularAttribute<Objekt, Date> muudetud;
	public static volatile SingularAttribute<Objekt, String> muutja;
	public static volatile SingularAttribute<Objekt, String> nimetus;
	public static volatile SingularAttribute<Objekt, Date> suletud;
	public static volatile SingularAttribute<Objekt, String> sulgeja;
	public static volatile SingularAttribute<Objekt, ObjektiLiik> objektiLiik;
	public static volatile SetAttribute<Objekt, ObjektIntsidendi> objektIntsidendis;
	public static volatile SetAttribute<Objekt, Piiririkkuja> piiririkkujas;
}
