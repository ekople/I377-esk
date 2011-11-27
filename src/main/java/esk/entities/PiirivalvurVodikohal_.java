package esk.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2011-11-27T03:37:57.067+0200")
@StaticMetamodel(PiirivalvurVodikohal.class)
public class PiirivalvurVodikohal_ {
	public static volatile SingularAttribute<PiirivalvurVodikohal, Integer> id;
	public static volatile SingularAttribute<PiirivalvurVodikohal, Date> alates;
	public static volatile SingularAttribute<PiirivalvurVodikohal, String> avaja;
	public static volatile SingularAttribute<PiirivalvurVodikohal, Date> avatud;
	public static volatile SingularAttribute<PiirivalvurVodikohal, String> kommentaar;
	public static volatile SingularAttribute<PiirivalvurVodikohal, Date> kuni;
	public static volatile SingularAttribute<PiirivalvurVodikohal, Date> muudetud;
	public static volatile SingularAttribute<PiirivalvurVodikohal, String> muutja;
	public static volatile SingularAttribute<PiirivalvurVodikohal, Date> suletud;
	public static volatile SingularAttribute<PiirivalvurVodikohal, String> sulgeja;
	public static volatile SingularAttribute<PiirivalvurVodikohal, Piirivalvur> piirivalvur;
	public static volatile SingularAttribute<PiirivalvurVodikohal, Voodikoht> voodikoht;
}
