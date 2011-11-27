package esk.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2011-11-27T03:41:46.928+0200")
@StaticMetamodel(ObjektiSeadusIntsidendi.class)
public class ObjektiSeadusIntsidendi_ {
	public static volatile SingularAttribute<ObjektiSeadusIntsidendi, Integer> objektiSeadusIntsidendisId;
	public static volatile SingularAttribute<ObjektiSeadusIntsidendi, Date> alates;
	public static volatile SingularAttribute<ObjektiSeadusIntsidendi, String> avaja;
	public static volatile SingularAttribute<ObjektiSeadusIntsidendi, Date> avatud;
	public static volatile SingularAttribute<ObjektiSeadusIntsidendi, String> kirjeldus;
	public static volatile SingularAttribute<ObjektiSeadusIntsidendi, String> kommentaar;
	public static volatile SingularAttribute<ObjektiSeadusIntsidendi, Date> kuni;
	public static volatile SingularAttribute<ObjektiSeadusIntsidendi, Date> muudetud;
	public static volatile SingularAttribute<ObjektiSeadusIntsidendi, String> muutja;
	public static volatile SingularAttribute<ObjektiSeadusIntsidendi, Date> suletud;
	public static volatile SingularAttribute<ObjektiSeadusIntsidendi, String> sulgeja;
	public static volatile SingularAttribute<ObjektiSeadusIntsidendi, ObjektIntsidendi> objektIntsidendi;
	public static volatile SingularAttribute<ObjektiSeadusIntsidendi, SeadusePunkt> seadusePunkt;
}
