package esk.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2011-11-27T03:41:47.648+0200")
@StaticMetamodel(SeadusePunkt.class)
public class SeadusePunkt_ {
	public static volatile SingularAttribute<SeadusePunkt, Integer> seadusePunktId;
	public static volatile SingularAttribute<SeadusePunkt, String> avaja;
	public static volatile SingularAttribute<SeadusePunkt, Date> avatud;
	public static volatile SingularAttribute<SeadusePunkt, String> kehtivAlates;
	public static volatile SingularAttribute<SeadusePunkt, String> kehtivKuni;
	public static volatile SingularAttribute<SeadusePunkt, String> kommentaar;
	public static volatile SingularAttribute<SeadusePunkt, Date> muudetud;
	public static volatile SingularAttribute<SeadusePunkt, String> muutja;
	public static volatile SingularAttribute<SeadusePunkt, String> pais;
	public static volatile SingularAttribute<SeadusePunkt, String> paragrahv;
	public static volatile SingularAttribute<SeadusePunkt, Date> suletud;
	public static volatile SingularAttribute<SeadusePunkt, String> sulgeja;
	public static volatile SingularAttribute<SeadusePunkt, String> tekst;
	public static volatile SetAttribute<SeadusePunkt, IsikuSeadusIntsidendi> isikuSeadusIntsidendis;
	public static volatile SetAttribute<SeadusePunkt, ObjektiSeadusIntsidendi> objektiSeadusIntsidendis;
	public static volatile SetAttribute<SeadusePunkt, PiirivalvuriSeadusIntsidendi> piirivalvuriSeadusIntsidendis;
	public static volatile SingularAttribute<SeadusePunkt, Seadus> seadus;
	public static volatile SingularAttribute<SeadusePunkt, SeadusePunkt> seadusePunkt;
	public static volatile SetAttribute<SeadusePunkt, SeadusePunkt> seadusePunkts;
}
