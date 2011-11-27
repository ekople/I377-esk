package esk.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2011-11-27T03:41:46.660+0200")
@StaticMetamodel(Auaste.class)
public class Auaste_ {
	public static volatile SingularAttribute<Auaste, Integer> auasteId;
	public static volatile SingularAttribute<Auaste, String> avaja;
	public static volatile SingularAttribute<Auaste, Date> avatud;
	public static volatile SingularAttribute<Auaste, String> kommentaar;
	public static volatile SingularAttribute<Auaste, String> kood;
	public static volatile SingularAttribute<Auaste, Date> muudetud;
	public static volatile SingularAttribute<Auaste, String> muutja;
	public static volatile SingularAttribute<Auaste, String> nimetus;
	public static volatile SingularAttribute<Auaste, Date> suletud;
	public static volatile SingularAttribute<Auaste, String> sulgeja;
	public static volatile SetAttribute<Auaste, AuastmeMuutumine> auastmeMuutumines;
}
