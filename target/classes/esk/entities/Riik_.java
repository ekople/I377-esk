package esk.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2011-11-27T03:41:47.515+0200")
@StaticMetamodel(Riik.class)
public class Riik_ {
	public static volatile SingularAttribute<Riik, Integer> riikId;
	public static volatile SingularAttribute<Riik, String> ansiKood;
	public static volatile SingularAttribute<Riik, String> avaja;
	public static volatile SingularAttribute<Riik, Date> avatud;
	public static volatile SingularAttribute<Riik, String> isoKood;
	public static volatile SingularAttribute<Riik, String> kommentaar;
	public static volatile SingularAttribute<Riik, Date> muudetud;
	public static volatile SingularAttribute<Riik, String> muutja;
	public static volatile SingularAttribute<Riik, Date> suletud;
	public static volatile SingularAttribute<Riik, String> sulgeja;
	public static volatile SetAttribute<Riik, Kodakondsus> kodakondsuses;
}
