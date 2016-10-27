
public class Swap {

	private String id;
	private Trainer trainer1;
	private Trainer trainer2;
	private Pokemon pokemon1;
	private Pokemon pokemon2;
	private java.util.Date date;
	

	/**
	 * @param id
	 * @param trainer1
	 * @param trainer2
	 * @param pokemon1
	 * @param pokemon2
	 */
	public Swap(final String id, final Trainer trainer1, final Trainer trainer2,
			final Pokemon pokemon1, final Pokemon pokemon2) {
		this.id = id;
		this.trainer1 = trainer1;
		this.trainer2 = trainer2;
		this.pokemon1 = pokemon1;
		this.pokemon2 = pokemon2;
		// TODO Datum pruefen
		this.date = new java.util.Date();
	}
	
	
	public final void execute() {
		if (this.trainer1 == this.trainer2) {
			System.out.println("Nicht getauscht: Trainer identisch!");
		} else if (this.pokemon1.getType() == this.pokemon2.getType()) {
			System.out.println(
					"Pokemon " + this.pokemon1.getName() 
					+ " kann nicht mit "  + this.pokemon2.getName() 
					+ " getauscht werden da beide vom Typ " 
					+ this.pokemon1.getType() + " sind.");
		} else if (!this.pokemon1.isSwapAllow()) {
			System.out.println("Pokemon " + this.pokemon1.getName() 
					+ " ist nicht zum Tausch freigegeben!");
		} else if (!this.pokemon2.isSwapAllow()) {
			System.out.println("Pokemon " + this.pokemon2.getName() 
					+ " ist nicht zum Tausch freigegeben!");
		} else if (!this.trainer1.hasPokemon(pokemon1) 
				&& !this.trainer2.hasPokemon(pokemon2)) {
			System.out.println("Trainer besitzen Pokemon nicht!");
		} else {
			this.trainer1.removePokemon(this.pokemon1);
			this.trainer2.removePokemon(this.pokemon2);
			this.trainer1.addPokemon(this.pokemon2);
			this.trainer2.addPokemon(this.pokemon1);
			System.out.println("Tausch " + this.pokemon1.getName() 
					+ " gegen " + this.pokemon2.getName() + " erfolgreich!");
		}
	}
	/**
	 * @param args
	 */	
	public static void main(final String[] args) {
		

		
	}

}
