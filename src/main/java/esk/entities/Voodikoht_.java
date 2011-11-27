package esk.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2011-11-27T03:37:57.357+0200")
@StaticMetamodel(Voodikoht.class)
public class Voodikoht_ {
	public static volatile SingularAttribute<Voodikoht, Integer> voodikohtId;
	public static volatile SingularAttribute<Voodikoht, String> avaja;
	public static volatile SingularAttribute<Voodikoht, Date> avatud;
	public static volatile SingularAttribute<Voodikoht, String> kommentaar;
	public static volatile SingularAttribute<Voodikoht, Integer> laius;
	public static volatile SingularAttribute<Voodikoht, Date> muudetud;
	public static volatile SingularAttribute<Voodikoht, String> muutja;
	public static volatile SingularAttribute<Voodikoht, String> number;
	public static volatile SingularAttribute<Voodikoht, Integer> pikkus;
	public static volatile SingularAttribute<Voodikoht, Date> suletud;
	public static volatile SingularAttribute<Voodikoht, String> sulgeja;
	public static volatile SetAttribute<Voodikoht, PiirivalvurVodikohal> piirivalvurVodikohals;
	public static volatile SingularAttribute<Voodikoht, Ruumiyksus> ruumiyksus;
}
