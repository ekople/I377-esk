package esk.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2011-11-27T03:37:56.717+0200")
@StaticMetamodel(Amet.class)
public class Amet_ {
	public static volatile SingularAttribute<Amet, Integer> ametId;
	public static volatile SingularAttribute<Amet, String> avaja;
	public static volatile SingularAttribute<Amet, Date> avatud;
	public static volatile SingularAttribute<Amet, String> iscoKood;
	public static volatile SingularAttribute<Amet, String> kommentaar;
	public static volatile SingularAttribute<Amet, Date> muudetud;
	public static volatile SingularAttribute<Amet, String> muutja;
	public static volatile SingularAttribute<Amet, String> nimetus;
	public static volatile SingularAttribute<Amet, Date> suletud;
	public static volatile SingularAttribute<Amet, String> sulgeja;
	public static volatile SetAttribute<Amet, AmetPiiripunkti> ametPiiripunktis;
	public static volatile SetAttribute<Amet, AmetVaeosa> ametVaeosas;
}
