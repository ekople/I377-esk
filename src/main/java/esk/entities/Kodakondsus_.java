package esk.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2011-11-27T03:37:56.822+0200")
@StaticMetamodel(Kodakondsus.class)
public class Kodakondsus_ {
	public static volatile SingularAttribute<Kodakondsus, Integer> kodakondsusId;
	public static volatile SingularAttribute<Kodakondsus, Date> alates;
	public static volatile SingularAttribute<Kodakondsus, String> avaja;
	public static volatile SingularAttribute<Kodakondsus, Date> avatud;
	public static volatile SingularAttribute<Kodakondsus, String> isikukood;
	public static volatile SingularAttribute<Kodakondsus, String> kommentaar;
	public static volatile SingularAttribute<Kodakondsus, Date> kuni;
	public static volatile SingularAttribute<Kodakondsus, Date> muudetud;
	public static volatile SingularAttribute<Kodakondsus, String> muutja;
	public static volatile SingularAttribute<Kodakondsus, Date> suletud;
	public static volatile SingularAttribute<Kodakondsus, String> sulgeja;
	public static volatile SingularAttribute<Kodakondsus, Piiririkkuja> piiririkkuja;
	public static volatile SingularAttribute<Kodakondsus, Riik> riik;
}
