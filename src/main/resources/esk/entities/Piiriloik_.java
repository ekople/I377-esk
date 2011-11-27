package esk.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2011-11-27T03:41:47.013+0200")
@StaticMetamodel(Piiriloik.class)
public class Piiriloik_ {
	public static volatile SingularAttribute<Piiriloik, Integer> piiriloikId;
	public static volatile SingularAttribute<Piiriloik, String> avaja;
	public static volatile SingularAttribute<Piiriloik, Date> avatud;
	public static volatile SingularAttribute<Piiriloik, String> gpsKoordinaadid;
	public static volatile SingularAttribute<Piiriloik, String> kommentaar;
	public static volatile SingularAttribute<Piiriloik, String> kood;
	public static volatile SingularAttribute<Piiriloik, Date> muudetud;
	public static volatile SingularAttribute<Piiriloik, String> muutja;
	public static volatile SingularAttribute<Piiriloik, String> nimetus;
	public static volatile SingularAttribute<Piiriloik, Date> suletud;
	public static volatile SingularAttribute<Piiriloik, String> sulgeja;
	public static volatile SetAttribute<Piiriloik, Intsident> intsidents;
	public static volatile SetAttribute<Piiriloik, PiiriloiguHaldaja> piiriloiguHaldajas;
	public static volatile SetAttribute<Piiriloik, VahtkonndPiiriloigul> vahtkonndPiiriloiguls;
}
