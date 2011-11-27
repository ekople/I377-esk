package esk.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2011-11-27T03:37:57.219+0200")
@StaticMetamodel(SeotudKontaktisik.class)
public class SeotudKontaktisik_ {
	public static volatile SingularAttribute<SeotudKontaktisik, Integer> piirivalvuriKontaktId;
	public static volatile SingularAttribute<SeotudKontaktisik, Date> alates;
	public static volatile SingularAttribute<SeotudKontaktisik, String> avaja;
	public static volatile SingularAttribute<SeotudKontaktisik, Date> avatud;
	public static volatile SingularAttribute<SeotudKontaktisik, String> kommentaar;
	public static volatile SingularAttribute<SeotudKontaktisik, Date> kuni;
	public static volatile SingularAttribute<SeotudKontaktisik, Date> muudetud;
	public static volatile SingularAttribute<SeotudKontaktisik, String> muutja;
	public static volatile SingularAttribute<SeotudKontaktisik, Date> suletud;
	public static volatile SingularAttribute<SeotudKontaktisik, String> sulgeja;
	public static volatile SingularAttribute<SeotudKontaktisik, Piirivalvur> piirivalvur;
	public static volatile SingularAttribute<SeotudKontaktisik, SuguluseRolliLiik> suguluseRolliLiik;
}
