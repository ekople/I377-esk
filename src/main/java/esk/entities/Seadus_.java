package esk.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2011-11-27T03:37:57.192+0200")
@StaticMetamodel(Seadus.class)
public class Seadus_ {
	public static volatile SingularAttribute<Seadus, Integer> seaduseId;
	public static volatile SingularAttribute<Seadus, String> avaja;
	public static volatile SingularAttribute<Seadus, Date> avatud;
	public static volatile SingularAttribute<Seadus, String> kehtivAlates;
	public static volatile SingularAttribute<Seadus, String> kehtivKuni;
	public static volatile SingularAttribute<Seadus, String> kommentaar;
	public static volatile SingularAttribute<Seadus, String> kood;
	public static volatile SingularAttribute<Seadus, Date> muudetud;
	public static volatile SingularAttribute<Seadus, String> muutja;
	public static volatile SingularAttribute<Seadus, String> nimetus;
	public static volatile SingularAttribute<Seadus, Date> suletud;
	public static volatile SingularAttribute<Seadus, String> sulgeja;
	public static volatile SetAttribute<Seadus, SeadusePunkt> seadusePunkts;
}
