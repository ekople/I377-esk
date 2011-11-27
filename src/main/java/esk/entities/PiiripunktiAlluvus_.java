package esk.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2011-11-27T03:37:56.939+0200")
@StaticMetamodel(PiiripunktiAlluvus.class)
public class PiiripunktiAlluvus_ {
	public static volatile SingularAttribute<PiiripunktiAlluvus, Integer> piiripunktiAlluvusId;
	public static volatile SingularAttribute<PiiripunktiAlluvus, String> alates;
	public static volatile SingularAttribute<PiiripunktiAlluvus, String> avaja;
	public static volatile SingularAttribute<PiiripunktiAlluvus, Date> avatud;
	public static volatile SingularAttribute<PiiripunktiAlluvus, String> kommentaar;
	public static volatile SingularAttribute<PiiripunktiAlluvus, String> kuni;
	public static volatile SingularAttribute<PiiripunktiAlluvus, Date> muudetud;
	public static volatile SingularAttribute<PiiripunktiAlluvus, String> muutja;
	public static volatile SingularAttribute<PiiripunktiAlluvus, Date> suletud;
	public static volatile SingularAttribute<PiiripunktiAlluvus, String> sulgeja;
	public static volatile SingularAttribute<PiiripunktiAlluvus, Piiripunkt> piiripunkt;
	public static volatile SingularAttribute<PiiripunktiAlluvus, Vaeosa> vaeosa;
}
