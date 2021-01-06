package Pokemon;
import ru.ifmo.se.pokemon.*;
public class Attacks {
	
	
	//working
	class Wildcharge extends PhysicalMove{
		public Wildcharge () {
			super (Type.ELECTRIC,90,100);	
		}
		
		protected String describe() {
			return "Uses Wild Charge";
		}
		
		protected void applyOppDamage(Pokemon p, double damage) {
			p.setMod(Stat.HP, (int) damage);
		}
			
	}
	//ROCKSLIDE CHECKED WORKING
	class RockSlide extends PhysicalMove{
		public RockSlide() {
			super(Type.ROCK, 75, 90);
		}
		
		protected String describe() {
			return "uses Rock Slide";
		}
		
		protected void applyOppEffects(Pokemon p) {
			 
			Effect e = new Effect();
			if (Math.random() <= 0.3) e.flinch(p);
			
			 //Rock Slide deals damage and has a 30% chance of causing the target to flinch (if the target has not yet moved).
			//PokÃ©mon with the ability Inner Focus or those behind a Substitute cannot be made to flinch

			//p.setMod(Stat.SPEED, -1);
		}
	}
	
	//need help
	class SmartStrike extends PhysicalMove{
		public SmartStrike () {
			super (Type.STEEL,70,100);//see effect: user never miss
			
		}
		protected String describe(){
			return "Uses Smart Strike";
			
		}
		
		
	}
	
	
	//workup is working
	class WorkUp extends StatusMove{
		public WorkUp () {
			super (Type.NORMAL,0,0);
			
		}
		protected String describe(){
			return "Uses Work Up";
		
			
		}
		protected void applySalfEffects(Pokemon p) {
			Effect e= new Effect();
			e.stat(Stat.ATTACK, +1);//Work Up raises the user's Attack and Special Attack by one stage each.
									//Stats can be raised to a maximum of +6 stages each

			}
		}
	//need help
	/*class Crunch extends PhysicalMove{
		public Crunch () {
			super (Type.DARK,80,100);
			
		}
		protected String describe(){
			return "Uses Crunch";
			
		}
		protected void applyOppEffects(Pokemon p) {
			Effect e= new Effect();
			e.stat(Stats.ATTACK, +1);//Crunch deals damage and has a 20% chance of lowering the target's Defense by one stage.
									//Stats can be lowered to a minimum of -6 stages each.


			}
		}*/

       //facade checked working
	class Facade extends PhysicalMove{
		public Facade () {
			super (Type.NORMAL,70,100);
			
		}
		protected String describe(){
			return "Uses Facade";
			
		}
		protected void applyOppDamage(Pokemon p, double damage){
	        Status pConditon = p.getCondition();
	        if(pConditon.equals(Status.BURN) || pConditon.equals(Status.POISON) || pConditon.equals(Status.PARALYZE)){
	            p.setMod(Stat.HP, (int) damage*2);
	        }
		//Facade deals damage, and hits with double power (140) if the user is burned, poisoned or paralyzed.
									//In the case of a burn, the usual attack-halving still occurs so Facade hits with an effective power of 70.



			}
		}
	//CONFIDE IS WORKING
	class Confide extends StatusMove{
		public Confide () {
			super (Type.NORMAL,0,0);
			
		}
		protected String describe(){
			return "Uses Confide";
			
		}
		protected void applyOppEffects(Pokemon p) {
			Effect e= new Effect();
			e.stat(Stat.ATTACK, -1);//Confide lowers the target's Special Attack by one stage.
									//Stats can be lowered to a minimum of -6 stages each.
			

			}
		}
	//working
	class ThunderFang extends PhysicalMove{
		public ThunderFang () {
			super (Type.ELECTRIC,65,95);
			
		}
		protected String describe(){
			return "Uses Thunder Fang";
			
		}
		protected void applyOppDamage(Pokemon p, double damage) {
			p.setMod(Stat.HP, (int) damage);
		}
		protected void applyOppEffects(Pokemon p) {
			if (Math.random() <= 0.1){
				Effect.flinch(p);
				Effect.paralyze(p);
			}//Thunder Fang deals damage, has a 10% chance of 
									//paralyzing the target, and has a 10% chance of causing the target to flinch (if the target has not yet moved)

			}
		}
	//need help
	class WaterGun extends SpecialMove{
		public WaterGun () {
			super (Type.WATER,40,100);
			
		}
		protected String describe(){
			return "Uses Water Gun";
			
		}
		protected void applyOppDamage(Pokemon p, double damage) {
			//Water Gun deals damage with no additional effect
			p.setMod(Stat.HP, (int) damage);
			}
		}
	/*
	//need help
	class BodySlam extends PhysicalMove{
		public BodaySlam () {
			super (Type.NORMAL,85,100);
			
		}
		protected String describe(){
			return "Uses Body Slam";
			
		}
		protected void applyOppEffects(Pokemon p) {
			Effect e= new Effect();
			e.stat(Stats.ATTACK, -1);//Body Slam deals damage and has a 30% chance of paralyzing the target

			}
		}*/
	//swagger working
	class Swagger extends StatusMove{
		public Swagger () {
			super (Type.NORMAL,0,85);
			
		}
		protected String describe(){
			return "Uses Swagger";
			
		}
		protected void applyOppEffects(Pokemon p) {
			Effect e= new Effect();
			p.setMod(Stat.ATTACK, 2);
		    e.confuse(p);
		    
			//e.stat(Stats.ATTACK, -1);//Swagger confuses the target and raises its Attack by two stages.
									//Stats can be raised to a maximum of +6 stages each
									
			

			}
	}
	
	
	


