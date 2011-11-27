package esk.entities;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2011-11-27T03:37:56.787+0200")
@StaticMetamodel(Intsident.class)
public class Intsident_ {
	public static volatile SingularAttribute<Intsident, Integer> intsidentId;
	public static volatile SingularAttribute<Intsident, String> avaja;
	public static volatile SingularAttribute<Intsident, Date> avatud;
	public static volatile SingularAttribute<Intsident, BigDecimal> gpsLatituud;
	public static volatile SingularAttribute<Intsident, BigDecimal> gpsLongituud;
	public static volatile SingularAttribute<Intsident, String> kirjeldus;
	public static volatile SingularAttribute<Intsident, String> kommentaar;
	public static volatile SingularAttribute<Intsident, String> kood;
	public static volatile SingularAttribute<Intsident, Date> muudetud;
	public static volatile SingularAttribute<Intsident, String> muutja;
	public static volatile SingularAttribute<Intsident, String> nimetus;
	public static volatile SingularAttribute<Intsident, Date> suletud;
	public static volatile SingularAttribute<Intsident, String> sulgeja;
	public static volatile SingularAttribute<Intsident, Date> toimumiseAlgus;
	public static volatile SingularAttribute<Intsident, Date> toimumiseLopp;
	public static volatile SingularAttribute<Intsident, IntsidendiLiik> intsidendiLiik;
	public static volatile SingularAttribute<Intsident, Piiriloik> piiriloik;
	public static volatile SetAttribute<Intsident, IsikIntsidendi> isikIntsidendis;
	public static volatile SetAttribute<Intsident, ObjektIntsidendi> objektIntsidendis;
	public static volatile SetAttribute<Intsident, PiirivalvurIntsidendi> piirivalvurIntsidendis;
	public static volatile SetAttribute<Intsident, VahtkondIntsidendi> vahtkondIntsidendis;
}
