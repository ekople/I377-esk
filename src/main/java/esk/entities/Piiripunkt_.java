package esk.entities;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2011-11-27T03:37:56.927+0200")
@StaticMetamodel(Piiripunkt.class)
public class Piiripunkt_ {
	public static volatile SingularAttribute<Piiripunkt, Integer> piiripunktId;
	public static volatile SingularAttribute<Piiripunkt, Date> alates;
	public static volatile SingularAttribute<Piiripunkt, String> avaja;
	public static volatile SingularAttribute<Piiripunkt, Date> avatud;
	public static volatile SingularAttribute<Piiripunkt, BigDecimal> gpsLatitude;
	public static volatile SingularAttribute<Piiripunkt, BigDecimal> gpsLongituide;
	public static volatile SingularAttribute<Piiripunkt, String> kommentaar;
	public static volatile SingularAttribute<Piiripunkt, String> kood;
	public static volatile SingularAttribute<Piiripunkt, BigDecimal> korgusMerepinnast;
	public static volatile SingularAttribute<Piiripunkt, Date> kuni;
	public static volatile SingularAttribute<Piiripunkt, Date> muudetud;
	public static volatile SingularAttribute<Piiripunkt, String> muutja;
	public static volatile SingularAttribute<Piiripunkt, String> nimetus;
	public static volatile SingularAttribute<Piiripunkt, Date> suletud;
	public static volatile SingularAttribute<Piiripunkt, String> sulgeja;
	public static volatile SetAttribute<Piiripunkt, AmetPiiripunkti> ametPiiripunktis;
	public static volatile SetAttribute<Piiripunkt, PiiriloiguHaldaja> piiriloiguHaldajas;
	public static volatile SetAttribute<Piiripunkt, PiiripunktiAlluvus> piiripunktiAlluvuses;
	public static volatile SetAttribute<Piiripunkt, PiiripunktiOrgYksus> piiripunktiOrgYksuses;
	public static volatile SetAttribute<Piiripunkt, Vahtkond> vahtkonds;
}
