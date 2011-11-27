package esk.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2011-11-27T03:41:46.755+0200")
@StaticMetamodel(IsikIntsidendi.class)
public class IsikIntsidendi_ {
	public static volatile SingularAttribute<IsikIntsidendi, Integer> isikIntsidendisId;
	public static volatile SingularAttribute<IsikIntsidendi, Date> alates;
	public static volatile SingularAttribute<IsikIntsidendi, String> avaja;
	public static volatile SingularAttribute<IsikIntsidendi, Date> avatud;
	public static volatile SingularAttribute<IsikIntsidendi, String> kirjeldus;
	public static volatile SingularAttribute<IsikIntsidendi, String> kommentaar;
	public static volatile SingularAttribute<IsikIntsidendi, Date> kuni;
	public static volatile SingularAttribute<IsikIntsidendi, Date> muudetud;
	public static volatile SingularAttribute<IsikIntsidendi, String> muutja;
	public static volatile SingularAttribute<IsikIntsidendi, Date> suletud;
	public static volatile SingularAttribute<IsikIntsidendi, String> sulgeja;
	public static volatile SetAttribute<IsikIntsidendi, IsikuSeadusIntsidendi> isikuSeadusIntsidendis;
	public static volatile SingularAttribute<IsikIntsidendi, Intsident> intsident;
	public static volatile SingularAttribute<IsikIntsidendi, Piiririkkuja> piiririkkuja;
}
