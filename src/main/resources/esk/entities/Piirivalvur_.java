package esk.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2011-11-27T03:41:47.178+0200")
@StaticMetamodel(Piirivalvur.class)
public class Piirivalvur_ {
	public static volatile SingularAttribute<Piirivalvur, Integer> piirivalvurId;
	public static volatile SingularAttribute<Piirivalvur, String> avaja;
	public static volatile SingularAttribute<Piirivalvur, Date> avatud;
	public static volatile SingularAttribute<Piirivalvur, String> eesnimed;
	public static volatile SingularAttribute<Piirivalvur, String> isikukood;
	public static volatile SingularAttribute<Piirivalvur, String> kommentaar;
	public static volatile SingularAttribute<Piirivalvur, Date> muudetud;
	public static volatile SingularAttribute<Piirivalvur, String> muutja;
	public static volatile SingularAttribute<Piirivalvur, String> perekonnanimi;
	public static volatile SingularAttribute<Piirivalvur, String> soduriKood;
	public static volatile SingularAttribute<Piirivalvur, String> sugu;
	public static volatile SingularAttribute<Piirivalvur, Date> suletud;
	public static volatile SingularAttribute<Piirivalvur, String> sulgeja;
	public static volatile SetAttribute<Piirivalvur, AuastmeMuutumine> auastmeMuutumines;
	public static volatile SetAttribute<Piirivalvur, PiirivalvuriKontakt> piirivalvuriKontakts;
	public static volatile SetAttribute<Piirivalvur, PiirivalvurIntsidendi> piirivalvurIntsidendis;
	public static volatile SetAttribute<Piirivalvur, PiirivalvurPiiripunkti> piirivalvurPiiripunktis;
	public static volatile SetAttribute<Piirivalvur, PiirivalvurVaeosa> piirivalvurVaeosas;
	public static volatile SetAttribute<Piirivalvur, PiirivalvurVodikohal> piirivalvurVodikohals;
	public static volatile SetAttribute<Piirivalvur, SeotudKontaktisik> seotudKontaktisiks;
	public static volatile SetAttribute<Piirivalvur, VahtkonnaLiige> vahtkonnaLiiges;
}
