package esk.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2011-11-27T03:41:47.213+0200")
@StaticMetamodel(PiirivalvuriKontakt.class)
public class PiirivalvuriKontakt_ {
	public static volatile SingularAttribute<PiirivalvuriKontakt, Integer> piirivalvuriKontaktId;
	public static volatile SingularAttribute<PiirivalvuriKontakt, Date> alates;
	public static volatile SingularAttribute<PiirivalvuriKontakt, String> avaja;
	public static volatile SingularAttribute<PiirivalvuriKontakt, Date> avatud;
	public static volatile SingularAttribute<PiirivalvuriKontakt, String> kommentaar;
	public static volatile SingularAttribute<PiirivalvuriKontakt, String> kontakt;
	public static volatile SingularAttribute<PiirivalvuriKontakt, Date> kuni;
	public static volatile SingularAttribute<PiirivalvuriKontakt, Date> muudetud;
	public static volatile SingularAttribute<PiirivalvuriKontakt, String> muutja;
	public static volatile SingularAttribute<PiirivalvuriKontakt, String> peamineKontakt;
	public static volatile SingularAttribute<PiirivalvuriKontakt, Date> suletud;
	public static volatile SingularAttribute<PiirivalvuriKontakt, String> sulgeja;
	public static volatile SingularAttribute<PiirivalvuriKontakt, KontaktiLiik> kontaktiLiik;
	public static volatile SingularAttribute<PiirivalvuriKontakt, Piirivalvur> piirivalvur;
}
