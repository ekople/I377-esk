package esk.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2011-11-27T03:37:57.282+0200")
@StaticMetamodel(VaeosaAlluvus.class)
public class VaeosaAlluvus_ {
	public static volatile SingularAttribute<VaeosaAlluvus, Integer> vaeosaAlluvusId;
	public static volatile SingularAttribute<VaeosaAlluvus, Date> alates;
	public static volatile SingularAttribute<VaeosaAlluvus, String> avaja;
	public static volatile SingularAttribute<VaeosaAlluvus, Date> avatud;
	public static volatile SingularAttribute<VaeosaAlluvus, String> kommentaar;
	public static volatile SingularAttribute<VaeosaAlluvus, Date> kuni;
	public static volatile SingularAttribute<VaeosaAlluvus, Date> muudetud;
	public static volatile SingularAttribute<VaeosaAlluvus, String> muutja;
	public static volatile SingularAttribute<VaeosaAlluvus, Date> suletud;
	public static volatile SingularAttribute<VaeosaAlluvus, String> sulgeja;
	public static volatile SingularAttribute<VaeosaAlluvus, Vaeosa> vaeosa1;
	public static volatile SingularAttribute<VaeosaAlluvus, Vaeosa> vaeosa2;
}
