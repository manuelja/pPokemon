package pPokemon;

public class Swap {

	protected String id;
	protected Trainer trainer1;
	protected Trainer trainer2;
	protected Pokemon pokemon1;
	protected Pokemon pokemon2;
	protected java.util.Date date;
	

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
		this.setDate(new java.util.Date());
	}
	
	
	public void execute() {
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
			
			// TODO funktioniert nicht...
			//this.pokemon1.addSwap(this);
			//this.pokemon2.addSwap(this);
		}
	}

	//Copy-constructor
	public Swap (Swap swap) {
		this.id = swap.id;
		this.trainer1 = swap.trainer1;
		this.trainer2 = swap.trainer2;
		this.pokemon1 = swap.pokemon1;
		this.pokemon2 = swap.pokemon2;
		this.date = swap.getDate();
	}

	public java.util.Date getDate() {
		return date;
	}


	private void setDate(java.util.Date date) {
		this.date = date;
	}

}
