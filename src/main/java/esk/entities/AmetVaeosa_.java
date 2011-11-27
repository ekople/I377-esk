package esk.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2011-11-27T03:37:56.742+0200")
@StaticMetamodel(AmetVaeosa.class)
public class AmetVaeosa_ {
	public static volatile SingularAttribute<AmetVaeosa, Integer> ametVaeosasId;
	public static volatile SingularAttribute<AmetVaeosa, Date> alates;
	public static volatile SingularAttribute<AmetVaeosa, String> avaja;
	public static volatile SingularAttribute<AmetVaeosa, Date> avatud;
	public static volatile SingularAttribute<AmetVaeosa, String> kommentaar;
	public static volatile SingularAttribute<AmetVaeosa, Date> kuni;
	public static volatile SingularAttribute<AmetVaeosa, Date> muudetud;
	public static volatile SingularAttribute<AmetVaeosa, String> muutja;
	public static volatile SingularAttribute<AmetVaeosa, Date> suletud;
	public static volatile SingularAttribute<AmetVaeosa, String> sulgeja;
	public static volatile SingularAttribute<AmetVaeosa, Amet> amet;
	public static volatile SingularAttribute<AmetVaeosa, Vaeosa> vaeosa;
	public static volatile SetAttribute<AmetVaeosa, PiirivalvurVaeosa> piirivalvurVaeosas;
}
