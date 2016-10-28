package pPokemon;

public class Competition extends Swap {

	public Competition(final String id, final Trainer trainer1,
			final Trainer trainer2, final Pokemon pokemon1, 
			final Pokemon pokemon2) {
		super(id, trainer1, trainer2, pokemon1, pokemon2);
	}
	
	public final void execute() {
		if (this.trainer1 == this.trainer2) {
			System.out.println(
					"Ein Trainer kann nicht gegen sich selbst kaempfen!");
		} else if (!this.trainer1.hasPokemon(this.pokemon1)
				|| !this.trainer2.hasPokemon(this.pokemon2)) {
			System.out.println("Trainer besitzt Pokemon nicht!");
		} else {
			int winner = 2;
			// Wenn Pokemon vom selben Typ, zufaelliger Gewinner!
			if (this.pokemon1.getType() == this.pokemon2.getType()) {
				double rnd = java.lang.Math.random();
				if (rnd > 1 / 2) {
					winner = 1;
				}
			  // Wenn unterschiedlicher Typ, gewinnt Trainer1 im Falle
		      // (Poison||Water)/Fire || Poison/Water
			} else if (((this.pokemon1.getType() == Type.POISON
					|| this.pokemon1.getType() == Type.WATER)
					 &&  this.pokemon2.getType() == Type.FIRE)
					|| (this.pokemon1.getType() == Type.POISON
					 &&  this.pokemon2.getType() == Type.WATER)) {
				winner = 1;
			}
			
			if (winner == 1) {
				trainer2.removePokemon(this.pokemon2);
				trainer1.addPokemon(this.pokemon2);
				System.out.printf("%s gewinnt den Kampf und erhält %s.\n",
						this.trainer1.getFirstname(), this.pokemon2.getName());
			} else {
				trainer1.removePokemon(this.pokemon1);
				trainer2.addPokemon(this.pokemon1);
				System.out.printf("%s gewinnt den Kampf und erhält %s.\n",
						this.trainer2.getFirstname(), this.pokemon1.getName());
				}
			
			this.pokemon1.addCompetition(this);
			this.pokemon2.addCompetition(this);
		}		
	}
	
}
