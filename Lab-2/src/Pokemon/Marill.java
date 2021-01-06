package Pokemon;
import ru.ifmo.se.pokemon.*;

public class Marill extends Pokemon{
	public Marill(String name, int lvl) {
	super (name,lvl);
	setType(Type.WATER, Type.FAIRY);
	setStats(70,20,50,20,50,40);
	setMove(new Confide(), new WaterGun());
	
	}
}
