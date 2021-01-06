package Pokemon;
import ru.ifmo.se.pokemon.*;
public class Hippowdon extends Hippopatas{
	public Hippowdon(String name, int lvl) {
		super(name, lvl);
		setStats(108,112,118,68,72,47);
		setType(Type.GROUND);
		addMove(new ThunderFang());

}
}