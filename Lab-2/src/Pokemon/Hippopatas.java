package Pokemon;
import ru.ifmo.se.pokemon.*;
public class Hippopatas extends Pokemon {
	

	public Hippopatas (String name, int lvl) {
		super(name,lvl);
		setType(Type.GROUND);
		setStats (68,72,78,38,42,32);
		setMove(new Facade(), new Confide());
	}
 
}
