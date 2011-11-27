package esk.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2011-11-27T03:41:46.983+0200")
@StaticMetamodel(PiiriloiguHaldaja.class)
public class PiiriloiguHaldaja_ {
	public static volatile SingularAttribute<PiiriloiguHaldaja, Integer> piiriloiguHaldajaId;
	public static volatile SingularAttribute<PiiriloiguHaldaja, Date> alates;
	public static volatile SingularAttribute<PiiriloiguHaldaja, String> avaja;
	public static volatile SingularAttribute<PiiriloiguHaldaja, Date> avatud;
	public static volatile SingularAttribute<PiiriloiguHaldaja, String> kommentaar;
	public static volatile SingularAttribute<PiiriloiguHaldaja, Date> kuni;
	public static volatile SingularAttribute<PiiriloiguHaldaja, Date> muudetud;
	public static volatile SingularAttribute<PiiriloiguHaldaja, String> muutja;
	public static volatile SingularAttribute<PiiriloiguHaldaja, Date> suletud;
	public static volatile SingularAttribute<PiiriloiguHaldaja, String> sulgeja;
	public static volatile SingularAttribute<PiiriloiguHaldaja, Piiriloik> piiriloik;
	public static volatile SingularAttribute<PiiriloiguHaldaja, Piiripunkt> piiripunkt;
	public static volatile SingularAttribute<PiiriloiguHaldaja, Vaeosa> vaeosa;
}
