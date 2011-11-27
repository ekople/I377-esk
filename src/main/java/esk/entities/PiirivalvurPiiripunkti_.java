package esk.entities;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2011-11-27T03:37:57.037+0200")
@StaticMetamodel(PiirivalvurPiiripunkti.class)
public class PiirivalvurPiiripunkti_ {
	public static volatile SingularAttribute<PiirivalvurPiiripunkti, Integer> piirivalvurPiiripunktisId;
	public static volatile SingularAttribute<PiirivalvurPiiripunkti, Date> alates;
	public static volatile SingularAttribute<PiirivalvurPiiripunkti, String> avaja;
	public static volatile SingularAttribute<PiirivalvurPiiripunkti, Date> avatud;
	public static volatile SingularAttribute<PiirivalvurPiiripunkti, String> kommentaar;
	public static volatile SingularAttribute<PiirivalvurPiiripunkti, BigDecimal> koormus;
	public static volatile SingularAttribute<PiirivalvurPiiripunkti, Date> kuni;
	public static volatile SingularAttribute<PiirivalvurPiiripunkti, Date> muudetud;
	public static volatile SingularAttribute<PiirivalvurPiiripunkti, String> muutja;
	public static volatile SingularAttribute<PiirivalvurPiiripunkti, Date> suletud;
	public static volatile SingularAttribute<PiirivalvurPiiripunkti, String> sulgeja;
	public static volatile SingularAttribute<PiirivalvurPiiripunkti, AmetPiiripunkti> ametPiiripunkti;
	public static volatile SingularAttribute<PiirivalvurPiiripunkti, Piirivalvur> piirivalvur;
}
