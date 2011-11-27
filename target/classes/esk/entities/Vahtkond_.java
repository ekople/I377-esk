package esk.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2011-11-27T03:41:47.783+0200")
@StaticMetamodel(Vahtkond.class)
public class Vahtkond_ {
	public static volatile SingularAttribute<Vahtkond, Integer> vahtkondId;
	public static volatile SingularAttribute<Vahtkond, Date> alates;
	public static volatile SingularAttribute<Vahtkond, String> avaja;
	public static volatile SingularAttribute<Vahtkond, Date> avatud;
	public static volatile SingularAttribute<Vahtkond, String> kommentaar;
	public static volatile SingularAttribute<Vahtkond, String> kood;
	public static volatile SingularAttribute<Vahtkond, Date> kuni;
	public static volatile SingularAttribute<Vahtkond, Date> muudetud;
	public static volatile SingularAttribute<Vahtkond, String> muutja;
	public static volatile SingularAttribute<Vahtkond, String> nimetus;
	public static volatile SingularAttribute<Vahtkond, Date> suletud;
	public static volatile SingularAttribute<Vahtkond, String> sulgeja;
	public static volatile SingularAttribute<Vahtkond, Piiripunkt> piiripunkt;
	public static volatile SingularAttribute<Vahtkond, Vaeosa> vaeosa;
	public static volatile SetAttribute<Vahtkond, VahtkondIntsidendi> vahtkondIntsidendis;
	public static volatile SetAttribute<Vahtkond, VahtkonnaLiige> vahtkonnaLiiges;
	public static volatile SetAttribute<Vahtkond, VahtkonndPiiriloigul> vahtkonndPiiriloiguls;
}
