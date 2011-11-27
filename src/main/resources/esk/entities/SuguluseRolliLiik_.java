package esk.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2011-11-27T03:41:47.703+0200")
@StaticMetamodel(SuguluseRolliLiik.class)
public class SuguluseRolliLiik_ {
	public static volatile SingularAttribute<SuguluseRolliLiik, Integer> suguluseRolliLiikId;
	public static volatile SingularAttribute<SuguluseRolliLiik, String> avaja;
	public static volatile SingularAttribute<SuguluseRolliLiik, Date> avatud;
	public static volatile SingularAttribute<SuguluseRolliLiik, String> kommentaar;
	public static volatile SingularAttribute<SuguluseRolliLiik, Date> muudetud;
	public static volatile SingularAttribute<SuguluseRolliLiik, String> muutja;
	public static volatile SingularAttribute<SuguluseRolliLiik, String> nimetus;
	public static volatile SingularAttribute<SuguluseRolliLiik, String> sugulaneVoiMitte;
	public static volatile SingularAttribute<SuguluseRolliLiik, Date> suletud;
	public static volatile SingularAttribute<SuguluseRolliLiik, String> sulgeja;
	public static volatile SetAttribute<SuguluseRolliLiik, SeotudKontaktisik> seotudKontaktisiks;
}
