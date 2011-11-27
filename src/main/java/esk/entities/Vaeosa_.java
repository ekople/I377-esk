package esk.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2011-11-27T03:37:57.239+0200")
@StaticMetamodel(Vaeosa.class)
public class Vaeosa_ {
	public static volatile SingularAttribute<Vaeosa, Integer> vaeosaIdId;
	public static volatile SingularAttribute<Vaeosa, Date> alates;
	public static volatile SingularAttribute<Vaeosa, String> avaja;
	public static volatile SingularAttribute<Vaeosa, Date> avatud;
	public static volatile SingularAttribute<Vaeosa, String> kommentaar;
	public static volatile SingularAttribute<Vaeosa, String> kood;
	public static volatile SingularAttribute<Vaeosa, Date> kuni;
	public static volatile SingularAttribute<Vaeosa, Date> muudetud;
	public static volatile SingularAttribute<Vaeosa, String> muutja;
	public static volatile SingularAttribute<Vaeosa, String> nimetus;
	public static volatile SingularAttribute<Vaeosa, Date> suletud;
	public static volatile SingularAttribute<Vaeosa, String> sulgeja;
	public static volatile SetAttribute<Vaeosa, AmetVaeosa> ametVaeosas;
	public static volatile SetAttribute<Vaeosa, OrgYksus> orgYksuses;
	public static volatile SetAttribute<Vaeosa, PiiriloiguHaldaja> piiriloiguHaldajas;
	public static volatile SetAttribute<Vaeosa, PiiripunktiAlluvus> piiripunktiAlluvuses;
	public static volatile SingularAttribute<Vaeosa, RiigiAdminYksus> riigiAdminYksus;
	public static volatile SetAttribute<Vaeosa, VaeosaAlluvus> vaeosaAlluvuses1;
	public static volatile SetAttribute<Vaeosa, VaeosaAlluvus> vaeosaAlluvuses2;
	public static volatile SetAttribute<Vaeosa, Vahtkond> vahtkonds;
}
