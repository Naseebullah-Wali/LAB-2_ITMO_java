package Pokemon;
import ru.ifmo.se.pokemon.*;
public class Azumarill extends Marill{
	public Azumarill (String name, int lvl) {
		super(name,lvl);
		setType(Type.WATER, Type.FAIRY);
		setStats(100,50,80,60,80,50);
		addMove(new Swagger());
	}
	

}
