package Pokemon;
import ru.ifmo.se.pokemon.*;
public class Main {

		public static void main(String[] args) {
			Battle b = new Battle();
			Pokemon p1 = new Tauros("Tauros", 1);
			Pokemon p2 = new Hippopatas("Hippopotas", 1);
			Pokemon p3 = new Hippowdon("Hippowdow", 1);
			Pokemon p4 = new Azurill("Azurill", 1);
			Pokemon p5 = new Marill("Marill", 1);
			Pokemon p6 = new Azumarill("Azumarill", 1);
			b.addAlly(p1);
			b.addAlly(p2);
			b.addAlly(p3);
			b.addFoe(p4);
			b.addFoe(p5);
			b.addFoe(p6);
			b.go();
		}
	}


