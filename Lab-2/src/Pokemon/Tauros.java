package Pokemon;
import ru.ifmo.se.pokemon.*;

public class Tauros extends Pokemon {
	public Tauros(String name,int lvl) {
		super(name,lvl);
		setType(Type.NORMAL);
		setStats(75, 100, 95, 40, 70, 110);
		setMove(new Wildcharge(), new RockSlide(),new SmartStrike(),new WorkUp());
	}
	

}