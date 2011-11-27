package esk.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2011-11-27T03:37:57.007+0200")
@StaticMetamodel(PiirivalvurIntsidendi.class)
public class PiirivalvurIntsidendi_ {
	public static volatile SingularAttribute<PiirivalvurIntsidendi, Integer> piirivalvurIntsidendisId;
	public static volatile SingularAttribute<PiirivalvurIntsidendi, Date> alates;
	public static volatile SingularAttribute<PiirivalvurIntsidendi, String> avaja;
	public static volatile SingularAttribute<PiirivalvurIntsidendi, Date> avatud;
	public static volatile SingularAttribute<PiirivalvurIntsidendi, String> kirjeldus;
	public static volatile SingularAttribute<PiirivalvurIntsidendi, String> kommentaar;
	public static volatile SingularAttribute<PiirivalvurIntsidendi, Date> kuni;
	public static volatile SingularAttribute<PiirivalvurIntsidendi, Date> muudetud;
	public static volatile SingularAttribute<PiirivalvurIntsidendi, String> muutja;
	public static volatile SingularAttribute<PiirivalvurIntsidendi, Date> suletud;
	public static volatile SingularAttribute<PiirivalvurIntsidendi, String> sulgeja;
	public static volatile SetAttribute<PiirivalvurIntsidendi, PiirivalvuriSeadusIntsidendi> piirivalvuriSeadusIntsidendis;
	public static volatile SingularAttribute<PiirivalvurIntsidendi, Intsident> intsident;
	public static volatile SingularAttribute<PiirivalvurIntsidendi, Piirivalvur> piirivalvur;
	public static volatile SingularAttribute<PiirivalvurIntsidendi, VahtkondIntsidendi> vahtkondIntsidendi;
}
