package esk.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2011-11-27T03:37:56.967+0200")
@StaticMetamodel(Piiririkkuja.class)
public class Piiririkkuja_ {
	public static volatile SingularAttribute<Piiririkkuja, Integer> piiririkkujaId;
	public static volatile SingularAttribute<Piiririkkuja, String> avaja;
	public static volatile SingularAttribute<Piiririkkuja, Date> avatud;
	public static volatile SingularAttribute<Piiririkkuja, String> eesnimi;
	public static volatile SingularAttribute<Piiririkkuja, String> isikukood;
	public static volatile SingularAttribute<Piiririkkuja, String> kommentaar;
	public static volatile SingularAttribute<Piiririkkuja, Date> muudetud;
	public static volatile SingularAttribute<Piiririkkuja, String> muutja;
	public static volatile SingularAttribute<Piiririkkuja, String> perekNimi;
	public static volatile SingularAttribute<Piiririkkuja, String> sugu;
	public static volatile SingularAttribute<Piiririkkuja, Date> suletud;
	public static volatile SingularAttribute<Piiririkkuja, String> sulgeja;
	public static volatile SingularAttribute<Piiririkkuja, Date> synniaeg;
	public static volatile SetAttribute<Piiririkkuja, IsikIntsidendi> isikIntsidendis;
	public static volatile SetAttribute<Piiririkkuja, Kodakondsus> kodakondsuses;
	public static volatile SingularAttribute<Piiririkkuja, Objekt> objekt;
}
