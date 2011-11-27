package esk.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2011-11-27T03:41:46.873+0200")
@StaticMetamodel(ObjektiLiik.class)
public class ObjektiLiik_ {
	public static volatile SingularAttribute<ObjektiLiik, Integer> objektLiikId;
	public static volatile SingularAttribute<ObjektiLiik, String> avaja;
	public static volatile SingularAttribute<ObjektiLiik, Date> avatud;
	public static volatile SingularAttribute<ObjektiLiik, byte[]> kommentaar;
	public static volatile SingularAttribute<ObjektiLiik, String> kood;
	public static volatile SingularAttribute<ObjektiLiik, Date> muudetud;
	public static volatile SingularAttribute<ObjektiLiik, String> muutja;
	public static volatile SingularAttribute<ObjektiLiik, String> nimetus;
	public static volatile SingularAttribute<ObjektiLiik, Date> suletud;
	public static volatile SingularAttribute<ObjektiLiik, String> sulgeja;
	public static volatile SetAttribute<ObjektiLiik, Objekt> objekts;
}
