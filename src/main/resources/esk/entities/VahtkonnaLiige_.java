package esk.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2011-11-27T03:41:47.840+0200")
@StaticMetamodel(VahtkonnaLiige.class)
public class VahtkonnaLiige_ {
	public static volatile SingularAttribute<VahtkonnaLiige, Integer> vahtkonnaLiigeId;
	public static volatile SingularAttribute<VahtkonnaLiige, String> alates;
	public static volatile SingularAttribute<VahtkonnaLiige, String> avaja;
	public static volatile SingularAttribute<VahtkonnaLiige, Date> avatud;
	public static volatile SingularAttribute<VahtkonnaLiige, String> kommentaar;
	public static volatile SingularAttribute<VahtkonnaLiige, String> kuni;
	public static volatile SingularAttribute<VahtkonnaLiige, Date> muudetud;
	public static volatile SingularAttribute<VahtkonnaLiige, String> muutja;
	public static volatile SingularAttribute<VahtkonnaLiige, Date> suletud;
	public static volatile SingularAttribute<VahtkonnaLiige, String> sulgeja;
	public static volatile SingularAttribute<VahtkonnaLiige, Piirivalvur> piirivalvur;
	public static volatile SingularAttribute<VahtkonnaLiige, Vahtkond> vahtkond;
}
