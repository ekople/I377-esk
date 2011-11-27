package esk.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2011-11-27T03:37:56.764+0200")
@StaticMetamodel(AuastmeMuutumine.class)
public class AuastmeMuutumine_ {
	public static volatile SingularAttribute<AuastmeMuutumine, Integer> auastmeMuutumineId;
	public static volatile SingularAttribute<AuastmeMuutumine, Date> alates;
	public static volatile SingularAttribute<AuastmeMuutumine, String> avaja;
	public static volatile SingularAttribute<AuastmeMuutumine, Date> avatud;
	public static volatile SingularAttribute<AuastmeMuutumine, String> kommentaar;
	public static volatile SingularAttribute<AuastmeMuutumine, Date> kuni;
	public static volatile SingularAttribute<AuastmeMuutumine, Date> muudetud;
	public static volatile SingularAttribute<AuastmeMuutumine, String> muutja;
	public static volatile SingularAttribute<AuastmeMuutumine, Date> suletud;
	public static volatile SingularAttribute<AuastmeMuutumine, String> sulgeja;
	public static volatile SingularAttribute<AuastmeMuutumine, Auaste> auaste;
	public static volatile SingularAttribute<AuastmeMuutumine, Piirivalvur> piirivalvur;
}
