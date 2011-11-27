package esk.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2011-11-27T03:37:56.869+0200")
@StaticMetamodel(ObjektIntsidendi.class)
public class ObjektIntsidendi_ {
	public static volatile SingularAttribute<ObjektIntsidendi, Integer> objektIntsidendisId;
	public static volatile SingularAttribute<ObjektIntsidendi, Date> alates;
	public static volatile SingularAttribute<ObjektIntsidendi, String> avaja;
	public static volatile SingularAttribute<ObjektIntsidendi, Date> avatud;
	public static volatile SingularAttribute<ObjektIntsidendi, String> kirjeldus;
	public static volatile SingularAttribute<ObjektIntsidendi, String> kommentaar;
	public static volatile SingularAttribute<ObjektIntsidendi, Date> kuni;
	public static volatile SingularAttribute<ObjektIntsidendi, Date> muudetud;
	public static volatile SingularAttribute<ObjektIntsidendi, String> muutja;
	public static volatile SingularAttribute<ObjektIntsidendi, Date> suletud;
	public static volatile SingularAttribute<ObjektIntsidendi, String> sulgeja;
	public static volatile SetAttribute<ObjektIntsidendi, ObjektiSeadusIntsidendi> objektiSeadusIntsidendis;
	public static volatile SingularAttribute<ObjektIntsidendi, Intsident> intsident;
	public static volatile SingularAttribute<ObjektIntsidendi, Objekt> objekt;
}
