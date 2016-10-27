import java.util.ArrayList;


public class Trainer {

	private String firstname;
	private String lastname;
	
	private ArrayList<Pokemon> hasPokemons;
	

	Trainer(final String pFirstname, final String pLastname) {
		this.firstname = pFirstname;
		this.lastname = pLastname;
		this.hasPokemons = new ArrayList<Pokemon>();
	}
	
	public final String getFirstname() {
		return firstname;
	}

	public final void setFirstname(final String pFirstname) {
		this.firstname = pFirstname;
	}

	public final String getLastname() {
		return lastname;
	}

	public final void setLastname(final String pLastname) {
		this.lastname = pLastname;
	}
	
	public final void addPokemon(final Pokemon pPokemon) {
		hasPokemons.add(pPokemon);
	}
	
	public final boolean hasPokemon(final Pokemon pokemon) {
		return this.hasPokemons.contains(pokemon);
	}
	
	public final Pokemon getPokemon(final int pNo) {
		return hasPokemons.get(pNo);
	}
	
	public final ArrayList<Pokemon> getAllPokemons() {
		return hasPokemons;
	}
	
	public final void removePokemon(final Pokemon pokemon) {
		this.hasPokemons.remove(pokemon);
	}
	
	public final ArrayList<Pokemon> getPoisonPokemons() {
		ArrayList<Pokemon> poison = new ArrayList<Pokemon>();
		for (int i = 0; i < hasPokemons.size(); i++) {
			Pokemon pok = hasPokemons.get(i);
			if (pok.getType() == Type.POISON) {
				poison.add(pok);
			}
		}
		return poison;
	}
}
