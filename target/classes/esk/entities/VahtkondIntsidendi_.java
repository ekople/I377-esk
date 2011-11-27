package esk.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2011-11-27T03:41:47.813+0200")
@StaticMetamodel(VahtkondIntsidendi.class)
public class VahtkondIntsidendi_ {
	public static volatile SingularAttribute<VahtkondIntsidendi, Integer> vahtkondIntsidendisId;
	public static volatile SingularAttribute<VahtkondIntsidendi, Date> alates;
	public static volatile SingularAttribute<VahtkondIntsidendi, String> avaja;
	public static volatile SingularAttribute<VahtkondIntsidendi, Date> avatud;
	public static volatile SingularAttribute<VahtkondIntsidendi, String> kirjeldus;
	public static volatile SingularAttribute<VahtkondIntsidendi, String> kommentaar;
	public static volatile SingularAttribute<VahtkondIntsidendi, Date> kuni;
	public static volatile SingularAttribute<VahtkondIntsidendi, Date> muudetud;
	public static volatile SingularAttribute<VahtkondIntsidendi, String> muutja;
	public static volatile SingularAttribute<VahtkondIntsidendi, Date> suletud;
	public static volatile SingularAttribute<VahtkondIntsidendi, String> sulgeja;
	public static volatile SetAttribute<VahtkondIntsidendi, PiirivalvurIntsidendi> piirivalvurIntsidendis;
	public static volatile SingularAttribute<VahtkondIntsidendi, Intsident> intsident;
	public static volatile SingularAttribute<VahtkondIntsidendi, Vahtkond> vahtkond;
}
