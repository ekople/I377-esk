package esk.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2011-11-27T03:41:46.783+0200")
@StaticMetamodel(IsikuSeadusIntsidendi.class)
public class IsikuSeadusIntsidendi_ {
	public static volatile SingularAttribute<IsikuSeadusIntsidendi, Integer> isikuSeadusIntsidendisId;
	public static volatile SingularAttribute<IsikuSeadusIntsidendi, Date> alates;
	public static volatile SingularAttribute<IsikuSeadusIntsidendi, String> avaja;
	public static volatile SingularAttribute<IsikuSeadusIntsidendi, Date> avatud;
	public static volatile SingularAttribute<IsikuSeadusIntsidendi, String> kirjeldus;
	public static volatile SingularAttribute<IsikuSeadusIntsidendi, String> kommentaar;
	public static volatile SingularAttribute<IsikuSeadusIntsidendi, Date> kuni;
	public static volatile SingularAttribute<IsikuSeadusIntsidendi, Date> muudetud;
	public static volatile SingularAttribute<IsikuSeadusIntsidendi, String> muutja;
	public static volatile SingularAttribute<IsikuSeadusIntsidendi, Date> suletud;
	public static volatile SingularAttribute<IsikuSeadusIntsidendi, String> sulgeja;
	public static volatile SingularAttribute<IsikuSeadusIntsidendi, IsikIntsidendi> isikIntsidendi;
	public static volatile SingularAttribute<IsikuSeadusIntsidendi, SeadusePunkt> seadusePunkt;
}
