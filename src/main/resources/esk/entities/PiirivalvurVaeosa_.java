package esk.entities;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2011-11-27T03:41:47.338+0200")
@StaticMetamodel(PiirivalvurVaeosa.class)
public class PiirivalvurVaeosa_ {
	public static volatile SingularAttribute<PiirivalvurVaeosa, Integer> piirivalvurVaeosasId;
	public static volatile SingularAttribute<PiirivalvurVaeosa, Date> alates;
	public static volatile SingularAttribute<PiirivalvurVaeosa, String> avaja;
	public static volatile SingularAttribute<PiirivalvurVaeosa, Date> avatud;
	public static volatile SingularAttribute<PiirivalvurVaeosa, String> kommentaar;
	public static volatile SingularAttribute<PiirivalvurVaeosa, BigDecimal> koormus;
	public static volatile SingularAttribute<PiirivalvurVaeosa, Date> kuni;
	public static volatile SingularAttribute<PiirivalvurVaeosa, Date> muudetud;
	public static volatile SingularAttribute<PiirivalvurVaeosa, String> muutja;
	public static volatile SingularAttribute<PiirivalvurVaeosa, Date> suletud;
	public static volatile SingularAttribute<PiirivalvurVaeosa, String> sulgeja;
	public static volatile SingularAttribute<PiirivalvurVaeosa, AmetVaeosa> ametVaeosa;
	public static volatile SingularAttribute<PiirivalvurVaeosa, Piirivalvur> piirivalvur;
}
