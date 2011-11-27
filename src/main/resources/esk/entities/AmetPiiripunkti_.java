package esk.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2011-11-27T03:41:46.610+0200")
@StaticMetamodel(AmetPiiripunkti.class)
public class AmetPiiripunkti_ {
	public static volatile SingularAttribute<AmetPiiripunkti, Integer> ametPiiripunktisId;
	public static volatile SingularAttribute<AmetPiiripunkti, Date> alates;
	public static volatile SingularAttribute<AmetPiiripunkti, String> avaja;
	public static volatile SingularAttribute<AmetPiiripunkti, Date> avatud;
	public static volatile SingularAttribute<AmetPiiripunkti, String> kommentaar;
	public static volatile SingularAttribute<AmetPiiripunkti, Date> kuni;
	public static volatile SingularAttribute<AmetPiiripunkti, Date> muudetud;
	public static volatile SingularAttribute<AmetPiiripunkti, String> muutja;
	public static volatile SingularAttribute<AmetPiiripunkti, Date> suletud;
	public static volatile SingularAttribute<AmetPiiripunkti, String> sulgeja;
	public static volatile SingularAttribute<AmetPiiripunkti, Amet> amet;
	public static volatile SingularAttribute<AmetPiiripunkti, Piiripunkt> piiripunkt;
	public static volatile SetAttribute<AmetPiiripunkti, PiirivalvurPiiripunkti> piirivalvurPiiripunktis;
}
