package Pokemon;

import ru.ifmo.se.pokemon.*;

public class Azurill extends Pokemon {
	public Azurill (String name,int lvl) {
		super (name,lvl);
		setType(Type.NORMAL, Type.FAIRY);
		setStats(50,20,40,20,40,20);
		setMove(new Confide(), new WaterGun());
		
		
	}
	

}
